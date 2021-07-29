package MapPractice;

import java.util.WeakHashMap;

public class WeakMapDemo 
{
	public static void main(String[] args)throws Exception 
	{
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"ashok");
		System.out.println(m);//{Temp=ashok}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);//{}
	}
}
class Temp
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("finalize() method called");
	}
}
