package exceptions;


class MyException extends Exception
{
	
	String message;	
	public MyException()
	{
		message="Exception occured";
	}
	public MyException(String message)
	{
		this.message=message;
	}
@Override
public String getMessage() {


return message;
}
	
}
public class UserDefinedExceptions
{

	static void check(int num)throws MyException
	{
		if(num<0)
		{
			throw new MyException("NUmber should not be -Ve");
		}
		else
		{
			//process
			System.out.println("process");
		}
		
	}
	public static void main(String[] args)
	{
		
			try {
				check(55);
			} catch (MyException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
