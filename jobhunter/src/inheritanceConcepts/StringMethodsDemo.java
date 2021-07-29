package inheritanceConcepts;

import java.util.Scanner;

public class StringMethodsDemo 
{
	
	
	
	
	
	public void string()
	{
	String courseName="Core Java";
	System.out.println(courseName);
	courseName=courseName.concat("2");
	System.out.println(courseName);	
	}
	//====================================================================
	public void stringBuilder()
	{
	StringBuilder stringbuilder=new StringBuilder("Core Java");
	System.out.println(stringbuilder);
	stringbuilder.append("2");		
	System.out.println(stringbuilder.reverse());
	}
    //====================================================================
	public void equals()
	{
		System.out.println("");
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  

		System.out.println("equals method executed");
	}
	public void equalsignorecase()
	{
		String s1="javatpoinA";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";
	   System.out.println(s1.compareTo(s2));
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		System.out.println("equalsignorecase method executed");	
	}
	public void startswith()
	{
		String s1="java string split method by javatpoint";  
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));  
		System.out.println("starts with method executed");
	}
	public void length()
	{
		String s1="javatpoint";  
		String s2="python";  
		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+s2.length());//6 is the length of python string  
		System.out.println("length method executed");
	}
	public void charAt()
	{
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);
		System.out.println("charAt method executed");
	}
	public void split()
	{
		String s1="java string split method by javatpoint";  
		String[] words=s1.split(" ");
		for(String w:words)
		{  
		System.out.println(w); 
		
	}
	}
	public void endsWith()
	{
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  
		System.out.println(s1.endsWith("by"));  
		System.out.println("endswith method executed");
	}
	public void indexOf()
	{
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("is");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1);//2 8 
		System.out.println(index2);
		    
		System.out.println("indexOf method executed");
	}
	public void trim()
	{
		String s1="  hello string   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		System.out.println(s1.trim()+"javatpoint");//with trim()  
		System.out.println();
	}
	public static void main(String[] args)
	{		
		StringMethodsDemo smd= new StringMethodsDemo();
		
		Scanner sc= new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("select the String Methods:\n************************************\n"
					+ " 1)string()\n 2)stringBuilder()\n 3)equals() \n 4)equalsignorecase()\n 5)startswith()\n"
					+  " 6)length()\n 7)charAt()\n 8)split()\n 9)endsWith()\n 10)indexOf()\n 11)trim()\n"
					+ "******************************\n"+"chose the number:");
		ch= sc.nextInt();
		 
		switch(ch)
		{
		case 1:smd.string();
		break;
		case 2:smd.stringBuilder();
		break;
		case 3:smd.equals();
		break;
		case 4:smd.equalsignorecase();
		break;
		case 5:smd.startswith();
		break;
		case 6:smd.length();
		break;
		case 7:smd.charAt();
		break;
		case 8:smd.split();
		break;
		case 9:smd.endsWith();
		break;
		case 10:smd.indexOf();
		break;
		case 11:smd.trim();
		break;
		case 12:
		default:System.out.println("invalid option");
		break;
		}
}
		while(ch!=12);
		sc.close();
	}


}

		
		
		/*concat()
	 * 
	 * 
	equals()
	equalsignorecase()
	startswith()
	length()
	charAt()
	split()
	endsWith()
	indexOf()
	trim()*/
	