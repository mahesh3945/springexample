package jobhunter;

import java.util.Scanner;

public class OperaterEx {

	public static void main(String[] args)  
	{
		Scanner scr=new Scanner(System.in);
	    System.out.println("Enter number");
		int a=scr.nextInt();	
		String result= a%2==0?"Even" : "odd";
		System.out.println(result);
	scr.close();	
	}

}
