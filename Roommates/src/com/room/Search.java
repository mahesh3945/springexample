package com.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement pst;
        public Search() {
        super();

    }
	public void init(ServletConfig config) throws ServletException 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "mahesh");
			pst = con.prepareStatement("select * from RoomDetails where lastname=?");
			}
		catch (ClassNotFoundException | SQLException e) 
		{
		 e.printStackTrace();
		}
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			try 
			{
				String lastname = request.getParameter("search");
				pst.setString(1, lastname);
				/*
				 * 
				 *  		pstt.setString(1, name);
 		ResultSet rs=pstt.executeQuery();
		ResultSetMetaData rsmd= rs.getMetaData();
		for(int i=1; i <= rsmd.getColumnCount();i++)
		{			
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println("\n=========================================================================");
		while(rs.next())
		{
			for(int i=1; i <= rsmd.getColumnCount();i++)
			{			
				System.out.print(rs.getString(i)+"\t\t");
			}
			System.out.println();
	
				 */
				ResultSet rs=pst.executeQuery();
				ResultSetMetaData rsmd = rs.getMetaData();
				/*if(rs.next())
				{
			        	ResultSetMetaData rsmd = rs.getMetaData();
					    out.println("<table align=center border=2>");*/
				        out.println("<table align=center border=2>");
						for(int i=1; i<rsmd.getColumnCount(); i++)
						{
							
							out.println("<th>"+rsmd.getColumnName(i)+"</th>");
						}
					 while(rs.next()) 
					 {  					
						out.println("<tr>");
						String lastname1;
						for(int i=1; i<rsmd.getColumnCount(); i++)
						{		lastname1=rs.getString(i);		
			             out.println("<td bgcolor= >"+rs.getString(i)+"</td>");
			             request.getRequestDispatcher("Displaydetails.html").include(request, response);
			            // sendRedirect("Displaydetails.html");
			            }
						out.print("</tr>");	                
				     }
				} 
			catch (Exception e) 
			{
			System.out.println(e);
			}
	}

}
