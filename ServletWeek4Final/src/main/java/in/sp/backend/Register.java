package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerform")
public class Register extends HttpServlet {

    private static final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern pattern = Pattern.compile(emailRegex);

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String myname = req.getParameter("namer");
        String myemail = req.getParameter("emailr");
        String mypassword = req.getParameter("passr");
        String mygender = req.getParameter("genderr");
        String mycity = req.getParameter("cityr");

        // 1. Check empty fields
        if (myname == null || myname.trim().isEmpty() ||
            myemail == null || myemail.trim().isEmpty() ||
            mypassword == null || mypassword.trim().isEmpty() ||
            mygender == null || mygender.trim().isEmpty() ||
            mycity == null || mycity.equals("Select City") || mycity.trim().isEmpty()) {

            out.println("<script>alert('⚠️ All fields are required!'); window.history.back();</script>");
            return;
        }

        // 2. Email Verification
        Matcher matcher = pattern.matcher(myemail);
        if (!matcher.matches()) {
            out.println("<script>alert('Invalid Email Address!'); window.history.back();</script>");
            return;
        }

        // 3. Password length check
        if (mypassword.length() <= 5) {
            out.println("<script>alert('Password Length should be greater than 5!'); window.history.back();</script>");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/usermanagement";
        String username = "root";
        String password = "dataengineer";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            out.println("<h3 style='color:red'>JDBC Driver not found: " + e.getMessage() + "</h3>");
            return;
        }

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String query = "INSERT INTO userdata (name, email, password, gender, city) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypassword);
            ps.setString(4, mygender);
            ps.setString(5, mycity);

            int count = ps.executeUpdate();

            if (count > 0) {
                out.println("<h3 style='color:green'>✅ User Registered Successfully</h3>");
                out.println("<a href='Login.html'>Go to the Login Page</a>");
            } else {
                out.println("<h3 style='color:red'>❌ User Not Registered Due to Some Error</h3>");
                out.println("<a href='Register.html'>Try Again</a>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3 style='color:red'>Exception Occurred: " + e.getMessage() + "</h3>");
            out.println("<a href='Register.html'>Go Back</a>");
        }
    }
}
