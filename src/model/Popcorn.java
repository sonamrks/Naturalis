/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AshitaRaghu
 */
public class Popcorn implements SnackComponent {
    	private String name;
        private int protein;
        private int sugars;
        private int carbohydrates;
        private int calories;
	private double price;
	private int count;
          
        Statement statement;
        String query;
        ResultSet result;
	
	public Popcorn(){
            try {
                DatabaseConnection dbConnection = DatabaseConnection.getInstance();   
                Connection connection = dbConnection.getConnection();
                statement = connection.createStatement();
                query = "SELECT * FROM item WHERE code = 206";
                result = statement.executeQuery(query);
                
                while(result.next()){
                     name = result.getString("name");
                     protein = result.getInt("protein");
                     sugars = result.getInt("sugars");
                    carbohydrates = result.getInt("carbohydrates");
                    calories= result.getInt("calories");
                    price = result.getInt("price");
                    count = result.getInt("count");
                }
                
                result.close();
                statement.close();
                
            } 
            catch(SQLException se){
       System.out.println("JDBC errors");
       se.printStackTrace();
   }catch(Exception err){
       System.out.println("Errors in Class.forName");
       err.printStackTrace();
  }
            
	}
        @Override
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getProtein(){
		return protein;
	}
	public void setProtein(int protein){
		this.protein = protein;
	}
        public int getSugars(){
		return sugars;
	}
	public void setSugars(int sugars){
		this.sugars = sugars;
	}
        public int getCarbohydrates(){
		return carbohydrates;
	}
	public void setCarbohydrates(int carbohydrates){
		this.carbohydrates = carbohydrates;
	}
        @Override
	public int getCalories(){
        //    System.out.println("hello");
		return calories;
	}
	public void setCalories(int calories){
		this.calories = calories;
	}
        @Override
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
        public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count;
	}
        @Override
	public  void addSnack(SnackComponent beverage){
		
	}
        @Override
	public  void removeSnack(SnackComponent beverage){
		
	}
}