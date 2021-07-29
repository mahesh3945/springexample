import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlExample {

	public static void main(String[] args) 
	{
	    Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sft = config.buildSessionFactory();
		Session session = sft.openSession();
		Transaction tx=session.beginTransaction();
		/*Query query=session.createQuery("update ProductPojo  as P set P.productCost= ? ");
		query.setInteger(0, 1000);
		
		int result=query.executeUpdate();
		tx.commit();
		System.out.println(result + "records Updated");*/
		/*Query query =session.createQuery("delete from ProductPojo as p where p.productMdate like '2%' ");
		int result=query.executeUpdate();
		tx.commit();*/
		//Query query=session.createQuery("from ProductPojo as p order by p.productName  desc ");
		/*Query query=session.createQuery("from ProductPojo as p where p.productCost > 1000 ");
		List<ProductPojo> list1=query.list();
		System.out.println(" productId \t productName \t productcost \t productmfd  \n ***************************************\n ");
		for (ProductPojo productPojo : list1)
		{
			System.out.println(productPojo.getProductId()+"\t"+productPojo.getProductName()+"\t"+productPojo.getProductCost()+"\t"+productPojo.getProductMdate());
		}*/
		/*Query query=session.createQuery("select p.productName,p.productCost from  ProductPojo as p ");
		List<Object[]> list2=query.list();
		System.out.println(" productName \t productcost \n************************************\n");
		for (Object[] objects : list2)
		{
			System.out.println(objects[0]+"\t"+objects[1]);
		}
		*/
		Query query=session.createQuery("select p.productName from  ProductPojo as p ");
		List<String> list3=query.list();
		System.out.println("productName \n*****************");
		for (String string : list3)
		{
		System.out.println(string);	
		}
	}

}









