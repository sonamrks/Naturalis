package controller;

import model.Beverage;
import model.Coke;
import model.Juice;

public class BeverageFactory {
	
	public Beverage createItem(String name){
		if (name=="coke"){
			return new Coke();
		}
		else if (name=="juice"){
			return new Juice();
		}
		return null;
	}
	
}
