//"program to print first non repeated character from String"
public class firstNonRepetedCharFromString {

	public static void main(String[] args) {

		firstNonRepeatedChar("helyhleo");

	}

	public static void firstNonRepeatedChar(String str) {

		for (int i = 0; i < str.length(); i++) {

			int count = 0; // initialize count local variable and initially count is zero
			char testchar = str.charAt(i); // give the character at 'i'th index

			for (int j = 0; j < str.length(); j++) {

				if (testchar == str.charAt(j)) { // check above character with all the character of string

					count++; // increase the count if character is repeated
				}
			}
			if (count == 1) { 	// if count will be '1' then will get the first non-repeated character

				System.out.println("First non-repreted charater is: " + testchar);
				break; // it will break the external for loop after getting the first non-repeated character.

			}
		}

		System.out.println("------------second method-----------------");

		char[] ch = str.toCharArray(); // converting above string into character array

		for (int i = 0; i < ch.length; i++) {
			int cnt = 0;
			for (int j = 0; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.println("First non-repreted charater is: " + ch[i]);
				break;
			}
		}
	}

}
