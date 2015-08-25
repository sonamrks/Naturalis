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
    
    private Item item;
    private Component component;
    private Decorator decorator;
    private ArrayList <Colleague> colleagues = new ArrayList<Colleague>();
    
    private int[] nutritionalCount = new int[100];
    private int[] lowCalCount = new int[100];
    private String[] lowCalNames = new String[100];
    private int[] highProteinCount = new int[100];
    private String[] highProteinNames = new String[100];
    private int[] lowSugarsCount = new int[100];
    private String[] lowSugarsNames = new String[100];
    
    public ItemController() {
       item = new Item();
    }
    
    public void generateItemInfo(Integer machineId) {
        item.generateItemInfo(machineId);
    }
    
    public ArrayList<Integer> getCodeForMachine(){
        return item.getCodeForMachine();
    }
    
    public ArrayList<String> getNameListForMachine() {
        return item.getNameListForMachine();
    }
        
    public ArrayList<Double> getPriceForMachine() {
        return item.getPriceForMachine();
    }
    
    public ArrayList<Integer> getCountListForMachine() {
        return item.getCountListForMachine();
    }
    
    public void generateCategoryItemInfo(Integer machineID, String category) {
        item.generateCategoryItemInfo(machineID, category);
    }
     
    public ArrayList<Integer> getCategoryCodeForMachine() {
        return item.getCategoryCodeForMachine();
    }
    
    public ArrayList<Double> getCategoryPriceForMachine() {
        return item.getCategoryPriceForMachine();
    }
    
    public ArrayList<Integer> getCategoryCountForMachine(){
        return item.getCategoryCountForMachine();
    }

    public String getSuggestionList(Boolean[] checkedList){
            component = new SuggestionsComponent(item);
           
            System.out.println("before Size: " + component.getSize());
            
            if(checkedList[0] == true) {
                decorator = new LowCalorieDecorator(component);
                decorator.filter();
            }
            if(checkedList[1] == true){ 
                decorator = new HighProteinDecorator(component);
                decorator.filter();
            }
            if(checkedList[2] == true){  
                decorator = new LowSugarsDecorator(component);
                decorator.filter();
            }
            if(checkedList[0] == false && checkedList[1] == false && checkedList[2] == false) {
                return null; 
            }
            System.out.println("after Size: " + component.getSize());
            return component.getSuggestionString();  
    }
    
    
    
  
    public String getCalorieRangeSuggestions(int low,int high){
        return item.getCalorieRangeSuggestions(low,high);
    }
    
    public int getCategorySoldCount(String category) {
        return item.getCategorySoldCount(category);
    }
    
    public int getCategorySoldCount(String category, String machine) {
        return item.getCategorySoldCount(category,machine);
    }
    
    public ArrayList<Integer> getItemSoldCount(String machine){
        ArrayList<Integer> soldCount =  new ArrayList<Integer>();
        soldCount =  item.getItemSoldCount(machine);
        return soldCount;
    }
    public int[] getNutritionalItemSoldCount(String machine){
        
        nutritionalCount = item.getNutritionalItemSoldCount(machine);
        
        lowCalCount = item.getLowCalCount();
        lowCalNames = item.getLowCalNames();
        highProteinCount = item.getHighProteinCount();
        highProteinNames = item.getHighProteinNames();
        lowSugarsCount = item.getLowSugarsCount();
        lowSugarsNames = item.getLowSugarsNames();
        
       // for(int i=0;i<5;i++)
         //   System.out.println(lowCalNames[i]);
        
        return nutritionalCount;
    }
    
    public int[] getLowCalCount() {
        return lowCalCount;
    }

    public String[] getLowCalNames() {
        return lowCalNames;
    }

    public int[] getHighProteinCount() {
        return highProteinCount;
    }

    public String[] getHighProteinNames() {
        return highProteinNames;
    }

    public int[] getLowSugarsCount() {
        return lowSugarsCount;
    }

    public String[] getLowSugarsNames() {
        return lowSugarsNames;
    }
       
    public void addNewItem(String[] itemInfo){
        item.addNewItem(itemInfo);
    }
    
    public void sendMessageToAll(Colleague sender, String type, String product, Integer index, Double value) {
        for (int i = 0; i < colleagues.size(); ++i){
            Colleague c = colleagues.get(i);
            if (c != sender){
                c.receiveMessage(type, product, index, value);
            }
        }
    }
    
    public void registerAColleague (Colleague c) {
        colleagues.add(c);
    }
    
    public double collectMoney(Integer machineID){
        return item.collectMoney(machineID);
    }
  
    public int[] getInfo(String ID){
        int[] nutritionalFacts = item.getInfo(Integer.valueOf(ID));
        return nutritionalFacts;
    }
     
    public void increaseItemCount(Integer count, Integer code){
       item.increaseItemCount(count,code);
    }
    public void updatePrice(Double price,Integer code){
       item.updatePrice(price,code);
    }
    public double getSales(int machineID){
        return item.getSales(machineID);
    }
}
