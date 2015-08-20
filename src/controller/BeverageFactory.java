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
public class BeverageFactory implements ItemFactory {
    
    public Item createItem(String name){
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
