package stp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s5")
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		   String id=req.getParameter("id");
		   String pass=req.getParameter("pass");
		     Cookie [] arr=req.getCookies();
		  String fname=arr[0].getName();
		  String lname=arr[0].getValue();
		  String faname=arr[1].getName();
		  String mname=arr[1].getValue();
		  String br=arr[2].getName();
		  String sis=arr[2].getValue();
		  String qua=arr[3].getName();
		  String coll=arr[3].getValue();
		  String email=arr[4].getName();
		  String phone=arr[4].getValue();
		  res.setContentType("text/html");
		     PrintWriter ob=res.getWriter();
		     ob.println("<h1>User Data</h1><br>");
		     ob.println("Id : "+id+"<br>");
		     ob.println("Passwords :"+pass+"<br>");
		     ob.println("First Name :"+fname+"<br>");
		     ob.println("Last Name :"+lname+"<br>");
		     ob.println("Father's Name :"+faname+"<br>");
		     ob.println("Mother Name :"+mname+"<br>");
		     ob.println("Brother :"+br+"<br>");
		     ob.println("Sis :"+sis+"<br>");
		     ob.println("Qualification :"+qua+"<br>");
		     ob.println("Collage Name :"+coll+"<br>");
		     ob.println("Email :"+email+"<br>");
		     ob.println("phone :"+phone+"<br>");
		     
		   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
