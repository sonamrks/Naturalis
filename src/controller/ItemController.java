/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import model.Item;
import view.CustomerUI;

/**
 *
 * @author AshitaRaghu
 */
public class ItemController {
    
    private ItemTableModel itemsTableModel;
   // private CustomerUI customerUI;
    
    
    public ItemController() {
       
        itemsTableModel = new ItemTableModel();
       
    }
    
    public ArrayList<Integer> getCode(){
        return itemsTableModel.getCode();
    }
    public ArrayList<Double> getPrice() {
        return itemsTableModel.getPrice();
    }
    
}
