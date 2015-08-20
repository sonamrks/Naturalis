package controller;

import controller.ItemFactory;
import java.sql.Connection;
import model.Item;
import model.Beverage;
import java.lang.reflect.Constructor;
import model.Coke;

/**
 *
 * @author Sonam
 */
public class BeverageFactory extends ItemFactory {

    public BeverageFactory(){
    }
    
    public Beverage createItem(String name){
		Item beverage = null;
		
		try {
                    beverage = (Item) Class.forName(name).newInstance();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return beverage;
	}
	
}
