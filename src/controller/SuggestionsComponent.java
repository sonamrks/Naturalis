/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Sonam
 */
public class SuggestionsComponent {
    private ItemTableModel itemTableModel;
    
    private ArrayList<Integer> codeList;
    private ArrayList<String> nameList;
    private ArrayList<Integer> proteinList;
    private ArrayList<Integer> sugarsList;
    private ArrayList<Integer> caloriesList;
    
    public SuggestionsComponent() {
        codeList = new ArrayList<Integer>();
        nameList = new ArrayList<String>();
        proteinList = new ArrayList<Integer>();
        sugarsList = new ArrayList<Integer>();
        caloriesList =  new ArrayList<Integer>();     
    }
    
    public SuggestionsComponent(ItemTableModel itemTableModel) {
        this.itemTableModel = itemTableModel;    
    }
    
    public void filter() {
        itemTableModel.getItemInfo();
        codeList = itemTableModel.getCodeList();
        nameList = itemTableModel.getNameList();
        proteinList = itemTableModel.getProteinList();
        sugarsList = itemTableModel.getSugarsList();
        caloriesList = itemTableModel.getCaloriesList();  
    }
    
    public ArrayList<Integer> getCodeList() {
        return codeList;
    }

    public ArrayList<String> getNameList() {
        return nameList;
    }

    public ArrayList<Integer> getProteinList() {
        return proteinList;
    }

    public ArrayList<Integer> getSugarsList() {
        return sugarsList;
    }

    public ArrayList<Integer> getCaloriesList() {
        return caloriesList;
    }
    
    public String getSuggestionString(){
        String suggestion="";
        for(Integer code : codeList){
            suggestion+=code + "\n";
        }
        return suggestion;
    }
    
}