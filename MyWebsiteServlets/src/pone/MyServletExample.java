package pone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyServletExample() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException    //   1st
	{
		
		System.out.println("initialized");
		
	}

	
	public void destroy()   //  last
	{
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("get method is execute");
	
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	pw.print("<html>");
	pw.print("<body bgcolor=red>");
	pw.print("<h1>get method is execute</h1>");
	pw.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post method is execute");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<html>");
		pw.print("<body bgcolor=purple>");
		pw.print("<h1>post method is execute</h1>");
		pw.print("</html>");
	}

}
