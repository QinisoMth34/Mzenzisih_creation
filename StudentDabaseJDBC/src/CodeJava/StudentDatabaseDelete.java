package CodeJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDatabaseDelete {
	
	//Deleting the record for Nontobeko as she has graduated.
	public static void main(String[] args) {
		String databaseURL = "jdbc:ucanaccess://Students.accdb";
			try {
	        Connection connection = DriverManager.getConnection(databaseURL);
		     //  SQL delete statement
	         Statement stmt = connection.createStatement();
		       {		      
		         String sql = "DELETE FROM Students " + "WHERE id = 10";
		         stmt.executeUpdate(sql);
		         ResultSet rs = stmt.executeQuery(sql);
		         while(rs.next()){
		            System.out.print("ID: " + rs.getInt("ID"));
		            System.out.print(", student_id: " + rs.getInt("student_id"));
		            System.out.print(", First: " + rs.getString("first_name"));
		            System.out.println(", Last_name: " + rs.getString("last_name"));
		            }  
	    }connection.close();
		
		}catch (SQLException e) {
			
		    e.printStackTrace();	
	   }
	}
}
