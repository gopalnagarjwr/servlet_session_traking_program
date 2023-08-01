package j;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hi")
public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public C() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String pass =request.getParameter("pass");
		String qua=request.getParameter("qua");
		String uni =request.getParameter("uni");
		  PrintWriter pw=response.getWriter();
		  pw.print("Name : "+ name+"<br>");
		  pw.print("Age : "+age+"<br>");
		  pw.print("Email : "+email+"<br>");
		  pw.print("Password : "+pass+"<br>");
		  pw.print("Qualification : "+qua+"<br>");
		  pw.print("Univrcity : "+uni+"<br>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
