package traking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go1")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Page2() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("name");
	       String fname=request.getParameter("fname");
	       String mname=request.getParameter("mname");
	       String address=request.getParameter("a");
	       String f_addres=request.getParameter("fa");
	       String m_address=request.getParameter("ma");
	       PrintWriter ob=response.getWriter();
	       ob.println("<form action='go2'  method='get'>");
	       ob.println("Contect no. <input type='text' name='c'><br>");
	       ob.println("Father's Contect no. : <input type='text' name='fc'><br>");
	       ob.println("Mother's Contect no. : <input type='text' name='mc'><br>");
	       ob.println("<input type='submit' value='Next >'>");
	       ob.println("<input type='hidden'name='name' value="+name+">");
	         ob.println("<input type='hidden' name='fname' value="+fname+">");
	         ob.println("<input type='hidden'  name='mname' value="+mname+">");
	         ob.println("<input type='hidden' name='a' value="+address+">");
	         ob.println("<input type='hidden' name='fa' value="+f_addres+">");
	         ob.println("<input type='hidden' name='ma' value="+m_address+">");
	       ob.println("</form>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
