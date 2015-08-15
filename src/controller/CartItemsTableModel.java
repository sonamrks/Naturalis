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
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.DatabaseConnection;
import model.Item;


public class CartItemsTableModel extends AbstractTableModel implements AbstractList {
 //   private Map<Integer,Item> cartItems;
    private List<Item> cartItems;
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private int numcols, numrows;
    private double totalPrice;
    private String name, s;
    private double price;
    private Item item;
    private int soldCount;
    
    ItemFactory beverageFactory = new ItemFactory();

    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
    
    public CartItemsTableModel() {
  //   cartItems = new HashMap<Integer,Item>();
     cartItems = new ArrayList<Item>();
     itemCodes = new ArrayList<Integer>();
     itemNames = new ArrayList<String>();
     numrows = itemCodes.size();
     numcols = 2;    
    }
    
    public CartItemsTableModel(List list1, List list2, List list3, double price)  {
        itemCodes = list1;
        itemNames = list2;
        cartItems = list3;
        totalPrice = price;
        numrows = itemCodes.size();
        numcols = 2;     
    }
    
    public void addItem(Integer code) {
        try {
            itemCodes.add(code);

            String getName = "SELECT name FROM item WHERE code=?";

            statement = connection.prepareStatement(getName);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
                name = result.getString("name");
            }

            itemNames.add(name);

            s = "model." + name;
            item = beverageFactory.createItem(s);
            addPrice(item.getPrice());
    //                cartItems.put(code,item);
            cartItems.add(item);
            fireTableRowsInserted(itemCodes.size()-1, numcols-1);
            numrows++;
            
            
        }
        catch(Exception err)
        {
         System.out.println(err.getMessage());
         err.printStackTrace();
        }
    }
    
    public void reduceSoldCount(Integer code,String action){
        try {
            String getSoldCount = "SELECT soldCount FROM item WHERE code=?";
            statement = connection.prepareStatement(getSoldCount);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
                soldCount = result.getInt("soldCount");
            }
            if(action.equals("reduce")){
                String updateSoldCount = "UPDATE item SET soldCount=? where code=?";
                statement = connection.prepareStatement(updateSoldCount);
                soldCount--;
                statement.setInt(1,soldCount);
                statement.setInt(2,code);
                statement.executeUpdate();
            }
            else{
                String updateSoldCount = "UPDATE item SET soldCount=? where code=?";
                statement = connection.prepareStatement(updateSoldCount);
                soldCount++;
                statement.setInt(1,soldCount);
                statement.setInt(2,code);
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartItemsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Iterator createIterator() {
      return new CartIterator();
    }

    class CartIterator implements Iterator {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                    if (currentIndex >= cartItems.size()) {
                            return false;
                    } else {
                            return true;
                    }
            }

            @Override
            public Item next() {
                    return cartItems.get(currentIndex++);
            }
            
            @Override
            public void removeItem(Integer code) {
                itemCodes.remove(code);
                itemNames.remove("name");
                
                while(hasNext()) {
                    if(next().getCode()== code) {
                        price = cartItems.get(currentIndex).getPrice();
                        cartItems.remove(--currentIndex);
                        break;
                    }
                }
                currentIndex = 0;
           
                subtractPrice(price);
                fireTableRowsDeleted(itemCodes.size(), numcols-1);   
            }
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

  //  public Map<Integer,Item> getCartItems() {
  //      return this.cartItems;
  //  }
    
    public List<Item> getCartItems() {
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
//                cartItems.put(code,item);
                cartItems.add(item);
                fireTableRowsInserted(itemCodes.size()-1, numcols-1);
                numrows++;
            }catch(Exception err){
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }
    }   
    
    public void addPrice(double price) {
        
        this.totalPrice += price;
        System.out.println("Price inside addprice:" + totalPrice);
    }
    
    public void subtractPrice(double price) {
        this.totalPrice -= price;
    }
}
