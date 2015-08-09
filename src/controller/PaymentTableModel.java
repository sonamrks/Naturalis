/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DatabaseConnection;

/**
 *
 * @author AshitaRaghu
 */
public class PaymentTableModel {
    int cardNumber;
    
    public int addNewCard(String name,int cost){
        try {
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String insertQuery = "INSERT INTO card VALUES(?,?,?)";
            
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setString(1,null);
            statement.setString(2, name);
            statement.setInt(3, cost);
            
            statement.executeUpdate(); 
            
            String getCardNumber = "SELECT number FROM card where name=?";
            statement = connection.prepareStatement(getCardNumber);
            statement.setString(1, name);
            
            ResultSet result = statement.executeQuery();
                
                while(result.next()){
                     cardNumber = result.getInt("number");
                }
            

           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cardNumber;
    }
    
    
}
