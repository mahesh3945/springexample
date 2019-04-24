package ListPractice;
import java.util.LinkedList;
public class LinkedLiseEx
{
//LinkedList is allow duplicate values
//LinkedList is null values
//Insertion order is preserved
//Linked list is best choice for insertion and deleting in the middle.
//its not threas safe means not synchronized but we can make it synchronized by explicitly.
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		String s1="mahesh";
		String s2="ganesh";
		String s3="ganesh";//duplicates are allowed
		list.add(s1);
		list.add(s2);//insertion order is preserved
		list.add(null);//null values are allowed multiple times
		list.add(null);
		list.add(s3);
		System.out.println(list);
	}
}
