package Annotationss;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StudentClientExample {

	public static void main(String[] args) 
	{
		AnnotationConfiguration aconfig=new AnnotationConfiguration();
		aconfig.configure();
		SessionFactory sft = aconfig.buildSessionFactory();
		Session session = sft.openSession();	
		Transaction tx=session.beginTransaction();
		
		StudentPojo spojo= new StudentPojo();
		spojo.setStudentName("Mahesh");
		spojo.setStudentCourse("Cse");
		
		
		session.save(spojo);
		tx.commit();
		System.out.println("record inserted..");
		System.out.println(spojo.getStudentCourse()+"\t"+spojo.getStudentName());
		
		session.close();		
		sft.close();

	}

}
