package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class MyServlet extends HttpServlet {
	
	static class User{
		String username;
		String password;
		
		User(String username , String password){
			this.username = username ;
			this.password = password;
		}
	}
	
	 private List <User> users = new ArrayList<User>();
	 
	 @Override
	 public void init() throws ServletException{
		 users.add(new User("Rohan Kumar", "rohan123"));
		 users.add(new User("MK Kumar", "mk123"));
		 users.add(new User("PK Kumar", "pk123"));
	 }
	 
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myname = (String) req.getParameter("name1");
		String mypass = (String) req.getParameter("pass1");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		boolean isValid = false;
		
		for(User user : users) {
			if( user.username.equals(myname) && user.password.equals(mypass)) {
				isValid = true;
				break;
			}
		}
		
		
        if (isValid) {
            res.setStatus(HttpServletResponse.SC_OK); // 200
            out.println("<h2>Login Successful! Welcome, " + myname + ".</h2>");
            System.out.println("Login Successfull");
        } else {
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 401
            out.println("<h2>Login Failed! Invalid username or password.</h2>");
            System.out.println("Login Failed!");
        }
		
	}
}
