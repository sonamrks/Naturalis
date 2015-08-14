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
public class ItemTableModel {
    
    ArrayList<Integer> codeList = new ArrayList<Integer>();
    ArrayList<String> nameList = new ArrayList<String>();
    ArrayList<Double> priceList = new ArrayList<Double>();
    ArrayList<Integer> proteinList = new ArrayList<Integer>();
    ArrayList<Integer> sugarsList = new ArrayList<Integer>();
    ArrayList<Integer> carbohydratesList = new ArrayList<Integer>();
    ArrayList<Integer> caloriesList = new ArrayList<Integer>();
    ArrayList<Integer> countList = new ArrayList<Integer>();
    
    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    public void getItemInfo(){
        try {
            String getInfo = "SELECT code,name,protein,sugars,calories FROM item";
            PreparedStatement statement = connection.prepareStatement(getInfo);
            ResultSet result = statement.executeQuery();
            
            while(result.next())
            {
                codeList.add(result.getInt("code"));
                nameList.add(result.getString("name"));
                proteinList.add(result.getInt("protein"));
                sugarsList.add(result.getInt("sugars"));
                caloriesList.add(result.getInt("calories"));
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
    }
    
    
    public ArrayList<Integer> getCode(){
        
        try {
            
            
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
    public ArrayList<Integer> setProtein(){
       
        return proteinList;
    }
    
    public ArrayList<Integer> setSugars(){
        
        return sugarsList;
    }
    public ArrayList<Integer> setCarbohydrates(){
        
        return carbohydratesList;
    }
    public ArrayList<Integer> setCalories(){
        
        return caloriesList;
    }
    public ArrayList<Double> setPrice(){
        
        try {
            
            String getInfo = "SELECT price,count FROM item";
            /*String getSugars = "SELECT sugars FROM item";
            String getCarbohydrates = "SELECT carbohydrates FROM item";
            String getCalories = "SELECT calories FROM item";
            String getPrice = "SELECT price FROM item";
            String getCount = "SELECT count FROM item";*/
            
            PreparedStatement statement = connection.prepareStatement(getInfo);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                //proteinList.add(result.getInt("protein"));
                //sugarsList.add(result.getInt("sugars"));
                //carbohydratesList.add(result.getInt("carbohydrates"));
                //caloriesList.add(result.getInt("calories"));
                priceList.add(result.getDouble("price"));
                countList.add(result.getInt("count"));
                
            }
            
            statement = connection.prepareStatement(getInfo);
            result = statement.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        
        return priceList;
    }
    public ArrayList<Integer> setCount(){
        
        return countList;
    }
    
    public ArrayList<Integer> getCodeList() {
        return codeList;
    }
    
    public ArrayList<String> getNameList() {
        return nameList;
    }

    public ArrayList<Double> getPriceList() {
        return priceList;
    }

    public ArrayList<Integer> getProteinList() {
        return proteinList;
    }

    public ArrayList<Integer> getSugarsList() {
        return sugarsList;
    }

    public ArrayList<Integer> getCarbohydratesList() {
        return carbohydratesList;
    }

    public ArrayList<Integer> getCaloriesList() {
        return caloriesList;
    }
    
    public ArrayList<Integer> getCountList() {
        return countList;
    }
}
