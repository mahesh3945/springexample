import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaExample {

	public static void main(String[] args)
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft = config.buildSessionFactory();
		Session session = sft.openSession();
		// Criteria Examples
		/*Criteria ctr=session.createCriteria(ProductPojo.class);
		//ctr.add(Restrictions.gt("productCost", 1000));
		ctr.addOrder(Order.asc("productName"));
		ctr.setMaxResults(1);
		ctr.setFirstResult(2);
		
		List<ProductPojo> list3=ctr.list();
		System.out.println("Productid \t productName \t productcost \t productmfd \n*****************");
		for (ProductPojo string : list3)
		{
			
		System.out.println(string.getProductId()+"\t"+string.getProductName()+"\t"+string.getProductCost()+"\t"+string.getProductMdate());	
		}*/
		//projection
		/*Criteria ctr=session.createCriteria(ProductPojo.class);
		ctr.setProjection(Projections.property("productName"));
		List<String> list3=ctr.list();
		System.out.println("productName \n ***********");
		for (String string : list3)
		{
			System.out.println(string);	
		}*/
		Criteria ctr=session.createCriteria(ProductPojo.class);
		ProjectionList plist=Projections.projectionList();
		
		plist.add(Projections.property("productName"));
		plist.add(Projections.property("productCost"));
		ctr.setProjection(plist);
		
		List<Object[]> list3=ctr.list();
		for (Object[] objects : list3) 
		{
			System.out.println(objects[0]+"\t"+objects[1]);
		}
		

	}
}
