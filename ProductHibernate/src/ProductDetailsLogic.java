import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDetailsLogic
{
	public static void main(String[] args) 
	{
		
		SessionFactory sft = ConfigureExample.getsessionfactory();
		Session session = sft.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("table Created");
		
		ProductPojo pp= new ProductPojo();
		pp.setProductName("LapTop");
		pp.setProductCost(55555);
		pp.setProductMdate("22/02/1888");	
		System.out.println("records inserted..");
		
		session.save(pp);
		tx.commit();
		session.close();		
		sft.close();
		
	}

}
