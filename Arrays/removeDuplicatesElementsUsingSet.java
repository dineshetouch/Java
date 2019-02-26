package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Write a Java program to remove duplicate elements from an array
public class removeDuplicatesElementsUsingSet {

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'a', 'c', 'c', 'd', 'k' }; // remove duplicate elements from char array
		
		//duplicate elements are not allowed in set.
		//Set will not grow with index and will get the random output.		
		Set<Character> uniqueChar = new HashSet<Character>(); //creating the object of set of characters
		
		//Iterate the for loop for each elements and store unique value in set. 
		for (int i = 0; i < ch.length; i++) { 

			for (int k = 0; k < ch.length; k++) {

				if (ch[i] != ch[k]) { // if both the element are not equal then those element will be stored in set

					uniqueChar.add(ch[i]);

				}
			}
		}

		// We cannot directly print all the element of Set as Set don't have get()
		// method like List
		// instead of iterator we can use forEach loop for set for printing the elements
		for (char i : uniqueChar) {
			System.out.println(i);
		}
		/*
		 * Iterator it = s.iterator();
		 * 
		 * while(it.hasNext()) { System.out.print(it.next()+", "); }
		 */

	}

}
