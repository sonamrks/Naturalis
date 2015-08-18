/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Timestamp;
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
    
    
    public void addLogEntry(String username, String password,String role){
       Date date= new Date();
       String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
       singleAccessLog.addLogEntry(username,password,role,timeStamp); 
    }
    
}
