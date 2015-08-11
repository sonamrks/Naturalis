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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DatabaseConnection;

/**
 *
 * @author AshitaRaghu
 */
public class ItemsTableModel {
    
    ArrayList<Integer> codeList = new ArrayList<Integer>();
    ArrayList<Double> priceList = new ArrayList<Double>();
    
    public ArrayList<Integer> getCode(){
        
        try {
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            
            String getCode = "SELECT code FROM item";
            String getPrice = "SELECT price FROM item";
            
            PreparedStatement statement = connection.prepareStatement(getCode);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                codeList.add(result.getInt("code"));
            }
            
            statement = connection.prepareStatement(getPrice);
            result = statement.executeQuery();
            
            while(result.next()){
                priceList.add(result.getDouble("price"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return codeList;
    }
    
    public ArrayList<Double> getPrice(){
        
        return priceList;
    }
    
    
}
