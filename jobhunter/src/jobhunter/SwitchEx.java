package jobhunter;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args)
	{
		int x; 
		Scanner sc= new Scanner(System.in);
		System.out.println("ente the x value:");
		x=sc.nextInt();
		
		switch(x)
		{
		case 1:System.out.println("case 1 was executed");
		break;
		case 2:System.out.println("case 2 was executed");
		break;
		case 3:System.out.println("case 3 was executed");
		break;
		case 4:System.out.println("case 4 was executed");
		break;
		default: System.out.println("default was executed");
		}
		sc.close();
	}

}
