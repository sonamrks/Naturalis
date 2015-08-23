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
import model.Product;


public class CartItemsTableModel extends AbstractTableModel implements AbstractList, Observable {
 //   private Map<Integer,Item> cartItems;
    private List<Product> cartItems;
    private List<Integer> itemCodes;
    private List<String> itemNames;
    private List<Double> itemPrices;
    private int numcols, numrows;
    private double totalPrice;
    private String name, s;
    private Product item;
    private int soldCount,count;
    private List<String> itemPicturePaths;
 //   private Set<Observer> observers;
    
    ItemFactory beverageFactory = new BeverageFactory();
    ItemFactory snackFactory = new SnackFactory();

    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
    
    public CartItemsTableModel() {
  //   cartItems = new HashMap<Integer,Item>();
     itemCodes = new ArrayList<Integer>();
     itemNames = new ArrayList<String>();
     itemPrices = new ArrayList<Double>();
     itemPicturePaths = new ArrayList<String>();
     cartItems = new ArrayList<Product>();
//     observers = new HashSet<Observer>();
     numrows = itemCodes.size();
     numcols = 2;    
    }
    
    public CartItemsTableModel(List list1, List list2, List list3, List list4, List list5, double price)  {
        itemCodes = list1;
        itemNames = list2;
        itemPrices = list3;
        itemPicturePaths = list4;
        cartItems = list5;
        totalPrice = price;
        numrows = itemCodes.size();
        numcols = 2;     
    }
    
    public void addItem(Integer code) {
        try {
            String getName = "SELECT name FROM item WHERE code=?";
            
            statement = connection.prepareStatement(getName);
            statement.setInt(1,code);
            result = statement.executeQuery();

            while(result.next()){
                name = result.getString("name");
            }
            s = "model." + name;
            if(code < 200) 
                item = (model.Beverage) beverageFactory.createItem(s);
            else if(code > 200)
                item = (model.Snack) snackFactory.createItem(s);
            
            itemCodes.add(code);
            itemNames.add(name);
            itemPicturePaths.add(item.getPicturePath());
            itemPrices.add(item.getPrice());
            cartItems.add(item);            
        //    addPrice(item.getPrice());
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
            statement = connection.prepareStatement(getPrice);
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
            public Integer next() {
                    return itemCodes.get(currentIndex++);
            }
            
            @Override
            public void removeItem(Integer code) {
                while(hasNext()) {
               //     System.out.println("hello1: " + next().getCode());
                    if(next().equals(code)) {
                        itemCodes.remove(--currentIndex);
                        itemNames.remove(currentIndex);  
                        System.out.println("Price to be subr: " + itemPrices.get(currentIndex));
                    //    subtractPrice(itemPrices.get(currentIndex));
                        itemPrices.remove(currentIndex);   
                        itemPicturePaths.remove(currentIndex); 
                        cartItems.remove(currentIndex);
                        break;
                    }
                }
                currentIndex = 0;

                fireTableRowsDeleted(itemCodes.size(), numcols-1); 
            }
    }
         
    public double getTotalPrice() {
        totalPrice = 0;
        for(Double price : itemPrices) {
            totalPrice = totalPrice + price;
        }
	return totalPrice;
    }
  /*        
    public void addPrice(double price) {       
        totalPrice += price;
    }
    
    public void subtractPrice(double price) {
        System.out.println("Price total: " + totalPrice);
        totalPrice -= price;
        System.out.println("Price total: " + totalPrice);
    }*/
    
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
    
    public List getPicturePath() {
	return this.itemPicturePaths;
    }
    
    public List getItemPrices() {
	return this.itemPrices;
    }
        
    public List<Product> getCartItems() {
        return this.cartItems;
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
