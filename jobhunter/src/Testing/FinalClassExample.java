package Testing;

import inheritanceConcepts.FinalExample;

public final class FinalClassExample
{
	
	/*Static Block	Constructors	Static Variables	
	Non-Static Variables	Final Static Variables	
	Static Methods	Non-Static Methods	Final Methods	
	Abstract Methods (Declared)	Inheritance	Reference Object
	New Object	main method*/
	
	
	// static block=yes
	
	/*public static void add() 
	{
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	*/
	
	// constructor==yes
	/*
	public String name;
    
    public FinalClassExample(String str)
    {
        this.name = str;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+str);
    }
	
    */
	
	// static variables==yes 
	/*	static int someNumber = 5;*/
	
	// 5)fina static variables ===yes
		/* final static int someNumber = 5;*/
	// 6)non statci methods===yes

		/*public void add() 
		{
			int a =10;
			int b=20;
			int c=a+b;
			System.out.println(c);
		}*/
	// 7)Final Methods ==
		
		/*public final void add() 
		{
			int a =10;
			int b=20;
			int c=a+b;
			System.out.println(c);
		}*/
	
	//10) inheritance = no ,reson=The type example cannot subclass the final class FinalClassExample
	/*class example extends FinalClassExample
		
	{
		
	}*/
	 static int i;
	
	static {
        i = 10;
        System.out.println("static block called ");
    }
	
	
	public static void main(String[] args)
	{
		 FinalClassExample fce= new FinalClassExample();
		 System.out.println(fce.i);
		
		
	}

}
