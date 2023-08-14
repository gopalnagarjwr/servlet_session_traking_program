package httpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s2")
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public S2() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String add=req.getParameter("add");
        String phone=req.getParameter("number");
        HttpSession session=req.getSession();
             session.setAttribute("add",add);
             session.setAttribute("phone",phone);
             PrintWriter ob=res.getWriter();
             res.setContentType("text/html");
             ob.println("<center><h1>Welcome To third Page</h1>");
             ob.println("<form action='s3' method='get'>");
             ob.println("Qualification : <input type=\"text\" name=\"qua\" placeholder=\"qualification\"><br><br>");
             ob.println("Collage : <input type=\"text\" name=\"collage\" placeholder=\"collage\"><br><br>");
             ob.println("< <button type=\"submit\" >submit ></button>");
             ob.println("</form>");
             ob.println("</center>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
