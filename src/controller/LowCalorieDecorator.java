/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
/**
 *
 * @author Sonam
 */
public class LowCalorieDecorator extends Decorator {
    int i;
    SuggestionsComponent suggestionsComponent;
     
    public LowCalorieDecorator(SuggestionsComponent suggestionsComponent) {
                System.out.println("initialized");
        this.suggestionsComponent = suggestionsComponent;

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