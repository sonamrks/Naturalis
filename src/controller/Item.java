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
public class Item {
    
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
    private int machineID;
    private int[] lowCalCount = new int[100];
    private int[] highProteinCount = new int[100];
    private int[] lowSugarsCount = new int[100];
    private String[] lowCalNames = new String[100];
    private String[] highProteinNames = new String[100];
    private String[] lowSugarsNames = new String[100];
    
    DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
    
    PreparedStatement statement;
    ResultSet result;
    
    public Item(int machineID) {
        this.machineID = machineID;
    }
    public Item() {
        
    }
    
    public void getItemInfo(){
        try {
            String getInfo;
                getInfo = "SELECT code,name,protein,sugars,calories FROM item where machineID = " + Integer.toString(machineID);
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
            String getCode = "SELECT code FROM item where machineID = " + Integer.toString(machineID);
            String getPrice = "SELECT price FROM item where machineID = " + Integer.toString(machineID);
            
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
    
    public ArrayList<Integer> getCodeForMachine(Integer machineID){        
        try {         
            String getCode = "SELECT code FROM item where machineID = " + Integer.toString(machineID);
            
            PreparedStatement statement = connection.prepareStatement(getCode);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                codeList.add(result.getInt("code"));
            }            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return codeList;
    }
    
    public ArrayList<Double> getPriceForMachine(Integer machineID){        
        try {         
            String getPrice = "SELECT price FROM item where machineID = " + Integer.toString(machineID);
               
            statement = connection.prepareStatement(getPrice);
            result = statement.executeQuery();
            
            while(result.next()){
                priceList.add(result.getDouble("price"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return priceList;
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
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    public int[] getItemSoldCount(String machine){
        
        int sale=0;
        String getCokeSold,getOrangeSold,getLemonadeSold,getGatoradeSold;
        String getFrappuccinoSold,getCoconutWaterSold, getSparklingWaterSold,getProteinSmoothieSold,getProteinShakeSold;
        String getGranolaSold,getNutsSold,getChipsSold,getCookieSold;
        String getDriedFruitsSold,getPopcornSold,getCrackersSold,getVeggieStrawsSold,getGreekYogurtSold;
        try {
            if(machine.equals("machine1"))
                getCokeSold = "SELECT soldCount FROM item where code=101 and machineID=4201";
            else if(machine.equals("machine2"))
                getCokeSold = "SELECT soldCount FROM item where code=101 and machineID=4202";
            else
                getCokeSold = "SELECT soldCount FROM item where code=101";
            statement = connection.prepareStatement(getCokeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[0]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getOrangeSold = "SELECT soldCount FROM item where code=102 and machineID=4201";
            else if(machine.equals("machine2"))
                getOrangeSold = "SELECT soldCount FROM item where code=102 and machineID=4202";
            else
                getOrangeSold = "SELECT soldCount FROM item where code=102";
            statement = connection.prepareStatement(getOrangeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[1]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getLemonadeSold = "SELECT soldCount FROM item where code=103 and machineID=4201";
            else  if(machine.equals("machine2"))
                getLemonadeSold = "SELECT soldCount FROM item where code=103 and machineID=4202";
            else
                getLemonadeSold = "SELECT soldCount FROM item where code=103";
            statement = connection.prepareStatement(getLemonadeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[2]=sale;
            }
            sale = 0;
            
           if(machine.equals("machine1"))
                getGatoradeSold = "SELECT soldCount FROM item where code=104 and machineID=4201";
           else if(machine.equals("machine2"))
                getGatoradeSold = "SELECT soldCount FROM item where code=104 and machineID=4202";
           else
               getGatoradeSold = "SELECT soldCount FROM item where code=104";
            statement = connection.prepareStatement(getGatoradeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[3]=sale;
            }
            sale = 0;
            
             if(machine.equals("machine1"))
                getFrappuccinoSold = "SELECT soldCount FROM item where code=105 and machineID=4201";
            else if(machine.equals("machine2"))
                getFrappuccinoSold = "SELECT soldCount FROM item where code=105 and machineID=4202";
            else
                getFrappuccinoSold = "SELECT soldCount FROM item where code=105";
            statement = connection.prepareStatement(getFrappuccinoSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[4]=sale;
            }
            sale = 0;
            
            
            if(machine.equals("machine1"))
                getCoconutWaterSold = "SELECT soldCount FROM item where code=106 and machineID=4201";
            else if(machine.equals("machine2"))
                getCoconutWaterSold = "SELECT soldCount FROM item where code=106 and machineID=4202";
            else
               getCoconutWaterSold = "SELECT soldCount FROM item where code=106";
            statement = connection.prepareStatement(getCoconutWaterSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[5]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getSparklingWaterSold = "SELECT soldCount FROM item where code=107 and machineID=4201";
            else if(machine.equals("machine2"))
                getSparklingWaterSold = "SELECT soldCount FROM item where code=107 and machineID=4202";
            else
               getSparklingWaterSold = "SELECT soldCount FROM item where code=107";
            statement = connection.prepareStatement(getSparklingWaterSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[6]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getProteinSmoothieSold = "SELECT soldCount FROM item where code=108 and machineID=4201";
            else if(machine.equals("machine2"))
                getProteinSmoothieSold = "SELECT soldCount FROM item where code=108 and machineID=4202";
            else
               getProteinSmoothieSold = "SELECT soldCount FROM item where code=108";
            statement = connection.prepareStatement(getProteinSmoothieSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[7]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getProteinShakeSold = "SELECT soldCount FROM item where code=109 and machineID=4201";
            else if(machine.equals("machine2"))
                getProteinShakeSold = "SELECT soldCount FROM item where code=109 and machineID=4202";
            else
               getProteinShakeSold = "SELECT soldCount FROM item where code=109";
            statement = connection.prepareStatement(getProteinShakeSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[8]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getGranolaSold = "SELECT soldCount FROM item where code=201 and machineID=4201";
            else if(machine.equals("machine2"))
                getGranolaSold = "SELECT soldCount FROM item where code=201 and machineID=4202";
            else
               getGranolaSold = "SELECT soldCount FROM item where code=201";
            statement = connection.prepareStatement(getGranolaSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[9]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getChipsSold = "SELECT soldCount FROM item where code=202 and machineID=4201";
            else if(machine.equals("machine2"))
                getChipsSold = "SELECT soldCount FROM item where code=202 and machineID=4202";
            else
               getChipsSold = "SELECT soldCount FROM item where code=202";
            statement = connection.prepareStatement(getChipsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[10]=sale;
            }
            sale = 0;
           
            if(machine.equals("machine1"))
                getNutsSold = "SELECT soldCount FROM item where code=203 and machineID=4201";
            else  if(machine.equals("machine2"))
                getNutsSold = "SELECT soldCount FROM item where code=203 and machineID=4202";
            else
                getNutsSold = "SELECT soldCount FROM item where code=203";
            statement = connection.prepareStatement(getNutsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[11]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getCookieSold = "SELECT soldCount FROM item where code=204 and machineID=4201";
            else if(machine.equals("machine2"))
                getCookieSold = "SELECT soldCount FROM item where code=204 and machineID=4202";
            else
                getCookieSold = "SELECT soldCount FROM item where code=204";
            statement = connection.prepareStatement(getCookieSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[12]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getDriedFruitsSold = "SELECT soldCount FROM item where code=205 and machineID=4201";
            else if(machine.equals("machine2"))
                getDriedFruitsSold = "SELECT soldCount FROM item where code=205 and machineID=4202";
            else
                getDriedFruitsSold = "SELECT soldCount FROM item where code=205";
            statement = connection.prepareStatement(getDriedFruitsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[13]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getPopcornSold = "SELECT soldCount FROM item where code=206 and machineID=4201";
            else if(machine.equals("machine2"))
                getPopcornSold = "SELECT soldCount FROM item where code=206 and machineID=4202";
            else
                getPopcornSold = "SELECT soldCount FROM item where code=206";
            statement = connection.prepareStatement(getPopcornSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[14]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getCrackersSold = "SELECT soldCount FROM item where code=207 and machineID=4201";
            else if(machine.equals("machine2"))
                getCrackersSold = "SELECT soldCount FROM item where code=207 and machineID=4202";
            else
                getCrackersSold = "SELECT soldCount FROM item where code=207";
            statement = connection.prepareStatement(getCrackersSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[15]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getVeggieStrawsSold = "SELECT soldCount FROM item where code=208 and machineID=4201";
            else if(machine.equals("machine2"))
                getVeggieStrawsSold = "SELECT soldCount FROM item where code=208 and machineID=4202";
            else
                getVeggieStrawsSold = "SELECT soldCount FROM item where code=208";
            statement = connection.prepareStatement(getVeggieStrawsSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[16]=sale;
            }
            sale = 0;
            
            if(machine.equals("machine1"))
                getGreekYogurtSold = "SELECT soldCount FROM item where code=209 and machineID=4201";
            else if(machine.equals("machine2"))
                getGreekYogurtSold = "SELECT soldCount FROM item where code=209 and machineID=4202";
            else
                getGreekYogurtSold = "SELECT soldCount FROM item where code=209";
            statement = connection.prepareStatement(getGreekYogurtSold);
            result = statement.executeQuery();
            while(result.next()){
                sale+= result.getInt("soldCount");
                soldCount[17]=sale;
            }
            sale = 0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }

    int[] getNutritionalItemSoldCount(String machine) {
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
                //System.out.println(highProteinNames[i]);
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
                //System.out.println(lowSugarsNames[i]);
                i++;
            }
            sale = 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soldCount;
    }
    
    String getCalorieRangeSuggestions(int low, int high) {
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
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
    Connection connection = dbConnection.getConnection();
            String getInfo;
            getInfo = "INSERT into item VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            statement = connection.prepareStatement(getInfo);
            statement.setInt(1,Integer.valueOf(itemInfo[0]));
            statement.setString(2,itemInfo[1]);
            statement.setInt(3,Integer.valueOf(itemInfo[2]));
            statement.setInt(4,Integer.valueOf(itemInfo[3]));
            statement.setInt(5,Integer.valueOf(itemInfo[4]));
            statement.setInt(6,Integer.valueOf(itemInfo[5]));
            statement.setInt(7,Integer.valueOf(itemInfo[6]));
            statement.setDouble(8,Double.valueOf(itemInfo[7]));
            statement.setString(9,null);
            statement.setString(10,itemInfo[8]);
            statement.setInt(11,0);
            statement.setInt(12,Integer.valueOf(itemInfo[9]));
            
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
    
    public int[] getCount(int machineID){
        int[] count = new int[100];
        try {
            String getCount = "SELECT count FROM item where category='beverage' and machineID=?";
            PreparedStatement statement = connection.prepareStatement(getCount);
            statement.setInt(1, machineID);
            ResultSet result = statement.executeQuery();
            int i=0;
            while(result.next())
            {
                count[i] = result.getInt("count");
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
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
    
    public void increaseItemCount(Integer count,Integer code){
        
        try {
            String updateBalance = "UPDATE item SET count=? where code=?";
            statement = connection.prepareStatement(updateBalance);
            statement.setInt(1,count);
            statement.setInt(2,code);
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
}
