package ListPractice;
import java.util.ArrayList;
import ListPractice.ArrayLinkedPojoExam;
public class ArrayListEx 
{
	//List is child interface of Collection.
	//ArrayList can allow duplicate
	//initial capacity of array is 10
	//null values is possible
	//insertions order is preserved
	//ArralList and LinkedList are not synchronized but we can make them synchronized explicitly by u
	//using collections.synchronized.
	//vector and stock are synchronized.
	//For retriving purpose ArrayList is the best choice
	// *******************
	// the main difference between ArrayList and LinkedList is ArrayList is based on 
	//dynamic array concept and LinkedList is based on doubly linked list to store the elements
	//no bit shiffting is required in LinkedList bcz its the concept of doubly linked.
	//bit shifting is required in Arraylist bcz its the concept of dynamic array
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>(1);
		String a= "onemahesh";//insertion order is preserved
		String a1= "mahesh";
		String a2= "Sai";
		String a3= "mahesh";//duplicates are allowed
		String a4= "mahesh";
		String a5= "mahesh";
		String a6="ganesh";
		String a7="null";//null values are allowed
		String a8= "mahesh";//insertion order is preserved
		String a9= "mahesh";
		String a10= "Sai";
		String a11= "mahesh";//duplicates are allowed
		String a12= "mahesh";
		String a13= "mahesh";
		String a14="ganesh";
		String a15="fifteennull";//null values are allowed
		al.add(a);
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		al.add(a6);
		al.add(a7);
		al.add(a8);
		al.add(a9);
		al.add(a10);
		al.add(a11);
		al.add(a12);
		al.add(a13);
		al.add(a14);
		al.add(a15);
	 System.out.println(al);
	}

}
