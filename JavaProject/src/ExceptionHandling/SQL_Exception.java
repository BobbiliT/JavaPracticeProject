package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL_Exception {
	public static void main(String[] args) {
		  try {  
	            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");  
	            // Perform database operations...  
	            connection.close();  
	        } catch (SQLException e) {  
	            System.out.println("SQL error occurred: " + e.getMessage());  
	        }  
	}
}
