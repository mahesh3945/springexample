package coreClient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.CoreInterfaces;

public class ClientLogic {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		CoreInterfaces coreinterface=(CoreInterfaces) context.getBean("Core");
		System.out.println("Sum of Two numbers:"+coreinterface.add(5, 8));
		System.out.println(coreinterface.getDateMessage("Mahesh"));
		
				
		CoreInterfaces coreinterface1=(CoreInterfaces) context.getBean("Core");
		System.out.println("Sum of Two numbers:"+coreinterface1.add(5, 8));
		System.out.println(coreinterface1.getDateMessage("Mahesh"));
		
		context.close();
		
	}

}