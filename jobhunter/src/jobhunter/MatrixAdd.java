package jobhunter;

import java.util.Scanner;

public class MatrixAdd 
{

	           public static void main(String[] args) {
		       Scanner s = new Scanner(System.in);
		       System.out.print("Enter number of rows: ");
		       int rows = s.nextInt();
		       System.out.print("Enter number of columns: ");
		       int columns = s.nextInt();
		       int[][] a = new int[rows][columns];
		       int[][] b = new int[rows][columns];
		       System.out.println("Enter the first matrix");
		       for (int i = 0; i < rows; i++)
		       {
		           for (int j = 0; j < columns; j++)
		           {
		               a[i][j] = s.nextInt();
		               		           
		           }
		       }
		       for (int i = 0; i <a.length; i++) 
				{
					for (int j = 0; j < a.length ; j++)
					{
						/*if (i == 0 || j == 0 || i == mat.length - 1 || j == mat.length - 1)*/
							System.out.print(a[i][j] + "\t");
						/*else
							System.out.print(" \t");*/
					}	
					System.out.println();
				}
		       
		       System.out.println("Enter the second matrix");
		       for (int i = 0; i < rows; i++) {
		           for (int j = 0; j < columns; j++) {
		               b[i][j] = s.nextInt();
		           }
		       }
		       int[][] c = new int[rows][columns];
		       for (int i = 0; i < rows; i++) {
		           for (int j = 0; j < columns; j++) {
		               c[i][j] = a[i][j] + b[i][j];
		           }
		       }
		       System.out.println("The sum of the two matrices is");
		     
					for (int i = 0; i < rows; i++) {
		           for (int j = 0; j < columns; j++){
		               System.out.print(c[i][j] + "\t");
		           }
		           System.out.println();
		       }
		   }
}


