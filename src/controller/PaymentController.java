/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Item;
import view.CustomerUI;

/**
 *
 * @author Sonam
 */
public class PaymentController {
    private ItemsCartTableModel itemsCartTableModel;
    private CustomerUI customerUI;
    private List<Item> items;
    private double totalPrice;
    
    public void getItems() {
        items = itemsCartTableModel.getCartItems();
    }
    
    public void calculateTotalPrice() {
        for(Item item: items) {
            totalPrice += item.getPrice();
        }
    }
    
}
