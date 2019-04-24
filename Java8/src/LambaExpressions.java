interface A
{
	void show();
}
/*
class abc implements A
{
	public void show() 
	{
	 System.out.println("HELLO");	
	}
}*/
public class LambaExpressions 
{
	public static void main(String[] args)
	{
	/*	A obj = new abc();
		obj.show();
		*/
		
		
	/*	A obj;
		obj = () ->
		{
			System.out.println("HELLO");
		};
		obj.show();
		*/
		A obj;
		obj = () ->	System.out.println("HELLO");
		
    }
}
