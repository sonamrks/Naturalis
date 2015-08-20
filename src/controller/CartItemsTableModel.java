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


public class CartItemsTableModel extends AbstractTableModel implements AbstractList, Observable {
 //   private Map<Integer,Item> cartItems;
    private List<Item> cartItems;
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private int numcols, numrows;
    private double totalPrice;
    private String name, s;
    private double price;
    private Item item;
    private int soldCount,count;
 //   private Set<Observer> observers;
    
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
//     observers = new HashSet<Observer>();
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
       
    public void updateCartTable() {
        fireTableRowsInserted(itemCodes.size()-1, numcols-1);
    }
    
    public void updateSoldCount(Integer code,String action){
        double price=0;
        try {
            String getCount = "SELECT count FROM item WHERE code=?";
            statement = connection.prepareStatement(getCount);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
                count = result.getInt("count");
            }
            String getSoldCount = "SELECT soldCount FROM item WHERE code=?";
            statement = connection.prepareStatement(getSoldCount);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
                soldCount = result.getInt("soldCount");
            }
            String getPrice = "SELECT price from item where code=?";
            statement = connection.prepareStatement(getCount);
            statement.setInt(1,code);
            result = statement.executeQuery();
            while(result.next()){
                price = result.getDouble("price");
            }
            if(action.equals("add")){
                count--;
                soldCount++;
                
                String updateCount = "UPDATE item SET count=? where code=?";
                statement = connection.prepareStatement(updateCount);
                statement.setInt(1,count);
                statement.setInt(2,code);
                statement.executeUpdate();
                
                String updateSoldCount = "UPDATE item SET soldCount=? where code=?";
                statement = connection.prepareStatement(updateSoldCount);
                statement.setInt(1,soldCount);
                statement.setInt(2,code);
                statement.executeUpdate();
                
                double sales = count * price;
                String updateSales = "UPDATE item SET sales=? where code=?";
                statement = connection.prepareStatement(updateSales);
                statement.setDouble(1,sales);
                statement.setInt(2,code);
                statement.executeUpdate();
                
            }
            else{
                count++;
                soldCount--;
                
                String updateCount = "UPDATE item SET count=? where code=?";
                statement = connection.prepareStatement(updateCount);
                statement.setInt(1,count);
                statement.setInt(2,code);
                statement.executeUpdate();
                
                String updateSoldCount = "UPDATE item SET soldCount=? where code=?";
                statement = connection.prepareStatement(updateSoldCount);
                statement.setInt(1,soldCount);
                statement.setInt(2,code);
                statement.executeUpdate();
                
                double sales = count * price;
                String updateSales = "UPDATE item SET sales=? where code=?";
                statement = connection.prepareStatement(updateSales);
                statement.setDouble(1,sales);
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
     //   return null;
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
                System.out.println("price " + price + "total " + totalPrice);

                fireTableRowsDeleted(itemCodes.size(), numcols-1); 
            }
    }
    
  /*  public void removeItem(Integer code) {
        try {
            itemCodes.remove(code);
            itemNames.remove("name");
            String getPrice = "SELECT price FROM item WHERE code=?";
            statement = connection.prepareStatement(getPrice);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
            price = result.getDouble("price");
            }
            
            subtractPrice(price);
            cartItems.remove(item);
            fireTableRowsDeleted(itemCodes.size(), numcols-1);  
        }
        catch(Exception err)
        {
         System.out.println(err.getMessage());
         err.printStackTrace();
        }
    }*/
    
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
    
    public List<Item> getCartItems() {
        return this.cartItems;
    }
    
    public double getTotalPrice() {
	return this.totalPrice;
    }
    
    public void addPrice(double price) {
        
        this.totalPrice += price;
        System.out.println("Price inside addprice:" + totalPrice);
    }
    
    public void subtractPrice(double price) {
        this.totalPrice -= price;
    }
       
    @Override
    public void attachObserver(Observer observer) {
    }
    
    @Override
    public void dettachObserver(Observer observer) {
    }
    
    @Override
    public void notifyObservers() {
        updateCartTable();
    }
}
