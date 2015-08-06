/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.*;
import model.Item;
import view.CustomerUI;

/**
 *
 * @author Sonam
 */
public class PaymentController {
    private ItemsCartTableModel itemsCartTableModel;
    private CustomerUI customerUI;
    private Map<Integer,Item> items;
    private double totalPrice;
    
    public double calculateTotalPrice() {
        items = itemsCartTableModel.getCartItems();
        for(Item item: items.values()) {
            System.out.println("price value: " + item.getPrice());
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    
}
