package ListPractice;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*; 
public class ListInterfaceExample
{  

//listiterator interface is used to traverse the data forward and backword direction.	
public static void main(String args[]){  
ArrayList<String> al=new ArrayList<String>();  
al.add("Amit");  
al.add("Vijay");  
al.add("Kumar");  
al.add(1,"Sachin");  
System.out.println("element at 2nd position: "+al.get(2));  
ListIterator<String> itr=al.listIterator();  
System.out.println("traversing elements in forward direction...");  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
System.out.println("traversing elements in backward direction...");  
while(itr.hasPrevious()){  
System.out.println(itr.previous());  
}  
}  
} 
/*
public class ListInterfaceExample 
{

	public static void main(String[] args)
	{
	
		ArrayList<String> al = new ArrayList<>();
		al.add("mahesh");
		al.add("ganesh");
		al.add("sushma");
		
		System.out.println(al);
		ListIterator<String> li = al.listIterator();
		System.out.println("forwad");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("backward");
		while(li.hasPrevious())
		{
			System.out.println(li.hasPrevious());
		}
	}
		
}
*/