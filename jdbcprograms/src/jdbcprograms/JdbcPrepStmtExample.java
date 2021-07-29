package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcPrepStmtExample
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		java.sql.PreparedStatement pst= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		String choice;
		do
		{
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
		
		
		pst.setInt(1, s);
		pst.setString(2, name);
		pst.setString(3, dob);
		pst.setString(4, addres);
		pst.setString(5, email);
		pst.setLong(6, contactno);
		pst.setInt(7, mark);
		
		int result=pst.executeUpdate();		
		System.out.println(result+" record(s) inserted");
		System.out.println("Do u want to insert one more record :");
		choice = sc.next();
		}
		while(choice.equalsIgnoreCase(choice));
		}
	    catch(ClassNotFoundException | SQLException e )
	    {
		e.printStackTrace();
	     }
	     sc.close();
}
		
	}

