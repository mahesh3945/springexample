package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSqlExample
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		
		JdbcSql jdbcsql = new JdbcSql();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		System.out.println("coneected successfully");
		Scanner sc= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ " 1)add the student details\n "
					+ " 2)update the student details \n"
					+ "  3)delete the student details\n"
					+ "  4)alter student details\n"
					+ "  5)create table product\n"
					+"**********************************************************\n "
					+ "enter the number :");
		ch= sc.nextInt();
		switch(ch)
		{
		case 1: jdbcsql.addStudent(sc, con, st);
		break;
		case 2: jdbcsql.updateStudent(sc, con, st);
		break;
		case 3: jdbcsql.deleteStudent(sc, con, st);
		break;
		case 4: jdbcsql.alterOperatons(sc, con, st);
		break;
		case 5:jdbcsql.createTable(sc, con, st);
		break;
		case 6:
		default:System.out.println("invalid option");
		break;
		}}
		while(ch!=6);
		sc.close();
		}
}
