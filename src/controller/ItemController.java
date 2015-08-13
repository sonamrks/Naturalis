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
    private SuggestionsComponent suggestionsComponent;
    private Decorator decorator;
   // private CustomerUI customerUI;
    
    
    public ItemController() {
       
        itemsTableModel = new ItemTableModel();
       
    }
    public String getSuggestionList(Boolean[] checkedList){
            suggestionsComponent = new SuggestionsComponent();
           
            if(checkedList[0] == true) {
                 System.out.println("hello"+checkedList[0]);
                decorator = new LowCalorieDecorator(suggestionsComponent);
                decorator.filter();
            }
            if(checkedList[1] == true){ 
                decorator = new HighProteinDecorator(suggestionsComponent);
                decorator.filter();
            }
            if(checkedList[2] == true){  
                decorator = new LowSugarsDecorator(suggestionsComponent);
                decorator.filter();
            }
            return suggestionsComponent.getSuggestionString();
        
    }
    
    public ArrayList<Integer> getCode(){
        return itemsTableModel.getCode();
    }
    public ArrayList<Double> getPrice() {
        return itemsTableModel.getPrice();
    }
    
}
