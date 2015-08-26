/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AshitaRaghu
 */
public class AccessUser {
    private int id;
    private String[] userNameList = new String[10];
    private String[] passwordList = new String[10];
    
    DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
    
    public void getInfo(String role){
        try {
            String getInfo;
                getInfo = "SELECT username,password FROM accessuser where role=?";
            PreparedStatement statement = connection.prepareStatement(getInfo);
            statement.setString(1, role);
            ResultSet result = statement.executeQuery();
            
            int i=0;
            while(result.next())
            {
               userNameList[i] = result.getString("username");
               passwordList[i] = result.getString("password");
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        
    }
    
    public String[] getUserName(){
        return userNameList;
    }
    public String[] getPassword(){
        return passwordList;
    }
}

