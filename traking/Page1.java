package traking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go")
public class Page1 extends HttpServlet {

    public Page1() {
        super();

   }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
       String name=request.getParameter("name");
       String fname=request.getParameter("fname");
       String mname=request.getParameter("mname");
       PrintWriter ob=response.getWriter();
       ob.println("<form action='go1'  method='get'>");
       ob.println("Address <input type='text' name='a'><br>");
       ob.println("Father's Address : <input type='text' name='fa'><br>");
       ob.println("Mother's Address : <input type='text' name='ma'><br>");
       ob.println("<input type='submit' value='Next >'>");
         ob.println("<input type='hidden'name='name' value="+name+">");
         ob.println("<input type='hidden' name='fname' value="+fname+">");
         ob.println("<input type='hidden'  name='mname' value="+mname+">");
       ob.println("</form>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
