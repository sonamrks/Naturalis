/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Colleague;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import model.Item;
import view.CustomerUI;

/**
 *
 * @author AshitaRaghu
 */
public class ItemController implements Mediator {
    
    private ItemTableModel itemsTableModel;
    private SuggestionsComponent suggestionsComponent;
    private Decorator decorator;
   // private CustomerUI customerUI;
    private ArrayList <Colleague> colleagues = new ArrayList<Colleague>();
    
    
    public ItemController(int machineID) {
       
        itemsTableModel = new ItemTableModel(machineID);
       
    }
    public ItemController() {
       itemsTableModel = new ItemTableModel();
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
    
    public ArrayList<Integer> getCodeForMachine(Integer machineID) {
        return itemsTableModel.getCodeForMachine(machineID);
    }
    
    public ArrayList<Double> getPriceForMachine(Integer machineID) {
        return itemsTableModel.getPriceForMachine(machineID);
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
    public void addNewItem(String[] itemInfo){
        itemsTableModel.addNewItem(itemInfo);
    }
    
    public void sendMessageToAll(Colleague sender, String type, Integer index, Double value) {
        for (int i = 0; i < colleagues.size(); ++i){
                Colleague c = colleagues.get(i);
                if (c != sender){
                        c.receiveMessage(type, index, value);
                }
        }
    }
    
    public void registerAColleague (Colleague c) {
        colleagues.add(c);
    }
    public double collectMoney(Integer machineID){
        return itemsTableModel.collectMoney(machineID);
    }
    public int[] getCount(int machineID){
        return itemsTableModel.getCount(machineID);
    }
    public int[] getInfo(String ID){
        int[] nutritionalFacts = itemsTableModel.getInfo(Integer.valueOf(ID));
        return nutritionalFacts;
    }
    
}
