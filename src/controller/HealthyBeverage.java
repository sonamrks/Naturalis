package controller;

import model.Beverage;
import model.Item;


public class HealthyBeverage extends Beverage {
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
	public  void removeBeverage(Item beverage){
		beverages.remove(beverage);
	}
	

}
