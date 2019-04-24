package jobhunter;

import java.util.Scanner;

public class Singledi {

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("enter array size:");
		int x= scr.nextInt();
		int empids[]=new int[x];
		for (int i = 0; i < empids.length; i++) 
		{
			System.out.println("Enter value");
			empids[i]=scr.nextInt();
		}					
		System.out.println("--Array Elements are---");
		for (int i = 0; i < empids.length; i++) {
			System.out.println(empids[i]);
		}
	}

}
