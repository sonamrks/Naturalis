package model;


public class Coke implements BeverageComponent {
	
	private String name ="coke";
	private double price = 3.0;
	private double calories = 120;
	
	public Item createItem(){
		return new Coke();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getCalories(){
		return calories;
	}
	public void setCalories(double calories){
		this.calories = calories;
	}
	public  void addBeverage(BeverageComponent beverage){
		
	}
	public  void removeBeverage(BeverageComponent beverage){
		
	}
}
