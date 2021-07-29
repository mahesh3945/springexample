package OopsConcepts;

import java.util.Scanner;

public class ParamPassinThroughMethod
{
	public void insertion(ParamPassingSetGet[] pp,Scanner sc)
	{
		for(int i=0;i<pp.length;i++)
		{
			System.out.println("enter the product id");
			int pid=sc.nextInt();
			System.out.println("enter the product name");
			String pname=sc.next();
			System.out.println("enter the product color");
			String pcolor=sc.next();
			System.out.println("enter the product cost");
			int pcost=sc.nextInt();
			pp[i]= new ParamPassingSetGet(pid,pname,pcolor,pcost);
			
	    }
	}
	public void display(ParamPassingSetGet[] pp)
	{
		System.out.println("PRODUCT ID \tPRODUCT NAME\t PRODUCT COLOR\t PRODUCT COST");
		System.out.println("==================================================================");
		for(int i=0;i<pp.length;i++)
		{
		System.out.println(pp[i].getProductId()+"\t"+"\t"+pp[i].getProductName()+"\t"+"\t"+"\t" +pp[i].getProductColor()+"\t"+"\t"+pp[i].getProductCost());
		}
	}
	public void search(ParamPassingSetGet[] pp,Scanner sc)
	{
		boolean check=false;
		System.out.println("check the product id whether is exist or not \n enter the stid  :");
		int s=sc.nextInt();
		for(int i=0;i<pp.length;i++)
		{
			if(s==pp[i].getProductId())
		{
			System.out.println("Product id is exist" + pp[i].getProductId());
			check=true;
			break;
		}	
		
		}
			if(!check) 
			{
				System.out.println("product id does not  exist" );
			}
	}
	/*
	public void FindProductee(ParamPassingSetGet[] pp,Scanner sc)
	{
		boolean check=false;
		System.out.println("check the product name whether is exist or not \n enter the stid  :");
		 String s=sc.next();
		for(int i=0;i<pp.length;i++)
		{
			if(s==pp[i].getProductName())
		{
			System.out.println("Product name is exist" + pp[i].getProductId());
			check=true;
			break;
		}	
		
		}
			if(!check)
			{
				System.out.println("product name does not  exist" );
			}
	}*/
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of products");
		int x=sc.nextInt();
		ParamPassingSetGet[] pp= new ParamPassingSetGet[x];
		ParamPassinThroughMethod ppt= new ParamPassinThroughMethod();

		Scanner scr= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert product details \n 2)display the product details \n"+ ""
					+ "3)check the product id \n"
					+ " ***********************************************************\n "
					+ "enter the number :");
		ch= scr.nextInt();
				
		switch(ch)
		{
		case 1: ppt.insertion(pp,scr);
		break;
		case 2: ppt.display(pp);
		break;
		case 3:ppt.search(pp, scr);
		break;
		case 4:
		default:System.out.println("invalid option");
		break;
		}
		}
		while(ch!=4);
		scr.close();
		}	
	}
