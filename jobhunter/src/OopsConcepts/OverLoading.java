package OopsConcepts;

public class OverLoading {
	
	public void inputData(int value)
	{
		System.out.println("int value  ="+value);
	}

	public void inputData(long value)
	{
		System.out.println("lon value  ="+value);
	}

	public void inputData(float value)
	{
		System.out.println("float value  ="+value);
	}

	public void inputData(double value)
	{
		System.out.println("doublevalue  ="+value);
	}

	public void inputData(short value)
	{
		System.out.println("short value  ="+value);
	}
	

	public static void main(String[] args)
	{
		OverLoading ol=new OverLoading();
		ol.inputData(1);
		ol.inputData(333l);
		ol.inputData(22.5f);
		ol.inputData(2e3);
		ol.inputData(555);
		

	}

}


