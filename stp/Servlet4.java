package stp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s4")
public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		   String email=req.getParameter("em");
		   String phone=req.getParameter("mn");
		   Cookie c5=new Cookie(email,phone);
		     res.addCookie(c5);
		     res.setContentType("text/html");
		     PrintWriter ob=res.getWriter();
		     ob.println("<h1>Id Details</h1><br>");
		     ob.println("<form action='s5' method='get'>");
		     ob.println("Id number: <input type='text' name='id'><br>");
		     ob.println("Password : <input type='text' name='pass'><br>");
		     ob.println("<input type='submit' value='next'>");
		     ob.println("</form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
