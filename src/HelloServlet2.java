import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("Heyy I am <b> Servlet 2</b>.");	
		pw.println("Welcome to <b> HelloServlet2.java </b> file.<br>");
		
		pw.print("<a href='Servlet2.html'>Back</a>");
		
	}

}
