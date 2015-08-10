/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Sonam
 */import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.table.AbstractTableModel;
import model.DatabaseConnection;
import model.Item;


public class ItemsCartTableModel extends AbstractTableModel {
    private Map<Integer,Item> cartItems;
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private int numcols, numrows;
    private double totalPrice;
    private String name, s, price;
    private Item item;
    
    ItemFactory beverageFactory = new ItemFactory();

    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    public ItemsCartTableModel() {
     cartItems = new HashMap<Integer,Item>();
     itemCodes = new ArrayList<Integer>();
     itemNames = new ArrayList<String>();
     numrows = itemCodes.size();
     numcols = 2;    
    }
    
    public ItemsCartTableModel(List list1, List list2, Map map, double price)  {
        itemCodes = list1;
        itemNames = list2;
        cartItems = map;
        totalPrice = price;
        numrows = itemCodes.size();
        numcols = 2;     
    }
    
    @Override
    public int getColumnCount() {
    // TODO Auto-generated method stub
	return numcols;
    }

    @Override
    public int getRowCount() {
	// TODO Auto-generated method stub
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

    public Map<Integer,Item> getCartItems() {
        return this.cartItems;
    }
    
    public double getTotalPrice() {
        System.out.println("price inside model:" + totalPrice);
	return this.totalPrice;
    }
    
    public void addRow(Integer code) {
        s = "";
        if(!itemCodes.contains(code)) {
            try {
                itemCodes.add(code);
               
                String getName = "SELECT name FROM item WHERE code=?";
                
                PreparedStatement statement = connection.prepareStatement(getName);
                statement.setInt(1,code);
                ResultSet result = statement.executeQuery();
                
                while(result.next()){
                    name = result.getString("name");
                }

                itemNames.add(name);
                
                s = "model." + name;
                item = beverageFactory.createItem(s);
                addPrice(item.getPrice());
                cartItems.put(code,item);
                fireTableRowsInserted(itemCodes.size()-1, numcols-1);
                numrows++;
            }catch(Exception err){
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }
    }   
    public void deleteRow(Integer code) {
            itemCodes.remove(code);
            itemNames.remove("name");
            cartItems.remove(code);
            
            try {
                String getPrice = "SELECT price FROM item WHERE code=?";

                PreparedStatement statement = connection.prepareStatement(getPrice);
                statement.setInt(1,code);
                ResultSet result = statement.executeQuery();

                while(result.next()){
                    price = result.getString("price");
                }
            }
            catch(Exception err){
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
            
            subtractPrice(Double.valueOf(price));
            fireTableRowsDeleted(itemCodes.size(), numcols-1);   
        }
    
    public void addPrice(double price) {
        
        this.totalPrice += price;
        System.out.println("Price inside addprice:" + totalPrice);
    }
    
    public void subtractPrice(double price) {
        this.totalPrice -= price;
    }
}
