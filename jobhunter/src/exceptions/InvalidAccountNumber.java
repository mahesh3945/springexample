package exceptions;

import java.util.Scanner;

class MyExceptionn extends Exception 
{
	String message;	
	public MyExceptionn()
	{
		message="Exception occured";
	}
	public MyExceptionn(String message)
	{
		this.message=message;
	}
@Override
public String getMessage() {


return message;
}
	
}
public class InvalidAccountNumber
{
	static void check(int num)throws MyExceptionn
	{
		if(num<0)
		{
			throw new MyExceptionn("NUmber should not be -Ve");
		}
		else if (! (num>=1000 && num<=100000))
		{
			throw new MyExceptionn("the account number should be in between 1000 and 100000");
		}
		else
		{
			//process
			System.out.println("valid account number");
		}
	}
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the account number:");
		int num=sc.nextInt();
		try { 
			check(num);
		} catch (MyExceptionn e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
