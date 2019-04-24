package jdbcprograms;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CallableStatementEx {
	public static void main(String[] args) 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
	    CallableStatement cst=con.prepareCall("{call add_student (?,?,?,?,?,?,?)}");
		cst.setInt(1, 223);
		cst.setString(2, "bharath");
		cst.setString(3, "5555-07-07");
		cst.setString(4, "fremont");
		cst.setString(5, "email@gmail.com");
		cst.setInt(6, 55);
		cst.setInt(7, 33);
		cst.execute();
		System.out.println("recored inserted ");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
