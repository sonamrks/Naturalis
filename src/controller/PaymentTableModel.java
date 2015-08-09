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
    double balance=0;
    
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
    
    public double payUsingCard(double price, int cardNumber){
        boolean balance_ok=false;
        try {
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            
            String getBalance = "SELECT balance FROM card where number=?";
            
            PreparedStatement statement = connection.prepareStatement(getBalance);
            statement.setInt(1, cardNumber);
            
            ResultSet result = statement.executeQuery();
            while(result.next()){
                balance = result.getDouble("balance");
            }
            
            if(balance>=price){
                balance_ok = true;
                balance-= price;
            }
            
            if(balance_ok==true){
                String updateBalance = "UPDATE card SET balance=? where number=?";
                statement = connection.prepareStatement(updateBalance);
                statement.setDouble(1,balance);
                statement.setInt(2,cardNumber);
                statement.executeUpdate();
                
            }
            else 
                balance = -1;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return balance;
    }
    
    
}
