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
    
    ArrayList<Integer> codeList;
    ArrayList<String> nameList;
    ArrayList<Integer> proteinList;
    ArrayList<Integer> sugarsList;
    ArrayList<Integer> caloriesList;
    
    public SuggestionsComponent() {
        filter();
    }
    
    public void filter() {
        codeList = itemTableModel.getCodeList();
        nameList = itemTableModel.getNameList();
        proteinList = itemTableModel.getProteinList();
        sugarsList = itemTableModel.getSugarsList();
        caloriesList = itemTableModel.getCaloriesList();   
    }
    
}