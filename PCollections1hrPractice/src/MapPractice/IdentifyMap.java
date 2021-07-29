package MapPractice;

import java.util.HashMap;

public class IdentifyMap
{
	public static void main(String[] args) 
	{
 //Hash Map dont allow duplicate
 HashMap m=new HashMap();
		 
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1,"pavan");
		m.put(i2,"kalyan");
		System.out.println(m);
	}
}//			IdentifyMap im = new IdentifyMap();
			/*HashMap m=new HashMap();
			Integer i1=new Integer(10);
			Integer i2=new Integer(10);
			im.put(i1,"pavan");
			im.put(i2,"kalyan");
			System.out.println(im);
		}	*/
	

