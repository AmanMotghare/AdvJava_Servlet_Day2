import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("Heyy I am <b> Servlet 3</b>.");	
		pw.println("Welcome to <b> HelloServlet3.java </b> file..<br>");
		
		pw.print("<a href='Servlet3.html'>Back</a>");
	}
	
}
