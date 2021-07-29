package SetPractice;

import java.util.HashSet;

class HashSetExample 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));//false , when we r trying to insert duplicate values it will not give compile time error or run time error it will give false value
		System.out.println(h);
		//insertions order is not prserved thats why the fallowing output is like this
		//[null, D, B, C, 10, Z]
		//duplicate values not allowed
		//only one null value is accepted
		//it best suite for search.
		//internally it fallows the hashtable data structure.
		}
}



