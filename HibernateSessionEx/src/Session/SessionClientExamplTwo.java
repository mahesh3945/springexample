package Session;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionClientExamplTwo {

	public static void main(String[] args) 
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft = config.buildSessionFactory();
		Session session = sft.openSession();
		Query qry=session.createQuery("from ProductPojo");
		qry.setCacheable(true);
		List<ProductPojo>list=qry.list();
		for (ProductPojo productPojo : list)
		{
			System.out.println(productPojo.getProductId()+"\t"+productPojo.getProductName());
		}
		session.close();
		Session session1 = sft.openSession();
		Query qry1=session1.createQuery("from ProductPojo");
		qry1.setCacheable(true);
		List<ProductPojo>list1=qry1.list();
		for (ProductPojo productPojo1 : list)
		{
			System.out.println(productPojo1.getProductId()+"\t"+productPojo1.getProductName());
		}
		session1.close();
		Session session2 = sft.openSession();
		Criteria qry2=session2.createCriteria(ProductPojo.class);
		qry2.setCacheable(true);
		List<ProductPojo>list2=qry2.list();
		for (ProductPojo productPojo2 : list)
		{
			System.out.println(productPojo2.getProductId()+"\t"+productPojo2.getProductName());
		}
		session2.close();
		Session session3 = sft.openSession();
		Criteria qry3=session3.createCriteria(ProductPojo.class);
		qry3.setCacheable(true);
		List<ProductPojo>list3=qry3.list();
		for (ProductPojo productPojo3 : list)
		{
			System.out.println(productPojo3.getProductId()+"\t"+productPojo3.getProductName());
		}
		session3.close();
	}

}
