package pone;

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
import javax.servlet.http.HttpSession;

@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet                      
{
	public ForgotServlet()
	{
        super();
    }
	java.sql.PreparedStatement pst;
	private static final long serialVersionUID = 1L;
   
  	public void init(ServletConfig config) throws ServletException
	{
		ServletContext ctx=config.getServletContext();		
		try
		{
			String drivername=ctx.getInitParameter("Driver");
			String url=ctx.getInitParameter("url");
			String username=ctx.getInitParameter("username");
			String passwd=ctx.getInitParameter("password");
			
		Class.forName(drivername);
		Connection con = DriverManager.getConnection(url,username,passwd);
		pst=con.prepareStatement("update webpagedb set password= ? where mailid= ?");
		}
		catch(SQLException | ClassNotFoundException e)
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
		HttpSession session=request.getSession();
		String mailid=(String)session.getAttribute("username");
		pst.setString(1, passd);
		pst.setString(2, mailid);
		int rs = pst.executeUpdate();
		out.println("<h5>Password Updated Sucessfully</h5><br/>");
		out.println("<a href ='http://localhost:8088/MyWebsite/html/Home.html'>Change Password</a>");
		}
		catch(SQLException e )
		{
			e.printStackTrace();
		}
	}		
	}

