package jobhunter;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) 
	{
		
		
		{
		   
		        int a,b;
		        Scanner sc= new Scanner(System.in);
		        System.out.println("enter the a value:");
		        a=sc.nextInt();
		        System.out.println("enter the b value:");
		        b=sc.nextInt();
		        System.out.println("ente ur choice\n 1)add\n 2)mul\n 3)sub\n");
		        int ch=sc.nextInt();
		        
		        switch(ch)
		                {
		            case 1: System.out.println("addion of a nd b is ="    +(a+b));
		            break;
		            case 2: System.out.println(a-b);
		            break;
		            
		            default:System.out.println("default");
		            break;
		                }
		        
		    
		           
		       
		    }     
		 }
	}

