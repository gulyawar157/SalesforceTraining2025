package in.sp.backend;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.sql.*;

@WebServlet("/mylogin")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // Server-side validation
        if(email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            out.print("fail:Email or Password cannot be blank");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/usermanagement";
            String dbUser = "root";
            String dbPass = "dataengineer";

            Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
            String query = "SELECT name FROM userdata WHERE email=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                String name = rs.getString("name");

                // ✅ Save name in session
                HttpSession session = req.getSession();
                session.setAttribute("session_name", name);
                
            System.out.println("Login Successfull");
      out.print("success:" + name);
            } else {
                out.print("fail:Invalid Email or Password");
            }

            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
            out.print("error:" + e.getMessage());
        }
    }
}
