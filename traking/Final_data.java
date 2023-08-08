package traking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/go5")
public class Final_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Final_data() {
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
	       String sal=request.getParameter("s");
	       String f_sal=request.getParameter("fs");
	       String m_sal=request.getParameter("ms");
	       PrintWriter ob=response.getWriter();
	       ob.println("Owner Name : "+name+"<br>");
	       ob.println(" Father's Name : "+fname+"<br>");
	       ob.println("Mother's Name : "+mname+"<br>");
	       ob.println("Owner Address : "+address+"<br>");
	       ob.println("Father's Address : "+f_addres+"<br>");
	       ob.println("Mother's Address : "+m_address+"<br>");
	       ob.println("Owner Contect : "+ contect+"<br>");
	       ob.println("Father's Contect : "+f_contect+"<br>");
	       ob.println("Mother's Contect : "+m_contect+"<br>");
	       ob.println("Owner Qualification : "+ qua+"<br>");
	       ob.println("Father's Qua : "+f_qua+"<br>");
	       ob.println("Mother's Qua : "+m_qua+"<br>");
	       ob.println("Owner Hobbies : "+ hobby+"<br>");
	       ob.println("Father's Hobb : "+f_hob+"<br>");
	       ob.println("Mother's Hobb : "+m_hob+"<br>");
	       ob.println("Owner sallary : "+ sal+"<br>");
	       ob.println("Father's sallary : "+f_sal+"<br>");
	       ob.println("Mother's sallary : "+m_sal+"<br>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
