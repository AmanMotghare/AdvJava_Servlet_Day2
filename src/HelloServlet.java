import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		pw.println("Heyy I am <b> Servlet 1</b>.");	
		pw.println("Welcome to <b> HelloServlet.java </b> file.<br>");
		
		pw.print("<a href='Servlet1.html'>Back</a>");
		
	}
	
}
