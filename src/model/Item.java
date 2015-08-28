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
    
    ArrayList<Integer> codeList;
    ArrayList<String> nameList;
    ArrayList<Double> priceList;
    ArrayList<Integer> proteinList;
    ArrayList<Integer> sugarsList;
    ArrayList<Integer> carbohydratesList;
    ArrayList<Integer> caloriesList;
    ArrayList<Integer> countList;
    ArrayList<String> picturePathList;
    ArrayList<Integer> soldCountList;
    
    private String getSoldCount;
    private int[] soldCount = new int[100];
    private int machineId;
    private int[] lowCalCount = new int[100];
    private int[] highProteinCount = new int[100];
    private int[] lowSugarsCount = new int[100];
    private String[] lowCalNames = new String[100];
    private String[] highProteinNames = new String[100];
    private String[] lowSugarsNames = new String[100];
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
    }    
     
    public void generateItemInfo(Integer machineId) {
        codeList = new ArrayList<Integer>();
        nameList = new ArrayList<String>();
        proteinList = new ArrayList<Integer>();
        sugarsList= new ArrayList<Integer>();
        caloriesList = new ArrayList<Integer>();
        
        this.machineId = machineId;
        try {
            String getInfo;
            getInfo = "SELECT code,name,protein,sugars,calories FROM item where machineID = ?";
            PreparedStatement statement = connection.prepareStatement(getInfo);
            statement.setInt(1, machineId);
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
            PreparedStatement statement = connection.prepareStatement(getInfo);
            statement.setString(1, category);
            statement.setInt(2, machineID);
            ResultSet result = statement.executeQuery();
            
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
            PreparedStatement statement = connection.prepareStatement(getBeverageSold);
            statement.setString(1,category);
            ResultSet result = statement.executeQuery();
            
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
            getSoldCount = "SELECT soldCount FROM item where category=? and machineID=?";   
            PreparedStatement statement = connection.prepareStatement(getSoldCount);
            statement.setString(1,category);
            statement.setInt(2,machineID);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                soldCount+= result.getInt("soldCount");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    public ArrayList<Integer> getItemSoldCount(String machine){
        ArrayList<Integer> machine1List = new ArrayList<Integer>();
        ArrayList<Integer> machine2List = new ArrayList<Integer>();
        
        int sale=0;
        
        try {
            if(machine.equals("machine1")){
                getSoldCount = "SELECT soldCount FROM item where machineID=4201";
                statement = connection.prepareStatement(getSoldCount);
                result = statement.executeQuery();
                while(result.next()){
                    soldCountList.add(result.getInt("soldCount"));
                }
            }
                
            else if(machine.equals("machine2")){
                getSoldCount = "SELECT soldCount FROM item where machineID=4202";
                statement = connection.prepareStatement(getSoldCount);
                result = statement.executeQuery();
                while(result.next()){
                    soldCountList.add(result.getInt("soldCount"));
                }
            }
            else{
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
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCountList;
    }

    public int[] getNutritionalItemSoldCount(String machine) {
        int sale=0;
        String getHighProteinSold,getLowCaloriesSold,getLowSugarsSold;
        try {
            if(machine.equals("machine1"))
                getLowCaloriesSold = "SELECT name,soldCount FROM item where calories<120 and machineID=4201";
            else if(machine.equals("machine2"))
                getLowCaloriesSold = "SELECT name,soldCount FROM item where calories<120 and machineID=4202";
            else
                getLowCaloriesSold = "SELECT name,soldCount FROM item where calories<120";

            statement = connection.prepareStatement(getLowCaloriesSold);
            result = statement.executeQuery();
            int i=0;
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[0]=sale;
                lowCalCount[i]=result.getInt("soldCount");
                lowCalNames[i]=result.getString("name");
                //System.out.println(lowCalNames[i]);
                i++;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getHighProteinSold = "SELECT name,soldCount FROM item where protein>4 and machineID=4201";
            else if(machine.equals("machine2"))
                getHighProteinSold = "SELECT name,soldCount FROM item where protein>4 and machineID=4202";
            else
                getHighProteinSold = "SELECT name,soldCount FROM item where protein>4";
            statement = connection.prepareStatement(getHighProteinSold);
            result = statement.executeQuery();
            
            i = 0;
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[1]=sale;
                
                highProteinCount[i]=result.getInt("soldCount");
                highProteinNames[i]=result.getString("name");
                i++;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getLowSugarsSold = "SELECT name,soldCount FROM item where sugars<20 and machineID=4201";
            else if(machine.equals("machine2"))
                getLowSugarsSold = "SELECT name,soldCount FROM item where sugars<20 and machineID=4202";
            else
                getLowSugarsSold = "SELECT name,soldCount FROM item where sugars<20";
            statement = connection.prepareStatement(getLowSugarsSold);
            result = statement.executeQuery();
            
            i = 0;
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[2]=sale;
                
                lowSugarsCount[i]=result.getInt("soldCount");
                lowSugarsNames[i]=result.getString("name");
                i++;
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
            PreparedStatement statement = connection.prepareStatement(getSuggestions);
            statement.setInt(1, low);
            statement.setInt(2, high);
            ResultSet result = statement.executeQuery();
            
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
    public int[] getLowCalCount(){
        return lowCalCount;
    }
    public String[] getLowCalNames(){
        return lowCalNames;
    }
    public int[] getHighProteinCount(){
        return highProteinCount;
    }
    public String[] getHighProteinNames(){
        return highProteinNames;
    }
    public int[] getLowSugarsCount(){
        return lowSugarsCount;
    }
    public String[] getLowSugarsNames(){
        return lowSugarsNames;
    }
    public void addNewItem(String[] itemInfo){
        try {
            DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
    Connection connection = dbConnection.getConnection();
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

    int[] nutritionalFacts;
    
    public int[] getInfo(Integer ID) {
        nutritionalFacts = new int[4];
        try {
          
            DatabaseConnection dbConnection = DatabaseConnection.getDatabaseConnectionInstance();
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
