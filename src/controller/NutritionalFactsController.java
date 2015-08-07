/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CustomerUI;

/**
 *
 * @author AshitaRaghu
 */
public class NutritionalFactsController {
    private NutritionalFactsTableModel nutritionalFactsTableModel;
    private CustomerUI customerUI;
    public NutritionalFactsController(CustomerUI customerUI) {
        this.customerUI = customerUI;
        nutritionalFactsTableModel = new NutritionalFactsTableModel();
    }
    public int[] getInfo(String ID){
        int[] nutritionalFacts = nutritionalFactsTableModel.getInfo(Integer.valueOf(ID));
        return nutritionalFacts;
    }
}
