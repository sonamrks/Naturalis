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
     
    public LowSugarsDecorator(SuggestionsComponent suggestionsComponent) {
        super(suggestionsComponent);
    }
    
    @Override
    public void filter() {
        suggestionsComponent.filter();
        lowSugarsFilter();
    }
    
    public void lowSugarsFilter() {
        int size = suggestionsComponent.getCodeList().size();
        int i = 0;
        while(i < size) {
            if(suggestionsComponent.getSugarsList().get(i) > 20) {
                suggestionsComponent.getCaloriesList().remove(i);
                suggestionsComponent.getNameList().remove(i);
                suggestionsComponent.getCodeList().remove(i);
                suggestionsComponent.getProteinList().remove(i);
                suggestionsComponent.getSugarsList().remove(i);  
                size--;
            }
            else {
                i+=1;    
            } 
        }
        
    }
    
}
