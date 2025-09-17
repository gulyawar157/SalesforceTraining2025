package newpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Second_PreparedStatement {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		   String username = "root";
			String password = "dataengineer";
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
		         catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		        }
		
		try {
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			
			//* TO insert 
			
//			String query = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)"; 
//		   
//			PreparedStatement prprdstmt = conn.prepareStatement(query);
//		
//			prprdstmt.setInt(1, 3244);
//			prprdstmt.setString(2, "Mike");
//			prprdstmt.setInt(3, 38);
//			
//		int rowsAffected = prprdstmt.executeUpdate();
//			if(rowsAffected >0) {
//				System.out.println("Data Updated Successfuly");
//				
//			}else {
//				System.out.println("Data not Updated Successfuly");
//			}
			
			//*************SELECT
//			String query = "SELECT age FROM students WHERE id = ?"; 
//			   
//			PreparedStatement prprdstmt = conn.prepareStatement(query);
//			prprdstmt.setInt(1, 3244);
//
//			 ResultSet rs = prprdstmt.executeQuery(); 
//	            System.out.println("Connection Successful!");
//
//	            
//	            while (rs.next()) {
//	                System.out.print( "AGE : " + rs.getString("age") );
//	               
//	            }
			
			
			//* To update 
//			String query = "UPDATE students SET age = ? WHERE id = ?"; 
//			   
//			PreparedStatement prprdstmt = conn.prepareStatement(query);
//		
//			prprdstmt.setInt(1, 12);
//			prprdstmt.setInt(2, 4321);
//			
//		int rowsAffected = prprdstmt.executeUpdate();
//		if(rowsAffected >0) {
//			System.out.println("Data Updated Successfuly");
//			
//		}else {
//			System.out.println("Data not Updated Successfuly");
//		}
//		
			
			
			
			String query = "DELETE FROM students WHERE id = ?"; 
			   
			PreparedStatement prprdstmt = conn.prepareStatement(query);
		
			prprdstmt.setInt(1, 4987);
		
			
		int rowsAffected = prprdstmt.executeUpdate();
		if(rowsAffected >0) {
			System.out.println("Data Deleted Successfuly");
			
		}else {
			System.out.println("Data  Deleted Successfuly");
		}
		

        // Close the connection
        conn.close();
        prprdstmt.close();
        System.out.println("Connection closed.");
        
		}
		
		catch (SQLException ep) {
			System.out.println(ep.getMessage());
        }
	}

}
