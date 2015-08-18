/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CustomerUI;

/**
 *
 * @author Sonam
 */
public class PriceController implements Observer {
    private CartItemsTableModel itemsCartTableModel;
    private CustomerUI customerUI;
    
    public PriceController(CustomerUI customerUI,int machineID) {
        this.customerUI = customerUI;
        itemsCartTableModel = new CartItemsTableModel();
    }
    
    public double getTotalPrice() {
        return itemsCartTableModel.getTotalPrice();
    }
    
    public double deductPrice(double price, double deductable){
        double remainingPrice = price - deductable;
        return remainingPrice;
    }
    
    public void Update(String ID){
        
    }
}
