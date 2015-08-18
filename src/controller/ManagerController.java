/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Admin;

/**
 *
 * @author Sonam
 */
public class ManagerController {
    private Admin admin;
    private ItemTableModel itemsTableModel;
    
    int[] nutritionalCount = new int[100];
    public int[] lowCalCount = new int[100];
    public String[] lowCalNames = new String[100];
    public int[] highProteinCount = new int[100];
    public String[] highProteinNames = new String[100];
    public int[] lowSugarsCount = new int[100];
    public String[] lowSugarsNames = new String[100];
    
    public ManagerController(){
        admin = new Admin();
        itemsTableModel = new ItemTableModel();
    }
    public void increaseItemCount(Integer count, Integer code){
         admin.increaseItemCount(count,code);
    }
    public void updatePrice(Double price,Integer code){
       admin.updatePrice(price,code);
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
}
