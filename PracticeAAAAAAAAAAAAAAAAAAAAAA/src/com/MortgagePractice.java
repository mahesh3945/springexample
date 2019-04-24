package com;

import java.util.Scanner;

public class MortgagePractice 
{
	public void simpleInterest(Scanner scanner)
	{
		//p*n*i
		System.out.println("Enter the loan Amount(P):");
		int loanAmount=scanner.nextInt();
		System.out.println("Enter the Downpayment:");
		int down = scanner.nextInt();
		int pp = loanAmount-down;
		System.out.println("Enter the tax percentae:");
		float tax = scanner.nextFloat();
		double taxPay=tax/100*pp+pp;
		
		System.out.println("Enter Number of years:");
		int numberOfYears = scanner.nextInt();
		System.out.println("Enter the interest rate:");
		float interestRate =scanner.nextFloat();
		double totalAmount;
		totalAmount =(taxPay*(numberOfYears)*interestRate)/100;
		double finalAmount=totalAmount+pp;
		double xxxxx=finalAmount+taxPay;
		double monthlyPayment=(xxxxx/(numberOfYears*12));
		System.out.println("Interest:" + totalAmount);
		System.out.println("Total Amount with tax:"+ (xxxxx));
		System.out.println("Monthly Payment:"+monthlyPayment);
	}
	public void compoundInterest(Scanner scanner)
	{
		//Compound Interest = P(1 + R/100)r
		//P (1 + r/n) (nt) - P
		System.out.println("Enter the loan Amount(P):");
		int p=scanner.nextInt();
		
		System.out.println("Enter Number of years:");
		int y = scanner.nextInt();
		System.out.println("Enter the interest rate:");
		float rate =scanner.nextFloat();
		
		
		double totalAmount;
		totalAmount=p *(Math.pow((1 + rate / 100), y));
		
		System.out.println("Interest:" + totalAmount);
		System.out.println("Total Amount :"+ (totalAmount+p));
	}
	public void mortgageInterest()
	{
		
		
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		MortgagePractice mortgagepractice = new MortgagePractice();
		int in ;
		do
		{
		System.out.println("Choose the options: 1)simple interest 2)compound interest 3)mortgageinterest");
		in= scanner.nextInt();
		switch (in)
		{
		case 1:mortgagepractice.simpleInterest(scanner);
		break;
		case 2:mortgagepractice.compoundInterest(scanner);
		break;
		case 3:mortgagepractice.mortgageInterest();
		}
		}
		while (in!=4);
		{
			
		}
	scanner.close();
	}
	}
