package controller;

import controller.ItemFactory;
import java.sql.Connection;
import model.Product;
import model.Beverage;
import java.lang.reflect.Constructor;
import model.Coke;
import model.DatabaseConnection;

/**
 *
 * @author Sonam
 */
public class BeverageFactory implements ItemFactory {
    
    private static ItemFactory beverageFactory = new BeverageFactory();
    
    public static ItemFactory getBeverageFactoryInstance(){
        return beverageFactory;
    }
    private BeverageFactory(){
        
    }
    
    public Product createItem(String name){
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
