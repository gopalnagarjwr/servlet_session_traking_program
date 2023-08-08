package traking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go4")
public class Page5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Page5() {
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
	       String qua=request.getParameter("Q");
	       String f_qua=request.getParameter("fq");
	       String m_qua=request.getParameter("mq");
	       String hobby=request.getParameter("h");
	       String f_hob=request.getParameter("fh");
	       String m_hob=request.getParameter("mh");
	       PrintWriter ob=response.getWriter();
	       ob.println("<form action='go5'  method='get'>");
	       ob.println("sallery <input type='text' name='s'><br>");
	       ob.println("Father's sellery : <input type='text' name='fs'><br>");
	       ob.println("Mother's  sellery : <input type='text' name='ms'><br>");
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
	         ob.println("<input type='hidden' name='Q' value="+qua+">");
	         ob.println("<input type='hidden' name='fq' value="+ f_qua+">");
	         ob.println("<input type='hidden' name='mq' value="+ m_qua+">");
	         ob.println("<input type='hidden'name='h' value="+hobby+">");
	         ob.println("<input type='hidden'name='fh' value="+ f_hob+">");
	         ob.println("<input type='hidden'name='mh' value="+ m_hob+">");
	         ob.println("</form>");
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
