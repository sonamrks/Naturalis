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
public class ManagerRole implements Role {
    private AdminManagerUI adminManagerUI;

    public ManagerRole(ItemController itemController) {
        adminManagerUI = new AdminManagerUI(itemController);
    }
    public void filterView(){
        adminManagerUI.filterManagerView();
    }
}
