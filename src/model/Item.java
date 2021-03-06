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
import model.DatabaseConnection;

/**
 *
 * @author AshitaRaghu
 */
public class Item {
    
    private ArrayList<Integer> codeList;
    private ArrayList<String> nameList;
    private ArrayList<Double> priceList;
    private ArrayList<Integer> proteinList;
    private ArrayList<Integer> sugarsList;
    private ArrayList<Integer> carbohydratesList;
    private ArrayList<Integer> caloriesList;
    private ArrayList<Integer> countList;
    private ArrayList<String> picturePathList;
    private ArrayList<Integer> soldCountList;
    
    private ArrayList<Integer> soldCount;
    private ArrayList<Integer> lowCalCount;
    private ArrayList<Integer> highProteinCount;
    private ArrayList<Integer> lowSugarsCount;
    private ArrayList<String> lowCalNames;
    private ArrayList<String> highProteinNames;
    private ArrayList<String> lowSugarsNames;
    private ArrayList<Integer> nutritionalFacts;
    private double sales;
    
    DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;

    public Item() {
        codeList = new ArrayList<Integer>();
        nameList = new ArrayList<String>();
        priceList = new ArrayList<Double>();
        proteinList = new ArrayList<Integer>();
        sugarsList = new ArrayList<Integer>();
        carbohydratesList = new ArrayList<Integer>();
        caloriesList = new ArrayList<Integer>();
        countList = new ArrayList<Integer>();
        picturePathList = new ArrayList<String>();
        soldCountList = new ArrayList<Integer>();
        soldCount = new ArrayList<Integer>();
        lowCalCount = new ArrayList<Integer>();
        highProteinCount = new ArrayList<Integer>();
        lowSugarsCount = new ArrayList<Integer>();
        lowCalNames = new ArrayList<String>();
        highProteinNames = new ArrayList<String>();
        lowSugarsNames = new ArrayList<String>();
        nutritionalFacts = new ArrayList<Integer>();
    }    
     
    public void generateItemInfo(Integer machineID) {
        codeList = new ArrayList<Integer>();
        nameList = new ArrayList<String>();
        proteinList = new ArrayList<Integer>();
        sugarsList= new ArrayList<Integer>();
        caloriesList = new ArrayList<Integer>();

        try {
            String getInfo;
            getInfo = "SELECT code,name,protein,sugars,calories FROM item where machineID = ?";
            statement = connection.prepareStatement(getInfo);
            statement.setInt(1, machineID);
            result = statement.executeQuery();
            
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
    
    public ArrayList<Integer> getCodeForMachine(){        
        return codeList;
    }

    public ArrayList<String> getNameListForMachine() {
        return nameList;
    }
    
    public ArrayList<Double> getPriceForMachine(){        
        return priceList;
    }
           
    public ArrayList<Integer> getCountListForMachine() {
        return countList;
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
    
    public void generateCategoryItemInfo(Integer machineID, String category) {
        codeList = new ArrayList<Integer>();
        priceList = new ArrayList<Double>();
        countList = new ArrayList<Integer>();
        picturePathList = new ArrayList<String>();
        
        try {         
            String getInfo = "SELECT code, price, count, picturePath FROM item where category=? and machineID =?";
            statement = connection.prepareStatement(getInfo);
            statement.setString(1, category);
            statement.setInt(2, machineID);
            result = statement.executeQuery();
            
            while(result.next()){
                codeList.add(result.getInt("code"));
                priceList.add(result.getDouble("price"));
                countList.add(result.getInt("count"));
                picturePathList.add(result.getString("picturePath"));
            }     
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ArrayList<Integer> getCategoryCodeForMachine(){  
        return codeList;
    }
    
    public ArrayList<Double> getCategoryPriceForMachine(){  
        return priceList;
    }
         
    public ArrayList<Integer> getCategoryCountForMachine(){
        return countList;
    }
    
    public ArrayList<String> getCategoryPicturePathForMachine(){
        return picturePathList;
    }
 
    public int getCategorySoldCount(String category){
        int soldCount=0;
        try {
            String getBeverageSold = "SELECT soldCount FROM item where category=?";
            statement = connection.prepareStatement(getBeverageSold);
            statement.setString(1,category);
            result = statement.executeQuery();
            
            while(result.next()){
                soldCount+= result.getInt("soldCount");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    public int getCategorySoldCount(String category,Integer machineID){
        int soldCount=0;
        try {
            String getSoldCount = "SELECT soldCount FROM item where category=? and machineID=?";   
            statement = connection.prepareStatement(getSoldCount);
            statement.setString(1,category);
            statement.setInt(2,machineID);
            result = statement.executeQuery();
            
            while(result.next()){
                soldCount+= result.getInt("soldCount");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    public ArrayList<Integer> getItemSoldCount(Integer machine){
        ArrayList<Integer> machine1List = new ArrayList<Integer>();
        ArrayList<Integer> machine2List = new ArrayList<Integer>();
        String getSoldCount;
        
        try {
            if(machine == 0 ){
                getSoldCount = "SELECT soldCount FROM item where machineID=4201";
                statement = connection.prepareStatement(getSoldCount);
                result = statement.executeQuery();
                while(result.next()){
                    machine1List.add(result.getInt("soldCount"));
                }
                getSoldCount = "SELECT soldCount FROM item where machineID=4202";
                statement = connection.prepareStatement(getSoldCount);
                result = statement.executeQuery();
                while(result.next()){
                    machine2List.add(result.getInt("soldCount"));
                }
                int i=0;
                while(i<machine1List.size()){
                    soldCountList.add(machine1List.get(i) + machine2List.get(i));
                    i++;
                }
            } 
            else{
                getSoldCount = "SELECT soldCount FROM item where machineID=?";
                statement = connection.prepareStatement(getSoldCount);
                statement.setInt(1,machine);
                result = statement.executeQuery();
                while(result.next()){
                    soldCountList.add(result.getInt("soldCount"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCountList;
    }

    public ArrayList<Integer> getNutritionalItemSoldCount(Integer machine) {
        int sale=0;
        String getHighProteinSold,getLowCaloriesSold,getLowSugarsSold;
        try {
            if(machine == 0) {
                getLowCaloriesSold = "SELECT name,soldCount FROM item where calories<120";
                statement = connection.prepareStatement(getLowCaloriesSold);
            }
            else {
                getLowCaloriesSold = "SELECT name,soldCount FROM item where calories<120 and machineID=?";   
                statement = connection.prepareStatement(getLowCaloriesSold);
                statement.setInt(1,machine);
            }
            
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount.add(sale);
                lowCalCount.add(result.getInt("soldCount"));
                lowCalNames.add(result.getString("name"));
            }
            sale = 0;
            
            if(machine == 0) {
                getHighProteinSold = "SELECT name,soldCount FROM item where protein>4";
                statement = connection.prepareStatement(getHighProteinSold);
            }
            else {
                getHighProteinSold = "SELECT name,soldCount FROM item where protein>4 and machineID=?";
                statement = connection.prepareStatement(getHighProteinSold);
                statement.setInt(1,machine);
            }    
            result = statement.executeQuery();
            
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount.add(sale);
                
                highProteinCount.add(result.getInt("soldCount"));
                highProteinNames.add(result.getString("name"));
            }
            sale = 0;
            
            if(machine == 0) {
                getLowSugarsSold = "SELECT name,soldCount FROM item where sugars<20";
                statement = connection.prepareStatement(getLowSugarsSold);
            }
            else {
                getLowSugarsSold = "SELECT name,soldCount FROM item where sugars<20 and machineID=?";
                statement = connection.prepareStatement(getLowSugarsSold);
                statement.setInt(1,machine);
            }    
            result = statement.executeQuery();
            
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount.add(sale);               
                lowSugarsCount.add(result.getInt("soldCount"));
                lowSugarsNames.add(result.getString("name"));
            }
            sale = 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    public String getCalorieRangeSuggestions(int low, int high) {
        String suggestions="";
        try {
            String getSuggestions = "SELECT code,name,protein,sugars,calories FROM item where calories>? and calories<? and machineID=4201";
            statement = connection.prepareStatement(getSuggestions);
            statement.setInt(1, low);
            statement.setInt(2, high);
            result = statement.executeQuery();
            
            while(result.next())
            {
                suggestions+=Integer.toString(result.getInt("code")) + "\t";
                suggestions+=result.getString("name") + "\t";
                suggestions+=Integer.toString(result.getInt("protein")) + "\t";
                suggestions+=Integer.toString(result.getInt("sugars")) + "\t";
                suggestions+=Integer.toString(result.getInt("calories")) + "\t";
                suggestions+="\n";
            }
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        return suggestions;
    }
    public ArrayList<Integer> getLowCalCount(){
        return lowCalCount;
    }
    public ArrayList<String> getLowCalNames(){
        return lowCalNames;
    }
    public ArrayList<Integer> getHighProteinCount(){
        return highProteinCount;
    }
    public ArrayList<String> getHighProteinNames(){
        return highProteinNames;
    }
    public ArrayList<Integer> getLowSugarsCount(){
        return lowSugarsCount;
    }
    public ArrayList<String> getLowSugarsNames(){
        return lowSugarsNames;
    }
    public void addNewItem(String[] itemInfo){
        try {
            String getInfo;
            getInfo = "INSERT into item VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(getInfo);
            statement.setInt(1,Integer.valueOf(itemInfo[0]));
            statement.setString(2,itemInfo[1]);
            statement.setInt(3,Integer.valueOf(itemInfo[2]));
            statement.setInt(4,Integer.valueOf(itemInfo[3]));
            statement.setInt(5,Integer.valueOf(itemInfo[4]));
            statement.setInt(6,Integer.valueOf(itemInfo[5]));
            statement.setInt(7,Integer.valueOf(itemInfo[6]));
            statement.setDouble(8,Double.valueOf(itemInfo[7]));
            statement.setString(9,"/images/"+itemInfo[1]+".jpg");
            statement.setString(10,itemInfo[8]);
            statement.setInt(11,0);
            statement.setInt(12,Integer.valueOf(itemInfo[9]));
            statement.setDouble(13,Integer.valueOf(itemInfo[6])* Double.valueOf(itemInfo[7]));
            
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void addNewMachine(Integer machineID ){
        try {
            String getInfo;
            getInfo = "CREATE TEMPORARY TABLE tmp SELECT * FROM item where machineID = 4201";
            statement = connection.prepareStatement(getInfo);
            statement.executeUpdate();
            getInfo = "UPDATE tmp SET machineID=?";
            statement = connection.prepareStatement(getInfo);
            statement.setInt(1, machineID);
            statement.executeUpdate();
            getInfo = "UPDATE tmp SET count=10";
            statement = connection.prepareStatement(getInfo);
            statement.executeUpdate();
            getInfo = "INSERT INTO item SELECT * FROM tmp";
            statement = connection.prepareStatement(getInfo);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ArrayList<Integer> getMachines() {
        ArrayList<Integer> machineIDs = new ArrayList<Integer>();
        try {
            String getInfo;
            getInfo = "SELECT DISTINCT(machineID) FROM item";
            statement = connection.prepareStatement(getInfo);
            result = statement.executeQuery();
            while(result.next()){
                machineIDs.add(result.getInt("machineID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return machineIDs;
    }
    
    public double collectMoney(Integer machineID){
        double totalSales = 0;
        try {
            String getTotalSales = "SELECT sum(sales) as total FROM item where machineID=?";
            
            statement = connection.prepareStatement(getTotalSales);
            statement.setInt(1, machineID);
            result = statement.executeQuery();
            
            while(result.next()){
                totalSales = result.getDouble("total");
            }
            return totalSales;
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSales;
    }
    
    public ArrayList<Integer> getInfo(Integer ID) {
        try {         
            String getName = "SELECT protein,sugars,carbohydrates,calories FROM item WHERE code=?";

            statement = connection.prepareStatement(getName);
            statement.setInt(1,ID);
            result = statement.executeQuery();

            while(result.next()){
               nutritionalFacts.add(result.getInt("protein"));
               nutritionalFacts.add(result.getInt("sugars"));
               nutritionalFacts.add(result.getInt("carbohydrates"));
               nutritionalFacts.add(result.getInt("calories"));
            }
        }catch(Exception err){
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
        return nutritionalFacts;
    }
    
    public void decreaseItemCount(Integer code, Integer machineID){       
        try {
            String updateBalance = "UPDATE item SET count=count-1 where code=? and machineID=?";
            statement = connection.prepareStatement(updateBalance);
            statement.setInt(1,code);
            statement.setInt(2,machineID);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
    public void increaseItemCount(Integer code, Integer machineID){
        try {
            String updateBalance = "UPDATE item SET count=count+1 where code=? and machineID =?";
            statement = connection.prepareStatement(updateBalance);
            statement.setInt(1,code);
            statement.setInt(2,machineID);
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
    public double getSales(int machineID){
         try {
            String getTotalSales = "SELECT sum(sales) as total FROM item where machineID=?";

            statement = connection.prepareStatement(getTotalSales);
            statement.setInt(1, machineID);
            result = statement.executeQuery();
            
            while(result.next()){
                sales = result.getDouble("total");
            }
            return sales;
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }
}
