/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AshitaRaghu
 */
public class SingleAccessLog {
    
   private static SingleAccessLog singleAccessLog = new SingleAccessLog();
   
   DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
   
   public static SingleAccessLog getInstance(){
        return singleAccessLog;
   }
   private SingleAccessLog() {
  
    }	
   public void addLogInEntry(String username, String role,String timeStamp){
       try {
           String getInfo;
           getInfo = "INSERT into userlog VALUES(?,'login',?,?)";
           PreparedStatement statement = connection.prepareStatement(getInfo);
           statement.setString(1,timeStamp);
           statement.setString(2,username);
           statement.setString(3,role);
           statement.executeUpdate(); 
           
           
       } catch (SQLException ex) {
           Logger.getLogger(SingleAccessLog.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
   public void addLogOutEntry(String username, String role,String timeStamp){
       try {
           String getInfo;
           getInfo = "INSERT into userlog VALUES(?,'logout',?,?)";
           PreparedStatement statement = connection.prepareStatement(getInfo);
           statement.setString(1,timeStamp);
           statement.setString(2,username);
           statement.setString(3,role);
           statement.executeUpdate(); 
           
           
       } catch (SQLException ex) {
           Logger.getLogger(SingleAccessLog.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    
}
