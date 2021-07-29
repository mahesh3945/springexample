package com.bean;
import java.util.Scanner;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class MainProgram
 {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
     addEmployees( );
   }
     public static void addEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = 0;
      
      try {
         tx = session.beginTransaction();
         for ( int i=0; i<5; i++ ) 
         {
           	 Scanner sc = new Scanner(System.in);
           	 System.out.println("Enter the first name:");
        	 String fname=sc.next();
        	 System.out.println("Enter the last name:");
        	 String lname=sc.next();
        	 System.out.println("Enter the salary:");
        	 int salary=sc.nextInt();
             EmployeExPojo employee = new EmployeExPojo(fname, lname, salary);
            session.save(employee);
         	if( i % 50 == 0 )
         	{
               session.flush();
               session.clear();
            }
           }
         
         tx.commit();
        
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return ;
   }
}
	
