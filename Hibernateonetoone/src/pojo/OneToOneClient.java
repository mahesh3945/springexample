package pojo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class OneToOneClient {

	public static void main(String[] args)
	{
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft=config.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tsx = session.beginTransaction();
		
		StudentPojo sp = new StudentPojo();
		sp.setStudentName("Mahesh");
		sp.setStudentId(111);
		sp.setStudentCourse("CSE");
		sp.setStudentFee(5555);
		
		PersonDetailsPojo pdp = new PersonDetailsPojo();
		pdp.setStudentId(111);
		pdp.setPersonFirstName("Ganesh");
		pdp.setPersonEmailId("Mahesh@gmail.com");
		
		sp.setPersonDetails(pdp);
		session.save(pdp);
		session.save(sp);
		
		tsx.commit();
		}

}
