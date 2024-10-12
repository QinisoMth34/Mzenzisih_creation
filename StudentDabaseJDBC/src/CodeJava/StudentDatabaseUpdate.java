package CodeJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDatabaseUpdate {

	public static void main(String[] args) {
		//Updating the current entry in the database’s student table.
		String databaseURL = "jdbc:ucanaccess://Students.accdb";
		 int studentIdToUpdate = 202117299;
	        String newLastName = "Ndlozi";
		try {
	        Connection connection = DriverManager.getConnection(databaseURL);
		
	        String sql = "UPDATE students SET last_name = ? WHERE student_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newLastName);
            preparedStatement.setInt(2, studentIdToUpdate);

            //runs the update statement
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student's last name updated successfully.");
            } else {
                System.out.println("No student with student_id " + studentIdToUpdate + " found.");
            }

	
		connection.close();
		
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
