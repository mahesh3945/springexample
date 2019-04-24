package jobhunter;

public class Operaters {

	public static void main(String[] args)
	{
		int val1=Integer.parseInt(args[0]);	
		String result= val1%2==0?"Even" : "odd";
		System.out.println(result);
	}
}
