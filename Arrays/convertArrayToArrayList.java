package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to convert an array to ArrayList. 
public class convertArrayToArrayList {

	public static void main(String[] args) {

		char[] ch = { 'a', 'b', 'c', 'e', 't' };

		ArrayList<Character> list = new ArrayList<Character>(); // creating an empty ArrayList of character

		// inserting all the character array element into list.
		for (int i = 0; i < ch.length; i++) {
			list.add(ch[i]);
		}

		// Now printing the ArrayList
		for (char i : list) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("********************we can directly convert array to arraylist************************");

		// Generally we are using ArrayList for converting the Array into ArrayList
		// In this we can add, delete the element from ArrayList
		ArrayList<char[]> al = new ArrayList<char[]>(Arrays.asList(ch));
		for (char[] i : al) {
			System.out.println(i);
		}

		// Generally we are not using List for converting array to List
		// As we can not modify it
		List<char[]> li = Arrays.asList(ch); // converting array into List
		for (char[] i : li) {
			System.out.println(i);
		}

	}

}
