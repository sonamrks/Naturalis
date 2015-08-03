package model;

import java.util.ArrayList;

public interface BeverageComponent extends Item {
	public void addBeverage(BeverageComponent beverage);
	public void removeBeverage(BeverageComponent beverage);
}
