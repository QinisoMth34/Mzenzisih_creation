
package CodeJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDatabaseFinalConsole {

	public static void main(String[] args) {
		//Using the UcanAccess JDBC driver to connect to the database.
		String databaseURL = "jdbc:ucanaccess://Students.accdb";
	 
		try {
	        Connection connection = DriverManager.getConnection(databaseURL);
		
		String sql = "SELECT * FROM Students";
		
		System.out.println("Connected to MS database!");
		
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		//Conditional programming required 
		while (result.next()) {
			int id = result.getInt("ID");
			String student_id = result.getString("student_id");
			String firstname = result.getString("first_name");
			String lastname = result.getString("last_name");
			String dateofbirth = result.getString("date_of_birth");
			String major = result.getString("major");
			
			System.out.println(id + "."  +   student_id + "," + firstname + "," + lastname + "," + dateofbirth + "," + major + ",");

	}
		connection.close();
		
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
