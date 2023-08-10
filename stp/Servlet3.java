package stp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		   String qa=req.getParameter("qa");
		   String col=req.getParameter("collage");
		   Cookie c4=new Cookie(qa,col);
		     res.addCookie(c4);
		     res.setContentType("text/html");
		     PrintWriter ob=res.getWriter();
		     ob.println("<h1>Contact detail</h1><br>");
		     ob.println("<form action='s4' method='get'>");
		     ob.println("Email: <input type='text' name='em'><br>");
		     ob.println("Mobile number : <input type='text' name='mn'><br>");
		     ob.println("Next : <input type='submit' value='next'>");
		     ob.println("</form>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
