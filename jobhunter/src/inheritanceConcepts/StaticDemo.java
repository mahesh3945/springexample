package inheritanceConcepts;

public class StaticDemo
{
	static
	{
		System.out.println("in static block");
	}
	public StaticDemo()
	{
		System.out.println("static demo");
	}
	
	public static void main(String[] args)
	{
		System.out.println("main methods");
		StaticDemo sd=new StaticDemo();
		
	 	

	}

}
