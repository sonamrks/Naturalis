package controller;

import controller.ItemFactory;
import java.sql.Connection;
import model.BeverageComponent;
import java.lang.reflect.Constructor;
import model.Coke;

/**
 *
 * @author Sonam
 */
public class BeverageFactory implements ItemFactory{

    public BeverageFactory(){
    }
    
    public BeverageComponent createItem(String name){
		BeverageComponent beverage = null;
		
		try {
                    beverage = (BeverageComponent) Class.forName(name).newInstance();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return beverage;
	}
	
}
