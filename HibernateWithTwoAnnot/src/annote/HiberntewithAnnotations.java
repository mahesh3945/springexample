package annote;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HiberntewithAnnotations
{

	public static void main(String[] args)
	{
		AnnotationConfiguration aconfig=new AnnotationConfiguration();
		aconfig.configure();
		SessionFactory sft = aconfig.buildSessionFactory();
		Session session = sft.openSession();	
		Transaction tx=session.beginTransaction();
		
		Customerrr cstmr = new Customerrr();
		cstmr.setCustomer_name("Mahesh");
		cstmr.setCustomer_address("San Franscisco");
		System.out.println("Customer Records inserted");
		session.save(cstmr);
		Empp em= new Empp();
		em.setEmpid(111);
		em.setEmpname("Ganesh");
		System.out.println("Employee Records inserted");
		tx.commit();
		
		session.close();
		
		
	}

}
