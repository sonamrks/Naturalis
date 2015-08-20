/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Product;

/**
 *
 * @author Sonam
 */
public interface ItemFactory {
   /* public Item createItem(String name){
            Item beverage = null;

            try {
                beverage = (Item) Class.forName(name).newInstance();
            }
            catch (Exception e) {
                    System.out.println(e.getMessage());
            }

            return beverage;
    }*/
    public Product createItem(String name);
}
