package traking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go2")
public class Page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Page3() {
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
	       String contect=request.getParameter("c");
	       String f_contect=request.getParameter("fc");
	       String m_contect=request.getParameter("mc");
	       PrintWriter ob=response.getWriter();
	       ob.println("<form action='go3'  method='get'>");
	       ob.println("Qualification <input type='text' name='Q'><br>");
	       ob.println("Father's qua. : <input type='text' name='fq'><br>");
	       ob.println("Mother's  qua. : <input type='text' name='mq'><br>");
	       ob.println("<input type='submit' value='Next >'>");
	       ob.println("<input type='hidden'name='name' value="+name+">");
	         ob.println("<input type='hidden' name='fname' value="+fname+">");
	         ob.println("<input type='hidden'  name='mname' value="+mname+">");
	         ob.println("<input type='hidden' name='a' value="+address+">");
	         ob.println("<input type='hidden' name='fa' value="+f_addres+">");
	         ob.println("<input type='hidden' name='ma' value="+m_address+">");
	         ob.println("<input type='hidden' name='c' value="+contect+">");
	         ob.println("<input type='hidden' name='fc' value="+ f_contect+">");
	         ob.println("<input type='hidden' name='mc' value="+ m_contect+">");
	       ob.println("</form>");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
