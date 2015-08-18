/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AccessUser;

/**
 *
 * @author AshitaRaghu
 */
public class AccessUserController {
    private AccessUser accessUser;
    private String[] userNameList;
    private String[] passwordList;
    private boolean validateOK;
    
    public AccessUserController(){
        this.accessUser = new AccessUser();
    }
    
    public boolean validateAccess(String username, String password,String role){
        accessUser.getInfo(role);
        userNameList = accessUser.getUserName();
        passwordList = accessUser.getPassword();
        
        for(int i=0; i<userNameList.length; i++){
            if((username.equals(userNameList[i])) && (password.equals(passwordList[i]))){
                validateOK = true; 
            }
        }
        return validateOK;
    }
    
}
