/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author AshitaRaghu
 */
public interface LoginStrategy {
    public boolean validate(String username, String password, String role,AccessUserController accessUserController);
}
