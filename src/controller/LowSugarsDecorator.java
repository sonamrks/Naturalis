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
public class LowSugarsDecorator extends Decorator {
    int i;
     
    public LowSugarsDecorator(SuggestionsComponent suggestionsComponent) {
        super(suggestionsComponent);
    }
    
    public void filter() {
        suggestionsComponent.filter();
        lowSugarsFilter();
    }
    
    public void lowSugarsFilter() {
        for(Integer sugars : suggestionsComponent.sugarsList) {
            if(sugars > 120) {
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
