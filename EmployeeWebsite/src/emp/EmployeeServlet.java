package emp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet 
{
	java.sql.PreparedStatement pst;
	private static final long serialVersionUID = 1L;
    public EmployeeServlet()
    {
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
		pst= con.prepareStatement("insert into employee values(?,?,?,?,?)");
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
		try {
		String employeeid=request.getParameter("eid");
		String employeename=request.getParameter("ename");
		String employeeage = request.getParameter("eage");
		String employeesal = request.getParameter("esal");
		String employeedes= request.getParameter("edesignation");
		pst.setString(1, employeeid);
		pst.setString(2, employeename);
		pst.setString(3, employeeage);
		pst.setString(4, employeesal);
		pst.setString(5, employeedes);
		int res =pst.executeUpdate();
		out.println("<h1>registered successfully</h1>");
		out.println("<a href='http://localhost:8088/EmployeeWebsite/html/Home.html'>Goto Home!</a>");
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
