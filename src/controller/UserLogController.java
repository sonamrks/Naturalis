/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import model.SingleAccessLog;

/**
 *
 * @author AshitaRaghu
 */
public class UserLogController {
    private SingleAccessLog singleAccessLog;
    
    public UserLogController(){
        singleAccessLog = SingleAccessLog.getInstance();
    }
    
    
    public void addLogInEntry(String username,String role){
       Date date= new Date();
       String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
       singleAccessLog.addLogInEntry(username,role,timeStamp); 
    }
    public void addLogOutEntry(String username,String role){
       Date date= new Date();
       String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
       singleAccessLog.addLogOutEntry(username,role,timeStamp); 
    }
    
}
