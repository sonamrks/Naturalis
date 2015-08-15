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
 * @author AshitaRaghu
 */
public class AdminController {
    private Admin admin;
    private ItemTableModel itemsTableModel;
    
    public AdminController(){
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
    public int[] getItemSoldCount(){
        return itemsTableModel.getItemSoldCount();
    }
}
