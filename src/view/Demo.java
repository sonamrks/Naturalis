package view;

import model.Beverage;
import model.HealthyBeverage;
import controller.BeverageFactory;

public class Demo {
	public static void main(String args[]){
		BeverageFactory factory1 = new BeverageFactory();
		Beverage item1 = factory1.createItem("model.Juice");
		Beverage item2 = factory1.createItem("model.Coke");
		System.out.println("item1: " + item1.getName());
		System.out.println("item2: " + item2.getName());
		
		Beverage healthyBeverages = new HealthyBeverage();
		healthyBeverages.addBeverage(item1);
		healthyBeverages.addBeverage(item2);
		
		System.out.println(healthyBeverages.getName());
		System.out.println(healthyBeverages.getCalories());
		
	}
}
