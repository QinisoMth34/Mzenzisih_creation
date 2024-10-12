package CodeJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDatabaseInsert {

	public static void main(String[] args) {
		//Using the UcanAccess JDBC driver to connect to the database.
		String databaseURL = "jdbc:ucanaccess://Students.accdb";
	 
		try {
	        Connection connection = DriverManager.getConnection(databaseURL);
//my student number, first name, last name, date of birth, and major are entered here.
        String sql = "INSERT INTO Students (ID, student_id, first_name, last_name, date_of_birth, major) VALUES (?, ?, ?, ?, ?, ?)";
		
			PreparedStatement statement = connection.prepareStatement(sql); 
			statement.setString(1, "11");
			statement.setString(2, "201829436");
			statement.setString(3, "Simphiwe");
			statement.setString(4, "Ngubane");
			statement.setString(5, "1995-05-14");
			statement.setString(6, "BSC01");
			
			int rows = statement.executeUpdate();
			
			if (rows > 0) {
				System.out.println("A new student records has been inserted");
			}
		connection.close();
		
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
