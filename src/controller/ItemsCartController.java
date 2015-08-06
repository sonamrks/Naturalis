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
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import view.CustomerUI;
import javax.swing.table.TableModel;
import javax.swing.event.*;

public class ItemsCartController implements ListSelectionListener, TableModelListener {
    private ItemsCartTableModel itemsCartTableModel;
    private CustomerUI customerUI;
    public ItemsCartController(CustomerUI customerUI) {
        this.customerUI = customerUI;
        itemsCartTableModel = new ItemsCartTableModel();
        itemsCartTableModel.addTableModelListener(this);
    }
        
    public TableModel getTableModel() {
            return itemsCartTableModel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
    }   

    @Override
    public void tableChanged(TableModelEvent e) {
       try {
            // create a new table model with the new data
            itemsCartTableModel = new ItemsCartTableModel(itemsCartTableModel.getItemCodes(), itemsCartTableModel.getItemNames());
            itemsCartTableModel.addTableModelListener(this);
            // update the JTable with the data
            customerUI.updateTable1();	 
            customerUI.updatePrice();
    } catch(Exception exp) {
            exp.getMessage();
            exp.printStackTrace();
    }
    }

    public void addItem(String ID){
        itemsCartTableModel.addRow(Integer.valueOf(ID));	
    }

    public void removeItem(String ID){
        if (ID.equals("")) {
            JOptionPane.showMessageDialog(null,"Please select an item to delete","No items selected",JOptionPane.ERROR_MESSAGE);
        } else {
            itemsCartTableModel.deleteRow(Integer.valueOf(ID));
        }
    }	
}
