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
 * @author Sonam
 */
public class SmartCard {
    private Integer cardNumber;
    private String name;
    private Double balance;
    
    DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
    Connection connection = dbConnection.getConnection();
    PreparedStatement statement;
    ResultSet result;
  
    public SmartCard() {
    }
    
    public SmartCard(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public SmartCard(Integer cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Double getBalance() {
        return balance;
    }
    
    public void setBalance(Double balance) {
        try {
            String updateBalance = "UPDATE card SET balance=? where number=?";
            statement = connection.prepareStatement(updateBalance);
            statement.setDouble(1,balance);
            statement.setInt(2,cardNumber);
            statement.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        this.balance = balance;
    }

   public int getNumberOfColumns() {
       return 2;
   }
   
   public void retrieveCardDetails(Integer cardNumber) {
       try {
            String getCardQuery = "SELECT * FROM card where number=?";
            statement = connection.prepareStatement(getCardQuery);
            statement.setInt(1, cardNumber);

            ResultSet result = statement.executeQuery();

            while(result.next()){
                this.cardNumber = result.getInt("number");
                this.name = result.getString("name");
                this.balance = result.getDouble("balance");
            }
        } 
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public Integer createNewCard(String name,Integer cost){
    try {
        String insertQuery = "INSERT INTO card VALUES(?,?,?)";

        statement = connection.prepareStatement(insertQuery);
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
        System.out.println(cardNumber);
    } 
    catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return cardNumber;
}
    
    public void deleteCard(int num) {
        
    }
    public double reload(int cardNumber, double amount){
        double balance=0;
        try {
            String getBalance = "SELECT balance from card where number=?";
            PreparedStatement statement = connection.prepareStatement(getBalance);
            statement.setInt(1,cardNumber);
            result = statement.executeQuery();
            
            while(result.next()){
                balance = result.getDouble("balance");
            }
            System.out.println(balance);
            balance = balance+amount;
            
            String updateBalance = "UPDATE card SET balance=? where number=?";
            statement = connection.prepareStatement(updateBalance);
            statement.setDouble(1,balance);
            statement.setInt(2,cardNumber);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return balance;
    }
    
    
}
