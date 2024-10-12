package CodeJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String databaseURL = "jdbc:ucanaccess://Students.accdb";
		
		
			try {
				Connection connection = DriverManager.getConnection(databaseURL);
				
				System.out.println("Connected to MS database!");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
