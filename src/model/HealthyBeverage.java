package model;

import java.util.ArrayList;

public class HealthyBeverage implements Beverage {
	ArrayList<Beverage> beverages = new ArrayList<Beverage>();
	String names = null;
	double calorieCount = 0;
	
	public Item createItem(){
		return null;
	}
	
	public String getName(){
		
		for (Item beverage : beverages) {
			names+="\n";
			names+=beverage.getName();
			
		}
		return names;
	}
	public double getPrice(){
		return 0;
	}
	public double getCalories(){
		
		for (Item beverage : beverages) {
			calorieCount+= beverage.getCalories();
		}
		return calorieCount;
		//return 0;
	}
	
	public  void addBeverage(Beverage beverage){
		beverages.add(beverage);
	}
	public  void removeBeverage(Beverage beverage){
		beverages.remove(beverage);
	}	

}
