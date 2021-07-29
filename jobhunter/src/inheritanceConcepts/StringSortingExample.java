package inheritanceConcepts;

import java.util.Scanner;

public class StringSortingExample
{

	public static void main(String[ ] args)
    {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number of strings:");
			int size = sc.nextInt();
			
			String names[]=new String[size];
			for(int i=0;i<names.length;i++)
			{
				System.out.println("enter the string:");
				names[i]=sc.next();
			
			}
			/*
            String[ ] names = {"joe", "slim", "ed", "george"};*/
            sortStringExchange (names);
            for ( int k = 0;  k < names.length;  k++ )
               System.out.println( names [ k ] );
     }

     public static void sortStringExchange( String[]  names )
     {
           int i, j;
           String temp;

           for ( i = 0;  i < names.length - 1;  i++ )
           {
               for ( j = i + 1;  j < names.length;  j++ )
               {  
                        if ( names [ i ].compareTo( names [ j ] ) < 0 )
                         {                                             // ascending sort
                                     temp = (String) names [ i ];
                                     names [ i ] = names [ j ];    // swapping
                                     names [ j ] = (String) temp; 
                                     
                          } 
                  } 
            } 
     }

	private int compareToIgnoreCase(StringSortingExample stringSortingExample) {
		// TODO Auto-generated method stub
		return 0;
	} 

}
