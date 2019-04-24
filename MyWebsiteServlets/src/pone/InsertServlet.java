package pone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst; 
    public InsertServlet() {
        super();
    }
	public void init(ServletConfig config) throws ServletException
	{
		/*
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");*/
			ServletContext ctx=config.getServletContext();		
			try
			{
				String drivername=ctx.getInitParameter("Driver");
				String url=ctx.getInitParameter("url");
				String username=ctx.getInitParameter("username");
				String passwd=ctx.getInitParameter("password");
				
				Class.forName(drivername);
				Connection con = DriverManager.getConnection(url,username,passwd);
		pst= con.prepareStatement("insert into webpagedb values(?,?,?,?,?,?,?)");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		try
		{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String pass=request.getParameter("pass");
		String mail=request.getParameter("email");
		String number=request.getParameter("number");
		String sex=request.getParameter("sex");
		String months=request.getParameter("month");
		String days=request.getParameter("DOBDay");
		String years=request.getParameter("DOBYear");
		String dob=days+"-"+months+"-"+years;
		
		pst.setString(1, fname);
		pst.setString(2, lname);
		pst.setString(3, pass);
		pst.setString(4, mail);
		pst.setString(5, number);
		pst.setString(6, sex);
		pst.setString(7, dob);
		int result=pst.executeUpdate();
		out.println("<h1>registered successfully</h1>");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
