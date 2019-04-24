package inheritanceConcepts;

public class FinalExample
{
    final static float PI=3.14f;
	public static void main(String[] args)
	{
		System.out.println(PI);

	}
	final void  display()
	{
		System.out.println(PI);	
	}

}

 class Demo  extends FinalExample
 {
	private void syso() 
	{
		System.out.println(FinalExample.PI);
	}
	
 }