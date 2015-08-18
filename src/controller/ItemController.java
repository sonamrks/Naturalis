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
    
    
    public ItemController(int machineID) {
       
        itemsTableModel = new ItemTableModel(machineID);
       
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
      public ArrayList<Integer> setProtein(){
        return itemsTableModel.setProtein();
    }
    public ArrayList<Integer> setSugars(){
        return itemsTableModel.setSugars();
    }
    public ArrayList<Integer> setCarbohydrates(){
        return itemsTableModel.setCarbohydrates();
    }
    public ArrayList<Integer> setCalories(){
        return itemsTableModel.setCalories();
    }
    public ArrayList<Double> setPrice() {
        return itemsTableModel.setPrice();
    }
    public ArrayList<Integer> setCount(){
        return itemsTableModel.setCount();
    }
    public int getCategorySoldCount(String category){
        return itemsTableModel.getCategorySoldCount(category);
    }
   
    public int getCategorySoldCount(String category, String machine) {
        return itemsTableModel.getCategorySoldCount(category,machine);
    }
    
    public int[] getItemSoldCount(String machine){
        int[] soldCount =  itemsTableModel.getItemSoldCount(machine);
        return soldCount;
    }
    public int[] getNutritionalItemSoldCount(String machine){
        return itemsTableModel.getNutritionalItemSoldCount(machine);
    }
    
}
