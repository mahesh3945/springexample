package inheritanceConcepts;

import java.util.Scanner;

public class ExampleSorltingLoic 
{
	public void insert(ExampleSort [] names,Scanner sc)
	{
		for(int i=0;i<names.length;i++)
		{
			
		    System.out.println("enter the strings:");
			names[i]= new ExampleSort();
			System.out.println("enter the firstString:");

			
			
		
		}
	}
		
	public void display( ExampleSort [] names )
	{
	 
	   ExampleSort temp;

	   for (int  i = 0;  i < names.length - 1;  i++ )
	   {
	       for ( int j = i + 1;  j < names.length;  j++ )
	       {   
	                if ( names [ i ].compareToIgnoreCase( names [ j ] ) > 0 )
	                 {                                             // ascending sort
	                             temp = names [ i ];
	                             names [ i ] = names [ j ];    // swapping
	                             names [ j ] = temp; 
	                             
	                             for ( int k = 0;  k < 4;  k++ )
	                            	 
	                             System.out.println( names [ k ] );
	                             
	                  } 
	          } 
	    } 
	}	
private int compareToIgnoreCase(ExampleSorltingLoic example) {
		// TODO Auto-generated method stub
		return 0;
	}
public static void main(String[ ] args)
{
	 
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array size:");
	int x=sc.nextInt();
	ExampleSort [] names=new ExampleSort[4];
	ExampleSorltingLoic example=new ExampleSorltingLoic();
	Scanner scr= new Scanner(System.in);
	int ch;
	do
	{
		System.out.println(" SELECT THE OPTIONS \n *********************************************************** \n "
				+ "1)insert String values \n 2)sorted values  \n"
				 /*" /*3)check the stexitid \n ***********************************************************\n "
				+ "enter the number :*/);
	ch= scr.nextInt();
			
	switch(ch)
	{
	case 1:example.insert(names, scr);
	break;
	case 2:example.display(names);
	break;
	case 3:
	default:System.out.println("invalid option");
	break;
	}
	}
	while(ch!=3);
	scr.close();
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	