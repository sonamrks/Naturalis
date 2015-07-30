package model;

import java.util.ArrayList;

public interface Beverage extends Item {
	public void addBeverage(Beverage beverage);
	public void removeBeverage(Beverage beverage);
}
