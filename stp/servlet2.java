package stp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public servlet2() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		   String faname=req.getParameter("faname");
		   String mname=req.getParameter("moname");
		   String br=req.getParameter("br");
		   String sis=req.getParameter("sis");
		   Cookie c1=new Cookie(faname,mname);
		   Cookie c3=new Cookie(br,sis);
		     res.addCookie(c1);
		     res.addCookie(c3);
		     res.setContentType("text/html");
		     PrintWriter ob=res.getWriter();
		     ob.println("<h1>Qualification detail</h1><br>");
		     ob.println("<form action='s3' method='get'>");
		     ob.println("qualification: <input type='text' name='qa'><br>");
		     ob.println("collage: <input type='text' name='collage'><br>");
		     ob.println("<input type='submit' value='next'>");
		     ob.println("</form>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
