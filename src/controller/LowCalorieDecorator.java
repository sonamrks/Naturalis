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
public class LowCalorieDecorator extends Decorator {
    int i;
     
    public LowCalorieDecorator(SuggestionsComponent suggestionsComponent) {
        super(suggestionsComponent);
    }
    
    public void filter() {
        suggestionsComponent.filter();
        lowCalorieFilter();
    }
    
    public void lowCalorieFilter() {
        for(Integer calories : suggestionsComponent.caloriesList) {
            if(calories > 120) {
                suggestionsComponent.caloriesList.remove(i);
                suggestionsComponent.nameList.remove(i);
                suggestionsComponent.codeList.remove(i);
                suggestionsComponent.proteinList.remove(i);
                suggestionsComponent.sugarsList.remove(i);  
            } 
            i++;
        }
        
    }
    
    
}
