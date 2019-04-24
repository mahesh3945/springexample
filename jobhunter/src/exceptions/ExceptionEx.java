package exceptions;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args)
	{
		
		
		try(Scanner sc= new Scanner(System.in);)
		{
			System.out.println("ente the number");
			int a=sc.nextInt();
			System.out.println("ente the second number");
			int b= sc.nextInt();
			if(b!=0)
			System.out.println("divison is :" + a/b);
			else
			{
			throw new ArithmeticException("input should not be a zero");	
			}
			System.out.println("addition:" +(a+b));			
		}
		catch(NullPointerException | ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e.toString());			
		}
		/*finally
		{
			System.out.println("finally block");
			
		}*/
		System.out.println("exceptions are close");
		
		System.out.println("exceptions are close");
		
		System.out.println("exceptions are close");
		System.out.println("exceptions are close");
		
			
	}

}
