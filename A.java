package j;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public A() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		PrintWriter p=response.getWriter();
		p.print("<h1>Email page </h1>");	
		p.print("<form action='g' method='get'>");
		p.print("email: <input type='text' name='email'>");
		p.print("pass: <input type='text' name='pass'>");
		
		p.print("<input type='submit' value='next'>");
		
		p.print(" <input type='hidden' name='name' value="+name+">");
		p.print(" <input type='hidden' name='age' value="+age+">");	
			p.print("</form>");
		
			
		

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
