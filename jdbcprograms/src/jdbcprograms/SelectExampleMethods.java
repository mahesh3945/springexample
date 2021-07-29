package jdbcprograms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SelectExampleMethods
{
	public void select(Connection con,Statement st) throws SQLException
	{
	ResultSet rs=st.executeQuery("select * from student");
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
	public void where(Connection con,Statement st,Scanner sc) throws SQLException
	{
		
		System.out.println("enter the student id:");
		int id=sc.nextInt();
		ResultSet rs=st.executeQuery("select * from student where student_id="+id+"");
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
	public void show(Connection con,Statement st) throws SQLException
	{
		ResultSet rs=st.executeQuery("select * from student");
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
	public void like(Connection con,Statement st) throws SQLException
	{
		ResultSet rs=st.executeQuery("select * from student order by studentmarks asc");
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
		public void descending(Connection con,Statement st) throws SQLException
		{
			ResultSet rs=st.executeQuery("select * from student order by studentmarks desc");
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
			public void  groupBy(Connection con,Statement st) throws SQLException
			{
				ResultSet rs=st.executeQuery("select student_name, studentmarks from student  ORDER BY studentmarks;");
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
			public void  delete(Connection con,Statement st,Scanner sc) throws SQLException
			{
				System.out.println("enter the student id:");
				int id=sc.nextInt();
				ResultSet rs=st.executeQuery("select *  from student where student_id="+id);
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
				rs.previous();
				rs.deleteRow();
				System.out.println("deleted successfully");
			}
}
