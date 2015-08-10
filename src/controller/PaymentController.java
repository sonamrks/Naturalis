/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.Item;
import view.CustomerUI;

/**
 *
 * @author Sonam
 */
public class PaymentController implements ListSelectionListener, TableModelListener {
    
    private ItemsCartTableModel itemsCartTableModel;
    private PaymentTableModel paymentTableModel;
    private CustomerUI customerUI;
    private Map<Integer,Item> items;
    private Set<Integer> keys;
    private double totalPrice;
    
    public PaymentController(CustomerUI customerUI) { 
        itemsCartTableModel = new ItemsCartTableModel();
        itemsCartTableModel.addTableModelListener(this);
        paymentTableModel = new PaymentTableModel();
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
            itemsCartTableModel = new ItemsCartTableModel(itemsCartTableModel.getItemCodes(), itemsCartTableModel.getItemNames(),itemsCartTableModel.getCartItems());
            itemsCartTableModel.addTableModelListener(this);
            // update the JTable with the data
            System.out.println("inside table model listener");
            customerUI.updatePrice();
    } catch(Exception exp) {
            exp.getMessage();
            exp.printStackTrace();
    }
    }
    
    public double calculateTotalPrice() {
        items = itemsCartTableModel.getCartItems();
        keys = items.keySet();
        for(Integer code: keys) {
            System.out.println("price value here: " + items.get(code).getPrice());
            totalPrice += items.get(code).getPrice();
        }
        return totalPrice;
    }
    
    public double deductPrice(double price, double deductable){
        double remainingPrice = price - deductable;
        return remainingPrice;
    }
    public int addNewCard(String name, int cost){
        return(paymentTableModel.addNewCard(name,cost));
    }
    public double payUsingCard(double price, int cardNumber){
        return(paymentTableModel.payUsingCard(price,cardNumber));
    }
    
}
