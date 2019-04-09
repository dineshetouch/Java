package collection;

import java.util.HashSet;
public class hashSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();

		System.out.println("Empty set: "+set);
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		set.add("Ravi");
		
		System.out.println("After adding the element in Hashtable: "+set);
		
		set.remove("Ravi");
		System.out.println("After deleting the element: "+set);
		
		set.removeIf(str->str.contains("Ravi")); //Deleting the element using lambda expression
		
		System.out.println("Deleting the element using lambda expression: "+set);
		
		set.clear(); //Clear all the element in hashSet table
		System.out.println("Clear all the element in hashtable: " +set); 
		
	}

}
