/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Beverage;
import model.Snack;

/**
 *
 * @author Sonam
 */
public class SnackFactory extends ItemFactory {
    public Snack createItem(String name){
		Snack snack = null;
		
		try {
			snack = (Snack) Class.forName(name).newInstance();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return snack;
    }
    
}
