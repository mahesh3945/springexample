package Testing;

public class ClassExample
{
	/*Static Block	Constructors	Static Variables	
	Non-Static Variables	Final Static Variables	
	Static Methods	Non-Static Methods	Final Methods	
	Abstract Methods (Declared)	Inheritance	Reference Object
	New Object	main method*/
	
	// 1) static block ,static method in class===yes
	
	
	/*public static void add() 
	{
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}*/
	
	// 2) constructors,yes we can do 
	
	/* public String name;
     
	    public ClassExample(String str)
	    {
	        this.name = str;
	        System.out.println("I am inside parameterized constructor.");
	        System.out.println("The parameter value is: "+str);
	    }
	*/
	
	// 3) static variables=== yes
	// 4)non static variables===yes
	  /*int someNumber=5;*/
	
	// 5)fina static variables ===no
	final static int someNumber = 5; 
	
	// 6)non statci methods===yes
	/*
	public void add() 
	{
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}*/
	// 7)Final Methods ==
	/*
	public final void add() 
	{
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	*/
	public static void main(String[] args) 
	{
		
		ClassExample ce=new ClassExample();
		System.out.println(someNumber);
	
		
	}

}
