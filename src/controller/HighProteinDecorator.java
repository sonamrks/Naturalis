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
     
    public HighProteinDecorator(Component component) {
        super(component);
    }
    
    @Override
    public void filter() {
        component.filter();
        highProteinFilter();
    }
    
    public void highProteinFilter() {
        int size = component.getCodeList().size();
        int i = 0;
        while(i < size) {
            if(component.getProteinList().get(i) < 4) {
                component.getCaloriesList().remove(i);
                component.getNameList().remove(i);
                component.getCodeList().remove(i);
                component.getProteinList().remove(i);
                component.getSugarsList().remove(i);  
                size--;
            }
            else {
                i+=1;    
            } 
        }       
    }   
}
