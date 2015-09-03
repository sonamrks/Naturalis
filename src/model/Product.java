/**
 * 
 */
package model;

public interface Product {
	
    public int getCode();
    public String getName();
    public void setName(String name);
    public int getProtein();
    public void setProtein(int protein);
    public int getSugars();
    public void setSugars(int sugars);
    public int getCarbohydrates();
    public void setCarbohydrates(int carbohydrates);
    public int getCalories();
    public void setCalories(int calories);
    public double getPrice();
    public void setPrice(double price);
    public String getPicturePath();
    public int getCount();
    public void setCount(int count);
    public String getType();

}