package java;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter an integer:");
		  long n = input.nextLong();
		 
		  System.out.println("The sum is " + sumDigits(n));
		  
		  palindromeNum();
		  
		  numReverse() ;
		  
		  
		 }
		 
		 public static int sumDigits(long n) {
		 
		  int sum = 0;
		  do {
		   sum += n % 10;
		 
		  } while ((n = n / 10) != 0);
		 
		  return sum;
		 
		 }
		 
		 private static void palindromeNum() {
			    
		     String inputnum, rev = "";
		       Scanner in = new Scanner(System.in);
		  
		       System.out.println("enter for palindrome");
		       inputnum = in.nextLine();
		  
		       int length = inputnum.length();
		  
		       for ( int i = length - 1; i >= 0; i-- )
		          rev = rev + inputnum.charAt(i);
		  
		       if (inputnum.equals(rev))
		          System.out.println("its a palindrome.");
		       else
		          System.out.println("its not a palindrome.");
		 }

		 private static void numReverse() {
		     
		     String original, reverse = "";
		     Scanner in = new Scanner(System.in);
		      
		       System.out.println("enter a number to reverse::: ");
		       original = in.nextLine();
		  
		       int length = original.length();
		  
		       for ( int i = length - 1; i >= 0; i-- )
		          reverse = reverse + original.charAt(i);
		     
		       
		       System.out.println("reversed number is ::" + reverse);
		 }
		 
		}

}
