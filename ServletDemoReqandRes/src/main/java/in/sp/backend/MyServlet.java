package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		
		System.out.println("Name 1 : " + myname);
		System.out.println("Email 2 : " + myemail);
		PrintWriter out=  res.getWriter();
		out.println("Name 1 : " + myname);  
		out.println("Name 2 : " + myemail);
	}
}
