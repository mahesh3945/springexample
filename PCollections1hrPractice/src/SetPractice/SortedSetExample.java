package SetPractice;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortedSetExample 
{
	public static void main(String[] args)
    {
		SortedSet<String> sites = new TreeSet();
		sites.add("Mahesh");
		sites.add("Ganesh");
		sites.add("madhavi");
		sites.add("Shyamala");
		sites.add("Sai");
		sites.add("Spandu");
		System.out.println("Sorted Set: " + sites);
        System.out.println("First: " + sites.first());
        System.out.println("Last: " + sites.last());
        
        SortedSet<String> beforeQuiz = sites.headSet("Ganesh");
        System.out.println(beforeQuiz);
 
        // Getting elements between code (Including) and 
        // practice (Excluding)
        SortedSet<String> betweenCodeAndQuiz =
                                  sites.subSet("Mahesh","Shyamala");
        System.out.println(betweenCodeAndQuiz);
 
        // Getting elements after code (Including)
        SortedSet<String> afterCode = sites.tailSet("Shyamala");
        System.out.println(afterCode);
    }
}

