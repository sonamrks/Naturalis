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
import static model.DatabaseConnection.dbConnectionInstance;

/**
 *
 * @author AshitaRaghu
 */
public class SingleAccessLog {
    
   private static SingleAccessLog singleAccessLog;
   
   DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
   
   public static SingleAccessLog getInstance(){
        singleAccessLog = new SingleAccessLog();
    return singleAccessLog;
    }
   private SingleAccessLog() {
  
    }	
   public void addLogEntry(String username, String password, String role,String timeStamp){
       try {
           String getInfo;
           getInfo = "INSERT into userlog VALUES(?,'login',?,?)";
           PreparedStatement statement = connection.prepareStatement(getInfo);
           statement.setString(1,timeStamp);
           statement.setString(2,username);
           statement.setString(3,password);
           statement.executeUpdate(); 
           
           
       } catch (SQLException ex) {
           Logger.getLogger(SingleAccessLog.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    
}
