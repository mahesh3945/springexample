package jobhunter;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args)
	{
		int count =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  number:");
		int x=sc.nextInt();
		for(int i=2; i<x;i++)
		{
			if(x%i ==0 )
			{
				count++;
		
		break;
		}
		}
		if(count==1 || x==1)
		{
			System.out.println("not a prime no");
		}
		else
		{
			System.out.println("its prime no");
		}
		
		/*
		if (x%2==1 && x%1==0 && x%x==0)
		{
			System.out.println("the given number is prime.");
		}
		else
		{
			System.out.println("the given numer is not prime");
		}
		*/

	}

}
