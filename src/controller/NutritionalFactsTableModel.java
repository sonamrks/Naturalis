/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DatabaseConnection;
import model.Item;

/**
 *
 * @author AshitaRaghu
 */
public class NutritionalFactsTableModel {

    int[] nutritionalFacts;
    
    public int[] getInfo(Integer ID) {
        nutritionalFacts = new int[4];
        try {
          
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String getName = "SELECT protein,sugars,carbohydrates,calories FROM item WHERE code=?";

            PreparedStatement statement = connection.prepareStatement(getName);
            statement.setInt(1,ID);
            ResultSet result = statement.executeQuery();

            while(result.next()){
               nutritionalFacts[0] = result.getInt("protein");
               nutritionalFacts[1] = result.getInt("sugars");
               nutritionalFacts[2] = result.getInt("carbohydrates");
               nutritionalFacts[3] = result.getInt("calories");
            }
        }catch(Exception err){
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
        return nutritionalFacts;
    }
 
    
}
