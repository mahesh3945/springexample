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


@WebServlet("/FindServelt")
public class FindServelt extends HttpServlet
{
	java.sql.PreparedStatement pst;
	java.sql.PreparedStatement pst1;
	private static final long serialVersionUID = 1L;
       
    
    public FindServelt() {
        super();
     }

	
	public void init(ServletConfig config) throws ServletException
	{
			// by using servlet Config
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
				pst= con.prepareStatement("select * from employee where emp_id =?");
				pst1=con.prepareStatement("delete from employee where emp_id =?");
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
		String button =request.getParameter("operations");
		if(button.equals("Find"))
		{
		try
		{
			String employeid= request.getParameter("emid");
			pst.setString(1, employeid);
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			 if(rs.next())
			 {  
				 out.print("<table border=5>");
					for(int i=1; i<rsmd.getColumnCount(); i++)
					{
						out.println("<th>"+rsmd.getColumnName(i)+"</th>");
					}
					
				out.println("<tr>");
				for(int i=1; i<rsmd.getColumnCount(); i++)
				{					
	             out.println("<td>"+rs.getString(i)+"</td>");
				}
				out.print("</tr>");	                
		     }
			 else
			 {
				 out.println("<h1>no records found</h1>");
				 out.println("<a href='http://localhost:8088/EmployeeWebsite/Search.html'>Search again!</a>");
			 }
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}
		else
		{
			try
			{
			String employeid= request.getParameter("emid");
			System.out.println(employeid);
			pst1.setString(1, employeid);
			int rs1 = pst1.executeUpdate();

			out.println("<h1>deleted Sucessfully");
			out.println("<a href='http://localhost:8088/EmployeeWebsite/Search.html'>Search again!</a>");
			}
			catch(SQLException e)
		    {
			e.printStackTrace();
		    }

			
		}
		
	}

}