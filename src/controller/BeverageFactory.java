package controller;

import model.Beverage;

public class BeverageFactory {
	
	public Beverage createItem(String name){
		Beverage beverage = null;
		
		try {
			beverage = (Beverage) Class.forName(name).newInstance();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return beverage;
	}
	
}
