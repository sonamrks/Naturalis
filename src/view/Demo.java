package view;

import model.Beverage;
import controller.BeverageFactory;
import controller.HealthyBeverage;

public class Demo {
	public static void main(String args[]){
		BeverageFactory factory1 = new BeverageFactory();
		Beverage item1 = factory1.createItem("juice");
		Beverage item2 = factory1.createItem("coke"); 
		
		Beverage healthyBeverages = new HealthyBeverage();
		healthyBeverages.addBeverage(item1);
		healthyBeverages.addBeverage(item2);
		
		System.out.println(healthyBeverages.getName());
		System.out.println(healthyBeverages.getCalories());
		
	}
}
