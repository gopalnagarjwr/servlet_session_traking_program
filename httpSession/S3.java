package httpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s3")
public class S3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public S3() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String qua=req.getParameter("qua");
        String collage=req.getParameter("collage");
        HttpSession session=req.getSession();
                  String name=(String)session.getAttribute("name");
                  String pass=(String)session.getAttribute("pass");
                  String add=(String)session.getAttribute("add");
                  String phone=(String)session.getAttribute("phone");
     
        PrintWriter ob=res.getWriter();
        res.setContentType("text/html");
        ob.print("<h1>user data..</h1><br>");
        ob.print("user name : "+name+"<br>");
        ob.print("user password : "+pass+"<br>");
        ob.print("user Address : "+add+"<br>");
        ob.print("user phone number : "+phone+"<br>");
        ob.print("user qualification : "+qua+"<br>");
        ob.print("user collage : "+collage+"<br>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
