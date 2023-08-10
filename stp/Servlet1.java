package stp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() {
        super();
      
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String fname=req.getParameter("fname");
		   String lname=req.getParameter("lname");
		   Cookie cf=new Cookie(fname,lname);
		     res.addCookie(cf);
		     res.setContentType("text/html");
		     PrintWriter ob=res.getWriter();
		     ob.println("<h1>femily detail</h1><br>");
		     ob.println("<form action='s2' method='get'>");
		     ob.println("Father Name: <input type='text' name='faname'><br>");
		     ob.println("Mother Name: <input type='text' name='moname'><br>");
		     ob.println("Brother/Sister : <input type='checkbox' name='br' value='brother'>");
		     ob.println("<input type='checkbox' name='sis' value='sister'><br>");
		     ob.println("<input type='submit' value='Next'>");
		     ob.println("</form>");
		     
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
