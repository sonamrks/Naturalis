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
     
    public LowCalorieDecorator(Component component) {
          super(component);
    }
    
    @Override
    public void filter() {
        component.filter();
        lowCalorieFilter();
    }
    public void lowCalorieFilter() {
      int size = component.getCodeList().size();
      int i = 0;
      while(i < size) {
          if(component.getCaloriesList().get(i) > 120) {
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