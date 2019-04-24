
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class CustomerDetails {

	
	public static void main(String[] args)
	{			
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");		
		SessionFactory sft=config.buildSessionFactory();
		
		Session  session=sft.openSession();	
		Transaction tx=session.beginTransaction();
		
		
		Customer customer = new Customer();
		customer.setCustomer_name("mahesh");
		customer.setCustomer_address("New Hapshire");
		customer.setCustomer_email("ganesh@mail.com");
		customer.setCustomer_mobile(888855);
		
		session.save(customer);
		tx.commit();
		System.out.println("record inserted..");
		
		session.close();		
		sft.close();
	}
}