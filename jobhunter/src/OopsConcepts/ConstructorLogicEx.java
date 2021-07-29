package OopsConcepts;

import java.util.Scanner;

public class ConstructorLogicEx
{
	public void insertion(ConstructorEx[] ce,Scanner sc)
	{
		for(int i=0;i<ce.length;i++)
		{
			System.out.println("enter the product id");
			int pid=sc.nextInt();
			System.out.println("enter the product name");
			String pname=sc.next();
			System.out.println("enter the product color");
			String pcolor=sc.next();
			System.out.println("enter the product cost");
			int pcost=sc.nextInt();
			ce[i]= new ConstructorEx(pid,pname,pcolor,pcost);
			
	    }
	}
	public void display(ConstructorEx[] ce)
	{
		System.out.println("PRODUCT ID \tPRODUCT NAME\t PRODUCT COLOR\t PRODUCT COST");
		System.out.println("==================================================================");
		for(int i=0;i<ce.length;i++)
		{
		System.out.println(ce[i].getProductId()+"\t"+"\t"+ce[i].getProductName()+"\t"+"\t"+"\t" +ce[i].getProductColor()+"\t"+"\t"+ce[i].getProductCost());
		}
	}
	public void search(ConstructorEx[] ce,Scanner sc)
	{
		boolean check=false;
		System.out.println("check the product id whether is exist or not \n enter the stid  :");
		int s=sc.nextInt();
		for(int i=0;i<ce.length;i++)
		{
			if(s==ce[i].getProductId())
		{
			System.out.println("Product id is exist" + ce[i].getProductId());
			check=true;
			break;
		}	 
		
		}
			if(!check) 
			{
				System.out.println("product id does not  exist" );
			}
	}
	public void FindProduct(ConstructorEx[] ce,Scanner sc,int productId)
	{
		boolean check=false;
		/*System.out.println("check the product id whether is exist or not \n enter the stid  :");
		int s=sc.nextInt();*/
		for(int i=0;i<ce.length;i++)
		{
			if(productId==ce[i].getProductId())
		{
			System.out.println("Product id is exist" + ce[i].getProductId());
			check=true;
			break;
		}	
		
		}
			if(!check) 
			{
				System.out.println("product id does not  exist" );
			}
	}
	public void FindProduct(ConstructorEx[] ce,Scanner sc,String productName)
	{
		boolean check=false;
		/*System.out.println("check the product name whether is exist or not \n enter the stid  :");
		 String s=sc.next();*/
		for(int i=0;i<ce.length;i++)
		{
			if(productName.equals(ce[i].getProductName()))
		{
			System.out.println("Product name is exist" + ce[i].getProductName());
			check=true;
			break;
		}	
		
		}
			if(!check)
			{
				System.out.println("product name does not  exist" );
			}
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of products");
		int x=sc.nextInt();
		ConstructorEx[] ce=new ConstructorEx[x];
		ConstructorLogicEx cle= new ConstructorLogicEx(); 

		Scanner scr= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert product details \n 2)display the product details \n"+ ""
					+ "3)check the product id \n"
					+ "4)check the product id \n"
					+ "5)check the product name\n"
					+ " ***********************************************************\n "
					+ "enter the number :");
		ch= scr.nextInt();
				
		switch(ch)
		{
		case 1: cle.insertion(ce,scr);
		break;
		case 2: cle.display(ce);
		break;
		case 3: cle.search(ce, scr);
		break;
		case 4:
		
		System.out.println("enter product id to search");
		int productId=sc.nextInt();
		cle.FindProduct(ce, scr, productId);
		break;
		case 5:
		System.out.println("enter product name to search");
		String productName=sc.next();
		cle.FindProduct(ce, scr, productName);
		break;
		case 6:
		break;
		default:System.out.println("invalid option");
		break;
		}
		}
		while(ch!=6);
		scr.close();
		}	
	}
