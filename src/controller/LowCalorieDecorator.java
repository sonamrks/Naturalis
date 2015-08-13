package controller;

import java.util.ArrayList;

import model.BeverageComponent;
import model.Item;

public class LowCalorieDecorator extends Decorator{
	BeverageComponent beverage;
	
	public LowCalorieDecorator(BeverageComponent beverage) {
		this.beverage = beverage;
	}

	public double getCalories(){
		for(Item beverage : beverages) {
			System.out.println(beverage.getCalories());
		}
		getLowCalorieBeverages();
		return 0;
	}
	public void getLowCalorieBeverages(){
		if(beverage.getCalories() < 100){
			lowCalorieBeverages.add(beverage);
		}
	}
}
