/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sonam
 */
public interface Snack extends Item {
    public void addSnack(Snack snack);
    public void removeSnack(Snack snack);
}
