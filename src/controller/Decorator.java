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
public class Decorator implements Component {  
    Component component;
  
    public Decorator(Component component) { 
        this.component = component;
    }
    
    @Override
    public void filter() {
    }
    @Override
    public ArrayList<Integer> getCodeList() {
        return null;
    }
    @Override
    public ArrayList<String> getNameList() {
        return null;
    }
    @Override
    public ArrayList<Integer> getProteinList() {
        return null;
    }
    @Override
    public ArrayList<Integer> getSugarsList() {
        return null;    
    }
    @Override
    public ArrayList<Integer> getCaloriesList() {
        return null;    
    }
    @Override
    public int getSize() {
        return 0;
    }
    @Override
    public String getSuggestionString() {
        return null;
    }
    
}
