import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HbntwohbmLogic {

	public static void main(String[] args) 
	{
		Configuration config= new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft=config.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tx=session.beginTransaction();
		Customerr cst = new Customerr();
		cst.setCustomer_id(111);
		cst.setCustomer_name("Maheshs");
		session.save(cst);
		tx.commit();
		System.out.println("customer records insrted");
		session.close();
		Session session1 = sft.openSession();
		Transaction tx1=session1.beginTransaction();
		Emp emp = new Emp();
		emp.setEmpname("Ganesn");
		emp.setEmpid(111);
		session1.save(emp);
		tx1.commit();
		System.out.println("emp values inserted");
		session1.close();
		
	}

}
