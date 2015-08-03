package view;
import java.sql.*;
import model.*;
import model.HealthyBeverage;
import controller.BeverageFactory;
import controller.ItemFactory;

public class Demo {

public static void main(String[] args) {
    
   
   try{

     DatabaseConnection dbConnection = DatabaseConnection.getInstance();   
     Connection connection = dbConnection.getConnection();   
       
       ItemFactory factory1 = new BeverageFactory(connection);
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
  }/*finally{
       try{
           if(connection!=null)
           connection.close();
       }catch(SQLException se){
           se.printStackTrace();
       }*/
   }
  
   }

		
	
}

