package jobhunter;

import java.util.Scanner;

public class OpeStar
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value =");
		x = sc.nextInt();
		for (int i=0; i<x; i++)
		{
			
			for (int j=0; j<=i; j++)
			{
				System.out.print("* ");
					
			}
			System.out.println();
			
		}
		sc.close();
	}

}
 