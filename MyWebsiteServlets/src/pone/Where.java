package pone;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Where")
public class Where extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst; 
    
    public Where() {
        super();
        
    }

	public void init(ServletConfig config) throws ServletException
	{
		/*try
		{
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
		pst= con.prepareStatement("select * from webpagedb where mailid =? and password = ?");
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
		String usernames=request.getParameter("username");
		String pass=request.getParameter("pass");
		pst.setString(1, usernames);
		pst.setString(2, pass);
			System.out.println(usernames+"\t"+pass);
			
		ResultSet rs = pst.executeQuery();
		
		if(rs.next())
		{
			String args[]=usernames.split("@");
			out.println("<h1>Well come" + args[0]+"</h1>");
			HttpSession session=request.getSession();
			session.setAttribute("username",usernames);
			out.println("<a href ='http://localhost:8088/MyWebsite/html/forgot.html'>Change Password</a><br>");
			out.println("<a href ='http://localhost:8088/MyWebsite/html/Home.html'>gotohome</a>");
		}
		else
		{
			out.println("<h1>Invalid usename/password</h1>");
			out.println("<a href ='http://localhost:8088/MyWebsite/html/Home.html'>gotohome</a>");
		}
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}