package log.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitform")
public class myservlet extends HttpServlet{
		@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{ 
			
			String name = req.getParameter("username");
			String email = req.getParameter("useremail");
			
			System.out.println("User Name : "+name+" ");
			System.out.println(" User EMail : "+email);
			
			PrintWriter out = resp.getWriter();
			out.println("User Name : "+name);
			out.println("User EMail: "+email);
			
}
		
}