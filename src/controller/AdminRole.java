/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.AdminManagerUI;

/**
 *
 * @author Sonam
 */
public class AdminRole implements Role{
    private AdminManagerUI adminManagerUI;
    public AdminRole() {
        adminManagerUI = new AdminManagerUI(new ItemController(),4201);
    }
    public void filterView(){
        
        adminManagerUI.filterAdminView();
    }
    
}
