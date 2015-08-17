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
    
    
    public ItemController(String machine) {
       
        itemsTableModel = new ItemTableModel(machine);
       
    }
    public ItemController() {
       
    }
    
    public String getSuggestionList(Boolean[] checkedList){
            suggestionsComponent = new SuggestionsComponent(itemsTableModel);
           
            System.out.println("before Size: " + suggestionsComponent.getSize());
            
            if(checkedList[0] == true) {
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
            System.out.println("after Size: " + suggestionsComponent.getSize());
            return suggestionsComponent.getSuggestionString();
        
    }
    
    public ArrayList<Integer> getCode(){
        return itemsTableModel.getCode();
    }
    public ArrayList<Double> getPrice() {
        return itemsTableModel.getPrice();
    }
    public String getCalorieRangeSuggestions(int low,int high){
        return itemsTableModel.getCalorieRangeSuggestions(low,high);
    }
    
}
