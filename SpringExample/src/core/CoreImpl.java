package core;

import java.util.Date;

public class CoreImpl implements CoreInterfaces
{

	private String message1;
	
	
	
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public CoreImpl() 
	{
	System.out.println("object created");
	}
	@Override
	public String getDateMessage(String username)
	{
		Date dt=new Date();		
		int hour=dt.getHours();
		String message="";
		if(hour<11)
		{
			message=message+" Good morning "+username;
		}
		else if(hour<16)
		{
			message=message+" Good Afternoon "+username;
		}
		else if(hour<20)
		{
			message=message+" Good Evening "+username;
		}
		else
		{
			message=message+" Good Night "+username;
		}
		return message+"\t"+message1;
		
	}

	@Override
	public int add(int a ,int b) 
	{
		return a+b;
		
	}
}
