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
public class HighProteinDecorator extends Decorator {
    int i;
     
    public HighProteinDecorator(SuggestionsComponent suggestionsComponent) {
        super(suggestionsComponent);
    }
    
    public void filter() {
        suggestionsComponent.filter();
        highProteinFilter();
    }
    
    public void highProteinFilter() {
        for(Integer protein : suggestionsComponent.proteinList) {
            if(protein > 120) {
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
