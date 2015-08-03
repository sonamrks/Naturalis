package view;
import java.sql.*;
import model.BeverageComponent;
import model.HealthyBeverage;
import controller.BeverageFactory;

public class Demo {
	
            
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://localhost/test";
//specify the user name and password; 
// we use user "root" with password "mysql1"
static final String USER = "root";
static final String PASS = "password";
public static void main(String[] args) {
    
   Connection connection = null;
   Statement statement = null;
   try{

       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Connecting to database");
       connection = DriverManager.getConnection(DB_URL,USER,PASS);
       
       BeverageFactory factory1 = new BeverageFactory(connection);
       BeverageComponent item1 = factory1.createItem("model.Coke");
       System.out.println(item1.getCalories());
       
   



       connection.close();
   }
   catch(SQLException se){
       System.out.println("JDBC errors");
       se.printStackTrace();
   }catch(Exception err){
       System.out.println("Errors in Class.forName");
       err.printStackTrace();
  }finally{
       try{
           if(statement!=null)
           statement.close();
       }
       catch(SQLException se2){
       }
       try{
           if(connection!=null)
           connection.close();
       }catch(SQLException se){
           se.printStackTrace();
       }
   }
   System.out.println("Closed connection");

    
    
    /*Beverage item2 = factory1.createItem("model.Coke");
    System.out.println("item1: " + item1.getName());
    System.out.println("item2: " + item2.getName());

    Beverage healthyBeverages = new HealthyBeverage();
    healthyBeverages.addBeverage(item1);
    healthyBeverages.addBeverage(item2);

    System.out.println(healthyBeverages.getName());
    System.out.println(healthyBeverages.getCalories());*/
   }

		
	
}

