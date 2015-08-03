package model;

import java.sql.*;

public class Coke implements BeverageComponent {
	
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
	
	public Coke(Connection connection){
            try {
                statement = connection.createStatement();
                query = "SELECT * FROM item WHERE code = 101";
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
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public int getCalories(){
		return calories;
	}
	public void setCalories(int calories){
		this.calories = calories;
	}
	public  void addBeverage(BeverageComponent beverage){
		
	}
	public  void removeBeverage(BeverageComponent beverage){
		
	}
}
