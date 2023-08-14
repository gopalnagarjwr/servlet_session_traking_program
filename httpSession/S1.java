package httpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public S1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	             String name=req.getParameter("name");
	             String pass=req.getParameter("pass");
	             HttpSession session=req.getSession();
	                  session.setAttribute("name",name);
	                  session.setAttribute("pass",pass);
	                  PrintWriter ob=res.getWriter();
	                  res.setContentType("text/html");
	                  ob.println("<center><h1>Welcome To First Page</h1>");
	                  ob.println("<form action='s2' method='get'>");
	                  ob.println("Address : <input type=\"text\" name=\"add\" placeholder=\"Address\"><br><br>");
	                  ob.println("Phone number : <input type=\"text\" name=\"number\" placeholder=\"Phone number\"><br><br>");
	                  ob.println("< <button type=\"submit\" >submit ></button>");
	                  ob.println("</form>");
	                  ob.println("</center>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
