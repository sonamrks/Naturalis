/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AshitaRaghu
 */
public class DatabaseConnection {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
private static final String DB_URL = "jdbc:mysql://localhost/designPatternsDB";
private static final String USER = "root";
private static final String PASS = "password";
private static DatabaseConnection dbConnectionInstance;
private static Connection connection;

public static DatabaseConnection getDatabaseConnectionInstance(){
        dbConnectionInstance = new DatabaseConnection();
    return dbConnectionInstance;
} 

public static Connection getConnection(){
    return connection;
} 

private DatabaseConnection() {
   try{

       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Connecting to database");
       connection = DriverManager.getConnection(DB_URL,USER,PASS);
       //connection.close();
   }
   catch(SQLException se){
       System.out.println("JDBC errors");
       se.printStackTrace();
   }catch(Exception err){
       System.out.println("Errors in Class.forName");
       err.printStackTrace();
  }
  
}	
}
