package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class SelectExample
{
	public static void main(String[] args) 
	{
		SelectExampleMethods sem = new SelectExampleMethods();
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		System.out.println("coneected successfully");
		Statement st = con.createStatement();		
		Scanner sc = new Scanner(System.in);		
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
			 +"1) table from database\n"
					+"2)sql where command \n"+ ""
					+  "3)display the table data \n"
					+  "4)Ascending order \n"
					+  "5)descending order\n"
					+  "6)group by sql command\n"
					+  "7)\n"
					+ " ***********************************************************\n "
					+ "enter the number :");
		ch= sc.nextInt();
		
		switch(ch)
		{
		case 1: sem.select(con, st);
		break;
		case 2:sem.where(con, st,sc);
		break;
		case 3:sem.show(con, st);
		break;
		case 4: sem.like(con, st);
		break;
		case 5: sem.descending(con, st);
		break;
		case 6:sem.groupBy(con, st);
		break;
		case 7:sem.delete(con, st, sc);
		break;
		case 8:
		break;
		case 9:
		break;			
		case 10:
		}
		}
		while(ch!=10);
		}
		catch(ClassNotFoundException | SQLException e )
		{
			e.printStackTrace();
		}

	}

}