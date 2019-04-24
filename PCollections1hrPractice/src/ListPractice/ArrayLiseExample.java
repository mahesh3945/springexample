package ListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayLiseExample {

	public static void main(String[] args) {

		// array list insertion (adding)
		List<String> listone = new ArrayList<String>();
		listone.add("nana");
		listone.add("nana");
		listone.add("amma");
		listone.add("mahi");
		listone.add("gani");
		listone.add("shyam");
		listone.add("sushma");
		/*
		// we can add the elements by using index like below
		listone.add(1, "Mahesh yadav");
		// add all means it will add all elements once again
		listone.addAll(listone);
		// we can addall elements particular index also by using below syntax
		listone.addAll(1, listone);
		// we can update elements by using index
		listone.set(2, "ganesh yadav");

		// we can remove the elements by using index
		listone.remove(2);
		// we can remove the objects by using removing(object)method
		if (listone.remove("shyam")) {
			System.out.println("removed");
		} else {
			System.out.println("not found");
		}
		// we can clear all element suding clear(); method
		// Iterating over a list
		for (String element : listone)
		{
			System.out.println(element);
		}
		//
		Iterator<String> iterator = listone.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// to search the elements
		if (listone.contains("sushma")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		// sorting the elements by using sort() method
		Collections.sort(listone);
		System.out.println("after sorting/n ***************");
		System.out.println(listone);
		//reverse the elements
		
		Collections.reverse(listone);*/
		System.out.println(listone);
		
		
		// convert objects into arrray
		
		
	}
}