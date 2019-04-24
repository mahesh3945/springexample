package jobhunter;

import java.util.Scanner;

public class Methods
{
	/**
	 * 
	 declaring variables
	*/
	int a=10;
	int b=23;
    /*Scanner sc= new Scanner(System.in);
    System.out.println("enter the a value");
    a=sc.nextInt();
    System.out.println("enter the b value:");
    b=sc.nextInt();
   */
	/**
	*
	*
	creating method for addition
	*/
			
	public void add()
	{
	    System.out.println(a+b); 
	}
	/**
	 *
	 *
	creating method for mul
	*/
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
		/**
		 * 
		creating object for a class to access the methods
		*/
		Methods mt= new Methods();
		/**
		 * 
		calling addition method
		*/
		mt.add();
		/**
		 * 
		calling mul method
		*/
		mt.mul();
		
	}

}
