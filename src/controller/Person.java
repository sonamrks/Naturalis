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
public class Person {
    Role role;
    
    public void setRole(Role role){
        this.role = role;
    }
    public void filterView(){
        role.filterView();
    }
}
