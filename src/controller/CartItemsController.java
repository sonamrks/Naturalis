/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Sonam
 */
import view.Observer;
import model.CartItemsTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import view.CustomerUI;
import javax.swing.table.TableModel;
import javax.swing.event.*;
import view.CartItemsPanel;
import view.PaymentPanel;

public class CartItemsController implements ListSelectionListener, TableModelListener {
    private CartItemsTableModel cartItemsTableModel;
    private CustomerUI customerUI;
    private Iterator iterator;
    private List<Observer> observers;
    
    public CartItemsController(CustomerUI customerUI) {
        this.customerUI = customerUI;
        cartItemsTableModel = new CartItemsTableModel();
        cartItemsTableModel.addTableModelListener(this);
        iterator = cartItemsTableModel.createIterator();
        observers = new ArrayList<Observer>();
    }
        
    public TableModel getTableModel() {
        return cartItemsTableModel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
        int firstIndex = selectModel.getMinSelectionIndex();
        customerUI.setItemCodeTextField((String) cartItemsTableModel.getValueAt(firstIndex, 0));
        customerUI.getCartItemsPanel().setItemCodeTextField((String) cartItemsTableModel.getValueAt(firstIndex, 0));
    }   

    @Override
    public void tableChanged(TableModelEvent e) {
       try {
            // create a new table model with the new data
            cartItemsTableModel = new CartItemsTableModel(cartItemsTableModel.getItemCodes(),cartItemsTableModel.getItemNames(),cartItemsTableModel.getItemPrices(),cartItemsTableModel.getPicturePath(),cartItemsTableModel.getItemTypes(),cartItemsTableModel.getCartItems(),cartItemsTableModel.getTotalPrice());
            cartItemsTableModel.addTableModelListener(this);
            // update the JTable with the data
            for(Observer observer : observers) {
                observer.update();	 
            }
        } catch(Exception exp) {
            exp.getMessage();
            exp.printStackTrace();
        }
    }

    public void addItem(String ID){
     //   itemsCartTableModel.addRow(Integer.valueOf(ID));	
        cartItemsTableModel.addItem(Integer.valueOf(ID));
      //  cartItemsTableModel.updateSoldCount(Integer.valueOf(ID),"add");
    }

    public void removeItem(String ID){
        if (ID.equals("")) {
            JOptionPane.showMessageDialog(null,"Please select an item to delete","No items selected",JOptionPane.ERROR_MESSAGE);
        } else {
         //   itemsCartTableModel.deleteRow(Integer.valueOf(ID));
            iterator.removeItem(Integer.valueOf(ID));
     //       itemsCartTableModel.removeItem(Integer.valueOf(ID));
         //   cartItemsTableModel.updateSoldCount(Integer.valueOf(ID),"remove");
        }
    }	
    
    public double getTotalPrice() {
        return cartItemsTableModel.getTotalPrice();
    }
    
    public void removeAllItems() {
        cartItemsTableModel.removeAllItems();
    }
    
    public String getType(Integer code) {
        return cartItemsTableModel.getType(code);
    }
    
    public List<String> getPicturePath(){
        return cartItemsTableModel.getPicturePath();
    }
	
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void dettachObserver(Observer observer) {
        observers.remove(observer);
    }
}
