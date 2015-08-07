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
    String name;
    ItemFactory item = new ItemFactory();
    
    public int[] getInfo(Integer ID) {
        
        try {
          
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            Connection connection = dbConnection.getConnection();
            String getName = "SELECT name FROM item WHERE code=?";

            PreparedStatement statement = connection.prepareStatement(getName);
            statement.setInt(1,ID);
            ResultSet result = statement.executeQuery();

            while(result.next()){
               name = result.getString("name");
            }

            String s = "model." + name;
            Item beverage;
            beverage = item.createItem(s);
            
            nutritionalFacts = new int[4];
            
           nutritionalFacts[0] = beverage.getProtein();
           nutritionalFacts[1] = beverage.getSugars();
           nutritionalFacts[2] = beverage.getCarbohydrates();
           nutritionalFacts[3] = beverage.getCalories();
            
            //System.out.println(nutritionalFacts);
            
            
            //System.out.println("Name : "+beverage.getName()+" Calories : "+beverage.getCalories());            
            
        }catch(Exception err){
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
        return nutritionalFacts;
    }
 
    
}
