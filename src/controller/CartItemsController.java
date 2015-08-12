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
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import view.CustomerUI;
import javax.swing.table.TableModel;
import javax.swing.event.*;

public class CartItemsController implements ListSelectionListener, TableModelListener {
    private CartItemsTableModel itemsCartTableModel;
    private CustomerUI customerUI;
    Iterator iterator;
  //  private Map<Integer,Item> items;
    private Set<Integer> keys;

    
    public CartItemsController(CustomerUI customerUI) {
        this.customerUI = customerUI;
        itemsCartTableModel = new CartItemsTableModel();
        itemsCartTableModel.addTableModelListener(this);
        iterator = itemsCartTableModel.createIterator();
    }
        
    public TableModel getTableModel() {
            return itemsCartTableModel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
        int firstIndex = selectModel.getMinSelectionIndex();
		
        customerUI.setItemCodeTextField((String) itemsCartTableModel.getValueAt(firstIndex, 0));
    }   

    @Override
    public void tableChanged(TableModelEvent e) {
       try {
            // create a new table model with the new data
            itemsCartTableModel = new CartItemsTableModel(itemsCartTableModel.getItemCodes(), itemsCartTableModel.getItemNames(),itemsCartTableModel.getCartItems(),itemsCartTableModel.getTotalPrice());
            itemsCartTableModel.addTableModelListener(this);
            // update the JTable with the data
            customerUI.updateCartTable();	 
            customerUI.updatePrice();
    } catch(Exception exp) {
            exp.getMessage();
            exp.printStackTrace();
    }
    }

    public void addItem(String ID){
     //   itemsCartTableModel.addRow(Integer.valueOf(ID));	
        itemsCartTableModel.addItem(Integer.valueOf(ID));
    }

    public void removeItem(String ID){
        if (ID.equals("")) {
            JOptionPane.showMessageDialog(null,"Please select an item to delete","No items selected",JOptionPane.ERROR_MESSAGE);
        } else {
         //   itemsCartTableModel.deleteRow(Integer.valueOf(ID));
            iterator.removeItem(Integer.valueOf(ID));
        }
    }	
    
    public double getTotalPrice() {
        return itemsCartTableModel.getTotalPrice();
    }
}
