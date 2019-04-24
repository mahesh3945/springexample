package OopsConcepts;
import java.util.Scanner;
public class ProductLogicEx 
{
	public void insert(ProductEx[] pe,Scanner sc)
	{
		for(int i=0;i<pe.length;i++)
		{
			pe[i]=new ProductEx();
			System.out.println("enter the product id:");
			pe[i].setProductId(sc.nextInt());
			System.out.println("enter the product name");
			pe[i].setProductName(sc.next());
			System.out.println("enter the product color");
			pe[i].setProductColor(sc.next());
			System.out.println("enter the product cost");
			pe[i].setProductCost(sc.nextInt());
		}
	}
	public void Display(ProductEx[] pe)
	{
		System.out.println("PRODUCT ID \t   PRODUCT NAME\t   PRODUCT COLOR \t PRODUCT SIZE");
		System.out.println("========================================================================");
		for(int i=0;i<pe.length;i++)
		{
			System.out.println(pe[i].getProductId()+"\t"+"\t"+"\t" +pe[i].getProductName()+"\t"+"\t"+pe[i].getProductColor()+"\t"+"\t"+"\t"+pe[i].getProductCost());
		}
	
	}
	public void search(ProductEx[] pe,Scanner sc)
	{
		boolean check=false;
		System.out.println("check the product id whether is exist or not \n enter the product id  :");
		int s=sc.nextInt();
		for(int i=0;i<pe.length;i++)
		{
			if(s==pe[i].getProductId())
		{
			System.out.println("student id is exist        :"   + pe[i].getProductId());
			check=true;
			break;
		}	
		
		}
			if(!check)
			{
				System.out.println("student id does not  exist" );
			}
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of products:");
		int x= sc.nextInt();
		ProductEx[] pe=new ProductEx[x];
		ProductLogicEx ple=new ProductLogicEx();
		Scanner scr= new Scanner(System.in);
		int xx;
		do
		{
		System.out.println("SELECT THE OPTIONS \n *********************************************************** \n "
					+ "1)insert the product details \n 2)display the product details \n"
					+ " 3)check the productid \n ***********************************************************\n "
					+ "choose the options :");
		xx=scr.nextInt();
		switch(xx)
		{
		case 1:ple.insert(pe, scr);
		break;
		case 2:ple.Display(pe);
		break;
		case 3:ple.search(pe, scr);
		break;
		default:System.out.println("invalid option");
		break;
		}
		}
		while(xx!=4);
		scr.close();
	
}
}