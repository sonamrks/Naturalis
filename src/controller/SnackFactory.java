/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Beverage;
import model.SnackComponent;

/**
 *
 * @author Sonam
 */
public class SnackFactory implements ItemFactory {
    public SnackComponent createItem(String name){
		SnackComponent snack = null;
		
		try {
			snack = (SnackComponent) Class.forName(name).newInstance();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return snack;
    }
    
}
