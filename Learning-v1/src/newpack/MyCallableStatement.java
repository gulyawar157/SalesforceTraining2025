package newpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class MyCallableStatement {

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
			
			Connection con = DriverManager.getConnection(url, username, password);
	
            // 1. Prepare the CallableStatement
			   CallableStatement cs = con.prepareCall("{call getUserDetails(?,?)}");
			   
			   // 2. Set input parameter
			   cs.setInt(1, 4799);

	            // 3. Register output parameter
	            cs.registerOutParameter(2, Types.VARCHAR);

	            // 4. Execute
	            cs.execute();

	            // 5. Retrieve output
	            String name = cs.getString(2);
	            System.out.println("User Name: " + name);
		}
		catch(Exception ep) {
			System.out.println(ep.getMessage());
		}

	}

}

//
//
//   DELIMITER //
//    mysql> CREATE PROCEDURE getUserDetails(IN userId INT, OUT userName VARCHAR(50))
//   -> BEGIN
//   ->  SELECT name INTO userName FROM users WHERE id = userId;
//   -> END
//   -> //


// Stored procedure through my sql command client
