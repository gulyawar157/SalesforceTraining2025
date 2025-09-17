package newpack;

import java.sql.*;


public class First1 {

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
		Statement stmt = conn.createStatement();
		
		//**********To retrieve the data : 
//		String query = "SELECT * FROM students";
//		 ResultSet rs = stmt.executeQuery(query); 
//		
//	            System.out.println("Connection Successful!");
//
//	            
//	            while (rs.next()) {
//	                System.out.print(rs.getString("name") + " ");
//	                System.out.print(rs.getInt("id") + " ");
//	                System.out.println(rs.getInt("age"));
//	            }
		
		// *******To insert the data : 
		
//		String query = String.format("INSERT INTO students (id, name, age) VALUES (%d , '%s', %d) ", 3423, "Tom", 29);
//		int rowsAffected = stmt.executeUpdate(query);
//		
//		if(rowsAffected >0) {
//			System.out.println("Data Inserted Successfuly");
//			
//		}else {
//			System.out.println("Data not Inserted Successfuly");
//		}
		
		
		//***** To update data --
	
//				String query = String.format("UPDATE students SET age = %d WHERE id = %d", 33, 5211);
//				int rowsAffected = stmt.executeUpdate(query);
//				
//				if(rowsAffected >0) {
//					System.out.println("Data Updated Successfuly");
//					
//				}else {
//					System.out.println("Data not Updated Successfuly");
//				}
		
		//***** To delete the  data --
//		
		String query = String.format("DELETE FROM students WHERE id = %d", 5211);
		int rowsAffected = stmt.executeUpdate(query);
		
		if(rowsAffected >0) {
			System.out.println("Data Deleted Successfuly");
			
		}else {
			System.out.println("Data not Deleted Successfuly");
		}
		
	}
	
		catch (SQLException ep) {
			System.out.println(ep.getMessage());
        }
		
	}

}
