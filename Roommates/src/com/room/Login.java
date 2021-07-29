package com.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst;  
    
    public Login() {
        super();
       
    }

	
	public void init(ServletConfig config) throws ServletException
	{
		
		try
		{
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		pst = con.prepareStatement("select * from RoomMates where mailId = ? and password = ?");
		} catch (ClassNotFoundException|SQLException ee)
		{
		System.out.println(ee);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try 
		{
			String uname =request.getParameter("uname");
			String pass = request.getParameter("pass");
			pst.setString(1, uname);
			pst.setString(2, pass);
			//System.out.println(uname+"\t"+pass);
	        ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
			response.sendRedirect("http://localhost:8088/Roommates/Details.html");
			/*out.println("<a href ='http://localhost:8088/MyWebsite/html/forgot.html'>Change Password</a><br>");
			out.println("<a href ='http://localhost:8088/MyWebsite/html/Home.html'>gotohome</a>");
		    */}
		    else
		    {
			out.println("<h1>Invalid usename/password</h1>");
			out.println("<a href ='http://localhost:8088/MyWebsite/html/Home.html'>gotohome</a>");
	        }
	   		}
		catch (Exception e)
		{
		System.out.println(e);
		}
		
	}


	
}
