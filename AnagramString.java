import java.lang.reflect.Array;
import java.util.Arrays;

/*"check if two Strings are anagrams of each other"
 * Anagrams: Two strings are called anagrams if they contain same set of characters but in different order.
 * For Ex: "keep ? peek", "Mother In Law - Hitler Woman".*/
public class AnagramString {

	public static void main(String[] args) {

		anagrams("hello", "elolh");

	}

	public static void anagrams(String s1, String s2) {

		// As we know that String is immutable(Unchange) in java.
		// Hence String class doesn’t have any method that directly sort a string.

		char[] ArrayS1 = s1.toCharArray(); //converting first string into char array

		Arrays.sort(ArrayS1); 			//sort the char array alphabetically

		String str1 = new String(ArrayS1); //Converting char array into string

		System.out.println(str1);

		char[] ArrayS2 = s2.toCharArray(); // converting second string into char  array
											
		Arrays.sort(ArrayS2); 		//sort the char array alphabetically

		String str2 = new String(ArrayS2); // Converting char array into string

		System.out.println(str2);

		if (str1.length() == str2.length()) { // checking length of above two strings

			if (str1.equalsIgnoreCase(str2)) { // comparing both the strings
				
				System.out.println("both the strings are anagrams");
				
			} else {
				
				System.out.println("both the strings are not anagrams");				
			}
		} else {
			
			System.out.println("Length of both the strings are not equal, hence both the strings are not anagrama of each other");
		}

	}

}
