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
public class Decorator extends SuggestionsComponent {  
    SuggestionsComponent suggestionsComponent;
  
    public Decorator(SuggestionsComponent suggestionsComponent) { 
        this.suggestionsComponent = suggestionsComponent;
    }
    public void filter() {    
    }
    
    public SuggestionsComponent getSuggestionsComponent() {
        return suggestionsComponent;
    }
    
}
