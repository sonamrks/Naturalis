package controller;

import model.BeverageComponent;

public class BeverageFactory implements ItemFactory{
	
	public BeverageComponent createItem(String name){
		BeverageComponent beverage = null;
		
		try {
			beverage = (BeverageComponent) Class.forName(name).newInstance();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return beverage;
	}
	
}
