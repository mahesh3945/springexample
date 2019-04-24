package OopsConcepts;
 
import java.util.Scanner;

public class OverLoadLogic
{
	public void insertion(OverLoad[] ol,Scanner sc)
	{
		for(int i=0;i<ol.length;i++)
		{
			ol[i]= new OverLoad();
			System.out.println("enter the product id:");
			ol[i].setProductId(sc.nextInt());
			System.out.println("enter the product name:");
			ol[i].setProductName(sc.next());
			System.out.println("enter the product color:");
			ol[i].setProductColor(sc.next());
			System.out.println("enter the product cost");
			ol[i].setProductCost(sc.nextInt());
			sc.nextLine();
			/*System.out.println("enter the product id");
			int pid=sc.nextInt();
			System.out.println("enter the product name");
			String pname=sc.next();
			System.out.println("enter the product color");
			String pcolor=sc.next();
			System.out.println("enter the product cost");
			int pcost=sc.nextInt();
			[i]= new ParamPassingSetGet(pid,pname,pcolor,pcost);*/
			
	    }
	}
	public void display(OverLoad[] ol)
	{
		System.out.println("PRODUCT ID \tPRODUCT NAME\t PRODUCT COLOR\t PRODUCT COST");
		System.out.println("==================================================================");
		for(int i=0;i<ol.length;i++)
		{
		System.out.println(ol[i].getProductId()+"\t"+"\t"+ol[i].getProductName()+"\t"+"\t"+"\t" +ol[i].getProductColor()+"\t"+"\t"+ol[i].getProductCost());
	}
	}
	public void FindProductt(OverLoad[] ol,Scanner sc)//check product id
	{
		boolean check=false;
		System.out.println("check the product id whether is exist or not \n enter the stid  :");
		int s=sc.nextInt();
		for(int i=0;i<ol.length;i++)
		{
			if(s==ol[i].getProductId())
		{
			System.out.println("Product id is exist" + ol[i].getProductId());
			check=true;
			break;
		}	
		
		}
			if(!check)
			{
				System.out.println("product id does not  exist" );
			}
	}
	public void FindProduct(OverLoad[] ol,Scanner sc)//check product name
	{
		boolean check=false;
		System.out.println("check the product name whether is exist or not \n enter the stid  :");
		String s=sc.next();
		for(int i=0;i<ol.length;i++)
		{
			if(s==ol[i].getProductName())
		{
			System.out.println("Product name is exist" + ol[i].getProductName());
			check=true;
			break;
		}	
		
		}
			if(!check)
			{
				System.out.println("product  does not  exist" );
			}
	}
	/*
	public void FindProduct(String pname)
	{
		
	}*/
	
	/*public void FindProduct(OverLoad[] ol,Scanner sc)
	{
		boolean check=false;
		System.out.println("check the product cost whether is exist or not \n enter the cost  :");
		 int s=sc.nextInt();
		for(int i=0;i<ol.length;i++)
		{
			if(s==ol[i].getProductCost())
		{
			System.out.println("Product cost is exist" + ol[i].getProductCost());
			check=true;
			break;
		}	
		
		}
			if(!check)
			{
				System.out.println("product cost does not  exist" );
			}
	}*/
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of products");
		int x=sc.nextInt();
		OverLoad[] ol= new OverLoad[x];
		OverLoadLogic oll=new OverLoadLogic();

		Scanner scr= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert product details \n 2)display the product details \n"+ ""
					+ " 3)check the product id \n"+" 4)check the product name\n"
					+ " ***********************************************************\n "
					+ "enter the number :");
		ch= scr.nextInt();
				
		switch(ch)
		{
		case 1: oll.insertion(ol,scr);
		break;
		case 2: oll.display(ol);
		break;
		case 3: oll.FindProduct(ol, scr);
		break;
		case 4: oll.FindProduct(ol, scr);
		break;
		case 5: 
		default:System.out.println("invalid option");
		break;
		}
		}
		while(ch!=5);
		scr.close();
		}	
	}
