package jdbcprograms;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcSql
{
		public void addStudent(Scanner sc,Connection con,Statement st)
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
			try {
				int resultset=st.executeUpdate("insert into student values("+s+",'"+name+"','"+dob+"','"+ addres +"','"+email+"',"+contactno+")");
				}
			catch (SQLException e)
			{
				e.printStackTrace();
			} 
			System.out.println("record inserted");
		}
		public void updateStudent(Scanner sc,Connection con,Statement st)
		{
			System.out.println("enter the student dob:");
			String dob=sc.next();
			System.out.println("enter the student id:");
			int id=sc.nextInt();
			try {
				int resultset=st.executeUpdate("update student set student_dob='"+dob+"' where student_id="+id+"");
				} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			System.out.println("record updated");
		}
		public void deleteStudent(Scanner sc,Connection con,Statement st)
		{
			System.out.println("enter the student id:");
			int id=sc.nextInt();
			try {
				int resultset = st.executeUpdate("delete from student where student_id=("+id+")");
				} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			System.out.println("record deleted succesfully.");
		}
		public void alterOperatons(Scanner sc,Connection con,Statement st)
		{
			System.out.println("enter the student Mark:");
			String marks=sc.next();
			/*System.out.println("enter the data type:");
			String  datatype=sc.next();*/
			try {
				st.execute("alter table student delete "+marks+" ");/*"+datatype+"(30)*/
				
				} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			System.out.println("record deleted succesfully.");
		}
		public void createTable(Scanner sc,Connection con,Statement st)
		{
			System.out.println("enter the ");
			try {
				int resultset = st.executeUpdate("create table product (product_id int(10),product_name varchar(10))");
				} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			System.out.println("table created.");	
		}
}
