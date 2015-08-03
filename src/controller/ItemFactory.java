/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.BeverageComponent;
import model.SnackComponent;

/**
 *
 * @author Sonam
 */
public interface ItemFactory {
    public BeverageComponent createItem(String name);
}
