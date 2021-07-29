package jdbcprograms;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedJdbcMethods 
{
 	public void addStudent(Connection con,PreparedStatement pst,Scanner sc) throws SQLException
	{
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
 	public void display(Connection con,PreparedStatement pstt,Scanner sc) throws SQLException
 	{  
 		System.out.println("enter the table name:");
 		String name = sc.next();
 		pstt.setString(1, name);
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
		}
 	}
	public void updateStudent(Connection con,PreparedStatement pst1,Scanner sc) 
	{
			System.out.println("enter the student dob:");
			String dob=sc.next();
			System.out.println("enter the student id:");
			int id=sc.nextInt();
			try {
				pst1.setString(1, dob);
				pst1.setInt(2, id);
				int resultset=pst1.executeUpdate();
				System.out.println(resultset +"record updated");
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
		}
	public void deleteStudent(Connection con,PreparedStatement pst2,Scanner sc)
	{
		System.out.println("enter the student id:");
		int id=sc.nextInt();
		
		try {
			pst2.setInt(1, id);
			int rs=pst2.executeUpdate();
					} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("record deleted succesfully.");
	}
	public void select(Connection con,PreparedStatement pst3,Scanner sc) throws SQLException
	{
		System.out.println("enter the first id:");
		int id1=sc.nextInt();
		System.out.println("enter the second id:");
		int id2=sc.nextInt();
		
		pst3.setInt(1, id1);
		pst3.setInt(2, id2);
		ResultSet rs=pst3.executeQuery();
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
			}
	}
	public void search(Connection con,PreparedStatement pst4,Scanner sc) throws SQLException
	{
		System.out.println("enter the id:");
		int id=sc.nextInt();
		pst4.setInt(1, id);
		ResultSet rs= pst4.executeQuery();
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
				if(id==rsmd.getColumnCount())
				{
					System.out.println(rsmd);
				}
				System.out.print(rs.getString(i)+"\t\t");
			}
			System.out.println();
			}
	}
	public void sort(Connection con,PreparedStatement pst5,Scanner sc) throws SQLException
	{
		System.out.println("ente the sorting order by marks:");
		String str = sc.next();
		pst5.setString(1, str);
		ResultSet rs= pst5.executeQuery();
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
			}
	}
}
