package j;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/g")
public class B extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public B() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String pass =request.getParameter("pass");
		PrintWriter p=response.getWriter();
		p.print("<h1>Qualification page.. </h1>");	
		p.print("<form action='hi' method='get'>");
		p.print("qua: <input type='text' name='qua'>");
		p.print("uni: <input type='text' name='uni'>");
		
		p.print("<input type='submit' value='next'>");
		
		p.print(" <input type='hidden' name='name' value="+name+">");
		p.print(" <input type='hidden' name='age' value="+age+">");
		p.print(" <input type='hidden' name='email' value="+email+">");
		p.print(" <input type='hidden' name='pass' value="+pass+">");
			p.print("</form>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
