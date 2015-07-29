package controller;

import java.util.ArrayList;

import model.Beverage;
import model.Item;

public class Decorator extends Beverage{
	
	Beverage beverage;
	public ArrayList<Beverage> lowCalorieBeverages = new ArrayList<Beverage>();
	
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
