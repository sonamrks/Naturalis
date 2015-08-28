/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Item;
import view.Collegue;
import java.util.ArrayList;

/**
 *
 * @author AshitaRaghu
 */
public class ItemController implements Mediator {
    
    private static ItemController itemControllerInstance = new ItemController();
    private Item item;
    private Component component;
    private Decorator decorator;
    private ArrayList <Collegue> collegues;
    
    private ArrayList<Integer> nutritionalCount = new ArrayList<Integer>();
    private ArrayList<Integer> lowCalCount = new ArrayList<Integer>();
    private ArrayList<String> lowCalNames = new ArrayList<String>();
    private ArrayList<Integer> highProteinCount = new ArrayList<Integer>();
    private ArrayList<String> highProteinNames = new ArrayList<String>();
    private ArrayList<Integer> lowSugarsCount = new ArrayList<Integer>();
    private ArrayList<String> lowSugarsNames = new ArrayList<String>();
    
    protected ItemController() {
       item = new Item();
       collegues = new ArrayList<Collegue>();
    }
    
    public static ItemController getItemControllerInstance(){
        return itemControllerInstance;
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

    public ArrayList<String> getCategoryPicturePathForMachine(){
        return item.getCategoryPicturePathForMachine();
    }
    public String getSuggestionList(Boolean[] checkedList){
            component = new SuggestionsComponent(item);
            
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
            return component.getSuggestionString();  
    }
  
    public String getCalorieRangeSuggestions(int low,int high){
        return item.getCalorieRangeSuggestions(low,high);
    }
    
    public int getCategorySoldCount(String category) {
        return item.getCategorySoldCount(category);
    }
    
    public int getCategorySoldCount(String category, Integer machineID) {
        return item.getCategorySoldCount(category,machineID);
    }
    
    public ArrayList<Integer> getItemSoldCount(Integer machine){
        return item.getItemSoldCount(machine);
    }
    
    public ArrayList<Integer> getNutritionalItemSoldCount(Integer machine){
        
        nutritionalCount = item.getNutritionalItemSoldCount(machine);
        
        lowCalCount = item.getLowCalCount();
        lowCalNames = item.getLowCalNames();
        highProteinCount = item.getHighProteinCount();
        highProteinNames = item.getHighProteinNames();
        lowSugarsCount = item.getLowSugarsCount();
        lowSugarsNames = item.getLowSugarsNames();
        
        return nutritionalCount;
    }
    
    public ArrayList<Integer> getLowCalCount() {
        return lowCalCount;
    }

    public ArrayList<String> getLowCalNames() {
        return lowCalNames;
    }

    public ArrayList<Integer> getHighProteinCount() {
        return highProteinCount;
    }

    public ArrayList<String> getHighProteinNames() {
        return highProteinNames;
    }

    public ArrayList<Integer> getLowSugarsCount() {
        return lowSugarsCount;
    }

    public ArrayList<String> getLowSugarsNames() {
        return lowSugarsNames;
    }
       
    public void addNewItem(String[] itemInfo){
        item.addNewItem(itemInfo);
    }
    
    public void addNewMachine(Integer machineID) {
        item.addNewMachine(machineID);
    }
    
    public ArrayList<Integer> getMachines() {
        return item.getMachines();
    }
    
    @Override
    public void sendMessageToAll(Collegue sender, String type, String product, Integer code, Double value) {
        for (int i = 0; i < collegues.size(); ++i){
            Collegue c = collegues.get(i);
            if (c != sender){
                c.receiveMessage(type, product, code, value);
            }
        }
    }
    
    @Override
    public void registerACollegue (Collegue c) {
        collegues.add(c);
    }
    
    public double collectMoney(Integer machineID){
        return item.collectMoney(machineID);
    }
  
    public ArrayList<Integer> getInfo(String ID){
        return item.getInfo(Integer.valueOf(ID));
    }
     
    public void decreaseItemCount(Integer code, Integer machineID){
       item.decreaseItemCount(code,machineID);
    }
    
    public void increaseItemCount(Integer code, Integer machineID){
       item.increaseItemCount(code, machineID);
    }
        
    public void updatePrice(Double price,Integer code){
       item.updatePrice(price,code);
    }
    public double getSales(int machineID){
        return item.getSales(machineID);
    }
}
