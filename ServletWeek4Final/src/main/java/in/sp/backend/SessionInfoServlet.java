package in.sp.backend;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/sessioninfo")
public class SessionInfoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(false); // get existing session
        if(session != null && session.getAttribute("session_name") != null) {
            out.print(session.getAttribute("session_name"));
        } else {
            out.print("Guest");
        }
    }
}
