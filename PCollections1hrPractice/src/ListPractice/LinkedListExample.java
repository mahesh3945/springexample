package ListPractice;

import java.util.LinkedList;

public class LinkedListExample
{

	public static void main(String[] args)
	{
				
				LinkedList<Comparable> l=new LinkedList();
				l.add("ashok");
				l.add(30);
				l.add(null);
				l.add("ashok");
				System.out.println(l);//[ashok, 30, null, ashok]
				l.set(0,"software");
				System.out.println(l);//[software, 30, null, ashok]
				l.set(0,"venky");
				System.out.println(l);//[venky, 30, null, ashok]
				l.removeLast();
				System.out.println(l);//[venky, 30, null]
				l.addFirst("vvv");
				System.out.println(l);//[vvv, venky, 30, null]
	}
}
