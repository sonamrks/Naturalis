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
    Connection connection;
    public BeverageFactory(Connection connection){
        this.connection = connection;
    }
	
	public BeverageComponent createItem(String name){
		BeverageComponent beverage = null;
		
		try {
			Constructor c = Class.forName(name).getConstructor(Connection.class);
                        beverage = new Coke(connection);
                        beverage = (BeverageComponent) c.newInstance(connection);
                         
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return beverage;
	}
	
}
