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
    private Item itemTableModel;
    
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
    
    public SuggestionsComponent(Item itemTableModel) {
        this.itemTableModel = itemTableModel;  
      //  itemTableModel.getItemInfo();
        codeList = itemTableModel.getCodeList();
        nameList = itemTableModel.getNameList();
        proteinList = itemTableModel.getProteinList();
        sugarsList = itemTableModel.getSugarsList();
        caloriesList = itemTableModel.getCaloriesList(); 
    }
    
    public void filter() {
 
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
        String suggestions="";
        for(int i = 0 ;i < codeList.size() ; i++){
            suggestions+=codeList.get(i) + "\t";
            suggestions+=nameList.get(i) + "\t";
            suggestions+=proteinList.get(i) + "\t";
            suggestions+=sugarsList.get(i) + "\t";
            suggestions+=caloriesList.get(i) + "\t";
            suggestions+="\n";
        }
        return suggestions;
    }
    
    public int getSize() {
        return codeList.size();
    }
    
}