/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import view.Colleague;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import model.Product;
import view.CustomerUI;

/**
 *
 * @author AshitaRaghu
 */
public class ItemController implements Mediator {
    
    private Item itemsTableModel;
    private SuggestionsComponent suggestionsComponent;
    private Decorator decorator;
    private ArrayList <Colleague> colleagues = new ArrayList<Colleague>();
    
    int[] nutritionalCount = new int[100];
    public int[] lowCalCount = new int[100];
    public String[] lowCalNames = new String[100];
    public int[] highProteinCount = new int[100];
    public String[] highProteinNames = new String[100];
    public int[] lowSugarsCount = new int[100];
    public String[] lowSugarsNames = new String[100];
    
    public ItemController() {
       itemsTableModel = new Item();
    }
    
    public void generateItemInfo(Integer machineId) {
        itemsTableModel.generateItemInfo(machineId);
    }
    
    public ArrayList<Integer> getCodeForMachine(){
        return itemsTableModel.getCodeForMachine();
    }
        
    public ArrayList<Double> getPriceForMachine() {
        return itemsTableModel.getPriceForMachine();
    }
     
    public ArrayList<Integer> getCategoryCodeForMachine(Integer machineID, String category) {
        return itemsTableModel.getCategoryCodeForMachine(machineID, category);
    }
    
    public ArrayList<Double> getCategoryPriceForMachine(Integer machineID, String category) {
        return itemsTableModel.getCategoryPriceForMachine(machineID, category);
    }
    
    public ArrayList<Integer> getCategoryCount(int machineID, String category){
        return itemsTableModel.getCategoryCount(machineID, category);
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
  
    public String getCalorieRangeSuggestions(int low,int high){
        return itemsTableModel.getCalorieRangeSuggestions(low,high);
    }

    public ArrayList<Integer> getCountListForMachine(){
        return itemsTableModel.getCountListForMachine();
    }
    
    public int getCategorySoldCount(String category) {
        return itemsTableModel.getCategorySoldCount(category);
    }
    
    public int getCategorySoldCount(String category, String machine) {
        return itemsTableModel.getCategorySoldCount(category,machine);
    }
    
    public ArrayList<Integer> getItemSoldCount(String machine){
        ArrayList<Integer> soldCount =  new ArrayList<Integer>();
        soldCount =  itemsTableModel.getItemSoldCount(machine);
        return soldCount;
    }
    public int[] getNutritionalItemSoldCount(String machine){
        
        nutritionalCount = itemsTableModel.getNutritionalItemSoldCount(machine);
        
        lowCalCount = itemsTableModel.getLowCalCount();
        lowCalNames = itemsTableModel.getLowCalNames();
        highProteinCount = itemsTableModel.getHighProteinCount();
        highProteinNames = itemsTableModel.getHighProteinNames();
        lowSugarsCount = itemsTableModel.getLowSugarsCount();
        lowSugarsNames = itemsTableModel.getLowSugarsNames();
        
       // for(int i=0;i<5;i++)
         //   System.out.println(lowCalNames[i]);
        
        return nutritionalCount;
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
    

    
    public int[] getInfo(String ID){
        int[] nutritionalFacts = itemsTableModel.getInfo(Integer.valueOf(ID));
        return nutritionalFacts;
    }
     
    public void increaseItemCount(Integer count, Integer code){
       itemsTableModel.increaseItemCount(count,code);
    }
    public void updatePrice(Double price,Integer code){
       itemsTableModel.updatePrice(price,code);
    }
    public double getSales(int machineID){
        return itemsTableModel.getSales(machineID);
    }
}
