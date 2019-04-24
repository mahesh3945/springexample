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

@WebServlet("/InsertRecords")
public class InsertRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst;
        public InsertRecords()
        {
        super();
        }

	public void init() throws ServletException 
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "mahesh3945");
			pst = con.prepareStatement("insert into RoomMates values(?,?,?,?,?,?,?,?,?,?)");
			
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
		  String fname = request.getParameter("fname");
		  String lname = request.getParameter("lname");
		  String mail = request.getParameter("mail");
		  String pass = request.getParameter("pass");
		  String mobile = request.getParameter("mnumber");
		  String country = request.getParameter("country");
		  String state = request.getParameter("state");
		  String streetname = request.getParameter("sname");
		  String apt = request.getParameter("anumber");
		  String pin = request.getParameter("pin");
		  
		  pst.setString(1, fname);
		  pst.setString(2, lname);
		  pst.setString(3, mail);
		  pst.setString(4, pass);
		  pst.setString(5, mobile);
		  pst.setString(6, country);
		  pst.setString(7, state);
		  pst.setString(8, streetname);
		  pst.setString(9, apt);
		  pst.setString(10, pin);
		  
		  int rs = pst.executeUpdate();
		 out.println("<h1>registered successfully</h1>"); 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
