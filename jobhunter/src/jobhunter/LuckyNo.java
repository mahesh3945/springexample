package jobhunter;

import java.util.Scanner;

public class LuckyNo

{

	public static void main(String[] args)
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
	sc.close();
	}
}