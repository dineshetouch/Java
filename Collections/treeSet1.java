package collection;

import java.util.TreeSet;

public class treeSet1 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("C");
		set.add("B");
		set.add("A");
		set.add("D");
		set.add("E");
		
		System.out.println("Initial Set: "+set);
		System.out.println("Reverse Set: "+set.descendingSet());
		
		System.out.println("Head Set: "+set.headSet("C")); //exclude C
		System.out.println("Head Set: "+set.headSet("C", true));
		System.out.println("Head Set: "+set.headSet("C", false));
		
		System.out.println("Tail Set: "+set.tailSet("C")); //include C
		System.out.println("Tail Set: "+set.tailSet("C", true));
		System.out.println("Tail Set: "+set.tailSet("C", false));
		
		System.out.println("Sub Set: "+set.subSet("B", true, "D", false));
		System.out.println("Sub Set: "+set.subSet("B","D")); //include B exclude D
	}

}
