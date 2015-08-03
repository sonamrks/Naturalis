package model;


public class Juice implements BeverageComponent{

	private String name ="juice";
	private double price = 4;
	private int calories = 50;
	
	
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
	public int getCalories(){
		return calories;
	}
	public void setCalories(int calories){
		this.calories = calories;
	}
	public  void addBeverage(BeverageComponent beverage){
		
	}
	public  void removeBeverage(BeverageComponent beverage){
		
	}
}
