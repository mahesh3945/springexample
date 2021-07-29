package onetoMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyClient {

	public static void main(String[] args)
	{
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft=config.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tx = session.beginTransaction();
				
		DepartmentPojo dp1 = new DepartmentPojo();
		dp1.setDepartmentId(111);
		dp1.setDepartmentName("Mahesh");
		dp1.setDepartmentEmail("mahesh@gmail.com");
		
		
		EmpPojo em = new EmpPojo();
		em.setEmpId(11);
		em.setEmpName("abc");
		em.setEmpSal(50000);
		em.setDepartmentId(111);
		EmpPojo em1 = new EmpPojo();
		em1.setEmpId(222);
		em1.setEmpName("xyz");
		em1.setEmpSal(60000);
		em.setDepartmentId(111);
		EmpPojo em2 = new EmpPojo();
		em2.setEmpId(333);
		em2.setEmpName("hyd");
		em2.setEmpSal(4444);
		em2.setDepartmentId(111);
	
		Set<EmpPojo> set = new HashSet<EmpPojo>();
		set.add(em);
		set.add(em1);
		set.add(em2);
		dp1.setEmps(set);
		session.save(dp1);
		tx.commit();
		
		
		
	}

}
