package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class JdbcStmtExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		//Oracle Driver 
			Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
				
		/*Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		
		System.out.println("enter the student id:");
	    int s=sc.nextInt();
		System.out.println("enter the student name:");
		String name=sc.next();
		System.out.println("enter the date of birth:");
		String dob = sc.next();
		System.out.println("enter the address:");
		String addres=sc.next();
		System.out.println("enter the email id:");
		String email=sc.next();
		System.out.println("enter the contact no");
		long contactno=sc.nextLong();
		System.out.println("enter the student marks:");
		int mark=sc.nextInt();
		
		Statement st= con.createStatement();
		int Resultset = st.executeUpdate("insert into student values("+s+",'"+name+"','"+dob+"','"+ addres +"','"+email+"',"+contactno+")");		
		System.out.println(Resultset+" recor d(s) inserted")*/
		System.out.println("Connection Establisheds");
		}
		catch(ClassNotFoundException | SQLException e )
		{
			e.printStackTrace();
		}
		sc.close();
	}
	
}
