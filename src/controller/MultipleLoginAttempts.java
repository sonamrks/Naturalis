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
public class MultipleLoginAttempts implements LoginStrategy{
    
    public boolean validate(String username, String password, String role,AccessUserController accessUserController) {
       boolean validateOK = accessUserController.validateAccess(username, password, role);
       return validateOK;
    }
}
