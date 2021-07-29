package jobhunter;

import java.util.Scanner;

public class ArrayM {

	public static void main(String[] args)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the rows");
		int x = scr.nextInt();
		System.out.println("enter the col");
		int y = scr.nextInt();
		int mat[][] = new int[x][y];
		for (int i = 0; i < mat.length; i++)
		{ 
			for (int j = 0; j < mat[i].length; j++) 
			{
				System.out.println("Enter values");
				mat[i][j] = scr.nextInt();
			}
		}
		System.out.println("The Boundary Elements are:" + "\n" + "====================");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length ; j++)
			{
				/*if (i == 0 || j == 0 || i == mat.length - 1 || j == mat.length - 1)*/
					System.out.print(mat[i][j] + "\t");
				/*else
					System.out.print(" \t");*/
			}	
			System.out.println();
		}
	}
}
