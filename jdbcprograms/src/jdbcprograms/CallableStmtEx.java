package jdbcprograms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStmtEx {

	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
	    CallableStatement cst=con.prepareCall("{ call get_student (?,?,?,?,?,?,?)}");
		cst.setInt(1, 224);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.VARCHAR);
		cst.registerOutParameter(4, Types.VARCHAR);
		cst.registerOutParameter(5, Types.VARCHAR);
		cst.registerOutParameter(6, Types.BIGINT);
		cst.registerOutParameter(7, Types.INTEGER);
		cst.execute();
		
		System.out.println(cst.getString(2));
		System.out.println(cst.getString(3));
		System.out.println(cst.getString(4));
		System.out.println(cst.getString(5));
		System.out.println(cst.getString(6));
		System.out.println(cst.getString(7));
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

	}

}
