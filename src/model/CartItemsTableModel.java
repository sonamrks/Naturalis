/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.AbstractList;
import controller.BeverageFactory;
import controller.CartIterator;
import controller.ItemFactory;
import controller.Iterator;
import view.Observer;
import controller.SnackFactory;
/**
 *
 * @author Sonam
 */import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.table.AbstractTableModel;

public class CartItemsTableModel extends AbstractTableModel implements AbstractList, Observable {
    private List<Product> cartItems;
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private List<Double> itemPrices;
    private List<String> itemPicturePaths;
    private List<String> itemTypes;
    private int numcols, numrows;
    private double totalPrice;
    private String name;
    
    ItemFactory beverageFactory = BeverageFactory.getBeverageFactoryInstance();
    ItemFactory snackFactory = SnackFactory.getSnackFactoryInstance();

    DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
    
    public CartItemsTableModel() {
     itemCodes = new ArrayList<Integer>();
     itemNames = new ArrayList<String>();
     itemPrices = new ArrayList<Double>();
     itemPicturePaths = new ArrayList<String>();
     itemTypes = new ArrayList<String>();
     cartItems = new ArrayList<Product>();
     numrows = itemCodes.size();
     numcols = 2;    
    }
    
    public CartItemsTableModel(List list1, List list2, List list3, List list4, List list5, List list6, double price)  {
        itemCodes = list1;
        itemNames = list2;
        itemPrices = list3;
        itemPicturePaths = list4;
        itemTypes = list5;
        cartItems = list6;
        totalPrice = price;
        numrows = itemCodes.size();
        numcols = 2;     
    }
    
    public void addItem(Integer code) {
        Product item = null;
        try {
            String getName = "SELECT name FROM item WHERE code=?";
            
            statement = connection.prepareStatement(getName);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
                name = result.getString("name");
            }
            String s = "model." + name;
            if(code < 200) 
                item = (model.Beverage) beverageFactory.createItem(s);
            else if(code > 200)
                item = (model.Snack) snackFactory.createItem(s);
            
            itemCodes.add(code);
            itemNames.add(name);
            itemPicturePaths.add(item.getPicturePath());
            itemTypes.add(item.getType());
            itemPrices.add(item.getPrice());
            cartItems.add(item);  
            numrows++;  
            notifyObservers();
        }
        catch(Exception err)
        {
         System.out.println(err.getMessage());
         err.printStackTrace();
        }
    }
       
    public void updateAddToCartTable() {
        fireTableRowsInserted(itemCodes.size()-1, numcols-1);
    }
    
    public void updateRemoveFromCartTable(int size, int cols) {
        fireTableRowsDeleted(size, cols);
    }

    @Override
    public Iterator createIterator() {
      return new CartIterator(this);
    }
         
    public double getTotalPrice() {
        totalPrice = 0;
        for(Double price : itemPrices) {
            totalPrice = totalPrice + price;
        }
	return totalPrice;
    }
    
    public void removeAllItems() {
        itemCodes.clear();
        itemNames.clear();
        itemPicturePaths.clear();
        itemPrices.clear();
        itemTypes.clear();
        cartItems.clear(); 
        
        fireTableRowsDeleted(itemCodes.size(), numcols-1);
    }
  
    @Override
    public int getColumnCount() {
	return numcols;
    }

    @Override
    public int getRowCount() {
	return numrows;
    }
    
    @Override
    public String getValueAt(int row, int col) {
      	try {
            if (col == 0) 
                return Integer.toString(itemCodes.get(row));
            else if (col == 1)
                return itemNames.get(row);
            else
		   throw new Exception("Error: invalid column index in itemlist table");
        } catch (Exception e) {
            e.getMessage();
            return null;
	}
    }        
    @Override
    public boolean isCellEditable(int rowIndex, int colIndex) {
	return false;
    }
        
    @Override
    public Class<?> getColumnClass(int col) {
	return getValueAt(0, col).getClass();
    }
        
    @Override
    public String getColumnName(int col) {
        String colName = null;
        try {
            if (col == 0) 
            	   colName = "Code";
            else if (col == 1)
            	   colName = "Name";
            else 
                throw new Exception("Access to invalid column number in itemlist table");
        }
        catch (Exception err) {
           return err.toString();
        }  
        return colName;
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int col) {
    }
    
    public List getItemCodes() {
	return this.itemCodes;
    }
    
    public List getItemNames() {
	return this.itemNames;
    }
    
    public List getPicturePath() {
	return this.itemPicturePaths;
    }
    
    public List getItemTypes() {
	return this.itemTypes;
    }
    
    public List getItemPrices() {
	return this.itemPrices;
    }
        
    public List<Product> getCartItems() {
        return this.cartItems;
    }
    
    public String getType(Integer code) {
        return itemTypes.get(itemCodes.indexOf(code));
    }
       
    @Override
    public void attachObserver(Observer observer) {
    }
    
    @Override
    public void dettachObserver(Observer observer) {
    }
    
    @Override
    public void notifyObservers() {
        updateAddToCartTable();
    }
}
