package jdbcprograms;

import java.sql.*;  
import java.io.*;  
public class imagejdbc {  
public static void main(String[] args) {  
try{  
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mahesh", "root", "mahesh3945");
              
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
ps.setString(1,"sonoo");  
  
FileInputStream fin=new FileInputStream("F:\\Example.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}  