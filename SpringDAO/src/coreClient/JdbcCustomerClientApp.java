package coreClient;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.Customer;
import core.CustomerDAO;

public class JdbcCustomerClientApp {
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		CustomerDAO customerdao=(CustomerDAO) context.getBean("Customerjdbc");
		Customer cstmr = new Customer();
		/*cstmr.setAge(11);
		cstmr.setName("Mahesh");
		cstmr.setCustId(111);
		customerdao.insert(cstmr);
		System.out.println("Values are inserted\n"+cstmr.getAge()+"\t"+cstmr.getCustId()+"\t"+cstmr.getName());*/
	//customerdao.delete(111);
		customerdao.update(55);
	}

}
