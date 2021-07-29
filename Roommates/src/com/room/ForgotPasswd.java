package com.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ForgotPasswd")
public class ForgotPasswd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst;
    public ForgotPasswd()
    {
        super();
    }
	public void init(ServletConfig config) throws ServletException 
	
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
			pst=con.prepareStatement("update roommates set password= ? where mailId= ?");
			}
		catch (ClassNotFoundException|SQLException e) 
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
		String passd=request.getParameter("pass");
		//HttpSession session=request.getSession();
		
		//String mailid=(String)session.getAttribute("uname");
		String mailid = request.getParameter("uname");
		pst.setString(1, passd);
		pst.setString(2, mailid);
		int rs = pst.executeUpdate();
		out.println("<h5>Password Updated Sucessfully</h5><br/>");
		}
		catch(SQLException e )
		{
			e.printStackTrace();
		}
	}
}
