package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedJdbcMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		PreparedJdbcMethods pjm = new PreparedJdbcMethods();
		
		int ch;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
		java.sql.PreparedStatement pst= con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		PreparedStatement pstt = con.prepareStatement("select * from (?)");
		PreparedStatement pst1= con.prepareStatement("update student set student_dob= ? where student_id=?");
		PreparedStatement pst2= con.prepareStatement("delete from student where student_id=?");
		PreparedStatement pst3 = con.prepareStatement("select * from student where student_id between ? and ?");
		PreparedStatement pst4 = con.prepareStatement("select * from student where student_id = ? ");
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ " 1)add the student details\n "
					+ " 2)Display the student details \n"
					+ "  3)update the student details \n"
					+ "  4)delete the student details\n"
					+ "  5)display student details by using ID\n"
					+ "  6)search student by using id\n"
					+ "  7)sorting for students table\n"
					+"**********************************************************\n "
					+ "enter the number :");
		ch= sc.nextInt();
		switch(ch)
		{
		case 1: pjm.addStudent(con, pst, sc);
		break;
		case 2: pjm.display(con, pstt, sc);
		break;
		case 3: pjm.updateStudent(con, pst1, sc);
		break;
		case 4: pjm.deleteStudent(con, pst2, sc);
		break;
		case 5: pjm.select(con, pst3, sc);
		break;
		case 6: pjm.search(con, pst4, sc);
		break;
		case 7: pjm.sort(con, pst, sc);
		break;
		case 8:
		default:System.out.println("invalid option");
		break;
		}}
		while(ch!=8);
		sc.close();
}
		}
