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
   
    public Product createItem(String name);
}
