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
public interface SnackComponent extends Item {
    public void addSnack(SnackComponent snack);
    public void removeSnack(SnackComponent snack);
}
