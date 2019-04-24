package com.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DetailsFill")
public class DetailsFill extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst;
    public DetailsFill()
    {
        super();

    }
	public void init() throws ServletException
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		pst = con.prepareStatement("insert into RoomDetails values (?,?,?,?,?,?,?,?,?,?)");
		
	}
	catch(ClassNotFoundException|SQLException e)
	{
		System.out.println(e);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try
		{
			String fname= request.getParameter("fname");
			String laname= request.getParameter("lname");
			String gender= request.getParameter("choice");
			String mnumber= request.getParameter("mnumber");
			String commments= request.getParameter("area");
			String country= request.getParameter("country");
			String state= request.getParameter("state");
			String sname= request.getParameter("sname");
			String anum= request.getParameter("anumber");
			String pin = request.getParameter("pin");
			
			pst.setString(1, fname);
			pst.setString(2, laname);
			pst.setString(3, gender);
			pst.setString(4, mnumber);
			pst.setString(5, commments);
			pst.setString(6, country);
			pst.setString(7, state);
			pst.setString(8, sname);
			pst.setString(9, anum);
			pst.setString(10, pin);
			int rs=pst.executeUpdate();
			response.sendRedirect("DetailsSuccess.html");
			
			
		}
		catch (SQLException e)
		{
		 System.out.println(e);
		}
		
	}
}
