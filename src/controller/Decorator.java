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
public class Decorator extends SuggestionsComponent {  
    Component component;
  
   public Decorator(Component component) { 
        this.component = component;
    }
   
    
    /*public SuggestionsComponent getSuggestionsComponent() {
//        return suggestionsComponent;
    }*/
    
}
