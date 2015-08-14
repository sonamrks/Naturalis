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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AshitaRaghu
 */
public class Admin {
    
    private String username;
    private String password;
    
    
    
    private int count;
    
    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    PreparedStatement statement;
    
     
    
    public void increaseItemCount(Integer count,Integer code){
        
        try {
            String updateBalance = "UPDATE item SET count=? where code=?";
            statement = connection.prepareStatement(updateBalance);
            statement.setInt(1,count);
            statement.setInt(2,code);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void updatePrice(Double price,Integer code){
          try {
            String updateBalance = "UPDATE item SET price=? where code=?";
            statement = connection.prepareStatement(updateBalance);
            statement.setDouble(1,price);
            statement.setInt(2,code);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    } 
    
}
