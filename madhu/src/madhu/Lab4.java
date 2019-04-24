/*
 * Name:Madhavi kothapeta
 * Id card:1601010522
 * Class Session:Monday
 */
package madhu;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer:");
		long n = input.nextLong();
		System.out.println("Sum of the digits of Integer is :" + sumDigits(n));
		System.out.println("The reverse of the integer is :"+ reverse(n));
		System.out.println("It is a palindrome :"+ isPalindrome(n));
	}
	
	public static int sumDigits(long n){
		int sum = 0;
		do {
			sum += n%10;
		} while ((n=n/10)!=0);
		return sum;		
		}
		
	public static int reverse (long n) {
		long reverse = 0;
		while(n != 0)
		{
			reverse = reverse * 10;
			reverse = reverse + n%10;
			n = n/10;
		}
		return (int) reverse;
	}
	public static boolean isPalindrome(long number) 
	{
		
		int palindrome = (int) number;
		
		int reverse = 0;
		
		while (palindrome != 0) {
			
			int remainder = palindrome % 10;
		
			reverse = reverse * 10 + remainder;
			
			palindrome= palindrome/10;
		
		}
		
		if(number == reverse) 
		
		{
			
			return true;
		}
		
		return false;

	}

}
