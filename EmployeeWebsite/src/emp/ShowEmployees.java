package emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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

import com.mysql.jdbc.PreparedStatement;

@WebServlet("/ShowEmployees")
public class ShowEmployees extends HttpServlet
{
	java.sql.PreparedStatement pst;
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException
	{
		//servlet Context
		ServletContext ctx=config.getServletContext();		
		try
		{
			String drivername=ctx.getInitParameter("Driver");
			String url=ctx.getInitParameter("url");
			String username=ctx.getInitParameter("username");
			String passwd=ctx.getInitParameter("password");
			
			Class.forName(drivername);
			Connection con = DriverManager.getConnection(url,username,passwd);
			//by using normal declaration
			/*try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
			pst= con.prepareStatement("insert into webpagedb values(?,?,?,?,?,?,?)"); 
			 */
		pst= con.prepareStatement("select * from employee");
		}
		catch(ClassNotFoundException|SQLException e)
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
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			 out.print("<table align=center border=5>");
				for(int i=1; i<rsmd.getColumnCount(); i++)
				{
					out.println("<th>"+rsmd.getColumnName(i)+"</th>");
				}
			 while(rs.next())
			 {  					
				out.println("<tr>");
				int eid=0;
				for(int i=1; i<rsmd.getColumnCount(); i++)
				{		eid=rs.getInt(1);			
	             out.println("<td>"+rs.getString(i)+"</td>");
				}
				out.print("<td><a href='http://localhost:8088/EmployeeWebsite/emp/FindServelt' >Delete</td>");
				out.print("</tr>");	                
		     }
			/* else
			 {
				 out.println("<h1>no records found</h1>");
				 out.println("<a href='http://localhost:8088/EmployeeWebsite/html/Search.html'>Search again!</a>");
			 }*/
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
