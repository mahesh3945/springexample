import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DmlOperations {

	public static void main(String[] args)
    {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft = config.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tx = session.beginTransaction();
		ProductPojo productPojo=(ProductPojo)session.get(ProductPojo.class, 2);
		if(productPojo!=null)
		{
		System.out.println(productPojo.getProductId()+"\t"+productPojo.getProductName()+"\t"+ productPojo.getProductCost()+"\t"+ productPojo.getProductMdate());
		
		//productPojo.setProductName("SamSung");
		session.delete(productPojo);
		tx.commit();
		}
		else
		{
			System.out.println("No Records Found..");
		}
	}

}
