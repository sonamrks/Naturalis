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
    
    private String getSoldCount;
    private int[] soldCount = new int[100];
    
    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
    
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
            
            PreparedStatement statement = connection.prepareStatement(getInfo);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
               
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
    public int getCategorySoldCount(String category){
        int soldCount=0;
        try {
            String getBeverageSold = "SELECT soldCount FROM item where category=?";
            PreparedStatement statement = connection.prepareStatement(getBeverageSold);
            statement.setString(1,category);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                soldCount+= result.getInt("soldCount");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    public int getCategorySoldCount(String category,String machine){
        int soldCount=0;
        try {
            if(machine.equals("machine1"))
                getSoldCount = "SELECT soldCount FROM item where category=? and machineID=4201";
            else
                getSoldCount = "SELECT soldCount FROM item where category=? and machineID=4202";
    
            PreparedStatement statement = connection.prepareStatement(getSoldCount);
            statement.setString(1,category);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                soldCount+= result.getInt("soldCount");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    public int[] getItemSoldCount(String machine){
        
        int sale=0;
        String getCokeSold,getOrangeSold,getLemonadeSold,getGatoradeSold,getGranolaSold,getNutsSold,getChipsSold,getCookieSold;
        try {
            if(machine.equals("machine1"))
                getCokeSold = "SELECT soldCount FROM item where code=101 and machineID=4201";
            else
                getCokeSold = "SELECT soldCount FROM item where code=101 and machineID=4202";

            statement = connection.prepareStatement(getCokeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[0]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getOrangeSold = "SELECT soldCount FROM item where code=102 and machineID=4201";
            else
                getOrangeSold = "SELECT soldCount FROM item where code=102 and machineID=4202";
            statement = connection.prepareStatement(getOrangeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[1]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getLemonadeSold = "SELECT soldCount FROM item where code=103 and machineID=4201";
            else
                getLemonadeSold = "SELECT soldCount FROM item where code=103 and machineID=4202";
            statement = connection.prepareStatement(getLemonadeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[2]=sale;
            }
            sale = 0;
            
           if(machine.equals("machine1"))
                getGatoradeSold = "SELECT soldCount FROM item where code=104 and machineID=4201";
            else
                getGatoradeSold = "SELECT soldCount FROM item where code=104 and machineID=4202";
            statement = connection.prepareStatement(getGatoradeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[3]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getGranolaSold = "SELECT soldCount FROM item where code=201 and machineID=4201";
            else
                getGranolaSold = "SELECT soldCount FROM item where code=201 and machineID=4202";
            statement = connection.prepareStatement(getGranolaSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[4]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getChipsSold = "SELECT soldCount FROM item where code=202 and machineID=4201";
            else
                getChipsSold = "SELECT soldCount FROM item where code=202 and machineID=4202";
            statement = connection.prepareStatement(getChipsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[5]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getNutsSold = "SELECT soldCount FROM item where code=203 and machineID=4201";
            else
                getNutsSold = "SELECT soldCount FROM item where code=203 and machineID=4202";
            statement = connection.prepareStatement(getNutsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[6]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getCookieSold = "SELECT soldCount FROM item where code=204 and machineID=4201";
            else
                getCookieSold = "SELECT soldCount FROM item where code=204 and machineID=4202";
            statement = connection.prepareStatement(getCookieSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[7]=sale;
            }
            sale = 0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }

    int[] getNutritionalItemSoldCount(String machine) {
        int sale=0;
        String getHighProteinSold,getLowCaloriesSold,getLowSugarsSold;
        try {
            if(machine.equals("machine1"))
                getLowCaloriesSold = "SELECT soldCount FROM item where calories<120 and machineID=4201";
            else
                getLowCaloriesSold = "SELECT soldCount FROM item where calories<120 and machineID=4202";

            statement = connection.prepareStatement(getLowCaloriesSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[0]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getHighProteinSold = "SELECT soldCount FROM item where protein>4 and machineID=4201";
            else
                getHighProteinSold = "SELECT soldCount FROM item where protein>4 and machineID=4202";
            statement = connection.prepareStatement(getHighProteinSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[1]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getLowSugarsSold = "SELECT soldCount FROM item where sugars<20 and machineID=4201";
            else
                getLowSugarsSold = "SELECT soldCount FROM item where sugars<20 and machineID=4202";
            statement = connection.prepareStatement(getLowSugarsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[2]=sale;
            }
            sale = 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(ItemTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
}
