package in.sp.backend;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class MyServlet  extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myemail = (String) req.getParameter("email1");
		String mypass = (String) req.getParameter("pass1");
		
		if(myemail.equals("deep@gmail.com") && mypass.equals("deep123")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
	}
}
