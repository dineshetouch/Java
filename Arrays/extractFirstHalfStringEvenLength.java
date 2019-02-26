package Array;

//Write a Java program to extract the first half of a string of even length
public class extractFirstHalfStringEvenLength {

	public static void main(String[] args) {

		printFirstHalfOfStringEvenLength("Hello we are learning Java");
	}

	public static void printFirstHalfOfStringEvenLength(String str) {
		System.out.println("******Fiest method (using array)********");

		char ch[] = str.toCharArray(); // convert the string into char array

		// get the first half of a string of even length
		for (int j = 0; j < ch.length / 2; j++) {
			if (j % 2 == 0) {
				System.out.print(ch[j]); //print the first half of a string of even length
			}
		}
		
		System.out.println();
		System.out.println("*******Second menthod (using String concept)********");
		
		System.out.println("length of string is: " + str.length());

		int length = str.length() / 2; // get the length of first half string
		System.out.println("length of first half string is: " + length);

		str = str.substring(0, length); // Get the new string of first half length
		System.out.println(str); // print the new string

		// get the first half of a string of even length
		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 0) {
				System.out.print(str.charAt(i)); // print the first half of a string of even length
			}

		}
	}

}
