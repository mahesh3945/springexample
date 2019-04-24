package Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionClientExample {

	public static void main(String[] args) throws InterruptedException
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft = config.buildSessionFactory();
		Session session = sft.openSession();
		ProductPojo productPojo=(ProductPojo)session.get(ProductPojo.class, 7);
		//session.clear();
		ProductPojo productPojo1=(ProductPojo)session.get(ProductPojo.class, 7);
		if(productPojo!=null)
		{
		System.out.println(productPojo.getProductId()+"\t"+productPojo.getProductName()+"\t"+ productPojo.getProductCost()+"\t"+ productPojo.getProductMdate());
		
		//productPojo.setProductName("SamSung");
	
		}
		
		if(productPojo1!=null)
		{
			System.out.println(productPojo.getProductId()+"\t"+productPojo.getProductName()+"\t"+ productPojo.getProductCost()+"\t"+ productPojo.getProductMdate());
		}
		session.close();
		Thread.sleep(4500);
		Session session1=sft.openSession();
		ProductPojo productPojo2=(ProductPojo)session1.get(ProductPojo.class, 7);
		//session.clear();
		
		ProductPojo productPojo3=(ProductPojo)session1.get(ProductPojo.class, 7);
		if(productPojo2!=null)
		{
		System.out.println(productPojo2.getProductId()+"\t"+productPojo2.getProductName()+"\t"+ productPojo2.getProductCost()+"\t"+ productPojo2.getProductMdate());
		
		//productPojo.setProductName("SamSung");
	
		}
		if(productPojo3!=null)
		{
			System.out.println(productPojo3.getProductId()+"\t"+productPojo3.getProductName()+"\t"+ productPojo3.getProductCost()+"\t"+ productPojo3.getProductMdate());
		}
		
	}

}
