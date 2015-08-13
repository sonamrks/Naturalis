package controller;

import java.util.ArrayList;

import model.BeverageComponent;
import model.Item;

public class Decorator extends BeverageComponent{{
	
	BeverageComponent beverage;
	public ArrayList<BeverageComponent> lowCalorieBeverages = new ArrayList<BeverageComponent>();
	
	public Item createItem(){
		return null;
	}
	public String getName(){
		return null;
	}
	public double getPrice(){
		return 0;
	}
	public double getCalories(){
		return 0;
	}
	
}
