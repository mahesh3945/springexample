package OopsConcepts;

import java.util.Scanner;

public class OperatorsExam 
{

	 void BiggestNo()
	 {
				int x, y, z;
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the x value: ");
				x = in.nextInt();

				System.out.println("Enter the y value: ");
				y = in.nextInt();

				System.out.println("Enter the z  value: ");
				z = in.nextInt();

				if (x > y && x > z)
					System.out.println("x value is largest.");
				else if (y > x && y > z)
					System.out.println("y value is largest.");
				else if (z > x && z > y)
					System.out.println("z value is largest.");
				else
					System.out.println("Entered numbers are not distinct.");

		}
	 
	 
	 void DataType()
	 {

				byte b=127;
				short s=32767;
				int i=2147483647;
				long l=3456567892l;
				float f=4.55f;
				double  d=3.22;
				char c='A';
				boolean one = true;
				System.out.println("byte value= "+b+"\n"
				+"Short value="+s+"\n"
				+"int value="+i+"\n"
				+"long value="+l+"\n"
				+"float value="+f+"\n"
				+"double value="+d+"\n"
				+"char value="+c+"\n"
				+"boolean value="+one);
				
			}
	 void PrimeNo()
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
	 
	 void OpeStar()
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
	 }
void LuckyNo()

	 {
		
			Scanner sc = new Scanner(System.in);
	 		System.out.println("enter the number");
	 		int x=sc.nextInt();
	 		int sum;
	 	do
	 	{
	 		sum=0;
	 		while(x>0)
	 		{
	 			int r=x%10;
	 			sum=sum+r;
	 			x=x/10;
	 		}
	 		x=sum;		
	 	}
	 	while(x>9);
	 	System.out.println("sum  is "+sum);
	 }
	public static void main(String[] args) 
	{
		OperatorsExam oe=new OperatorsExam();
	
		Scanner scr= new Scanner(System.in);
		int ch;
		do{
			
		System.out.println("ente ur choice\n 1)Biggestno \n 2)Datatype\n 3)star Pattern\n 4)Prime no\n 5)lucky no\n 6)exit");
		ch=scr.nextInt();
		
		
		/*oe.BiggestNo();
		oe.DataType();
		oe.OpeStar();
		oe.PrimeNo();*/
		
		switch (ch)
		{
		case 1:oe.BiggestNo();
		break;
		case 2:oe.DataType();
		break;
		case 3:oe.OpeStar();
		break;
		case 4:oe.PrimeNo();
		break;
		case 5:oe.LuckyNo();
		break;
		case 6:
		break;

		default:System.out.println("Your enter wrong no");
			break;
		}
		}while(ch!=6);
		scr.close();
	}
}
