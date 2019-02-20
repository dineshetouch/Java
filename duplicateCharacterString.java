//duplicate characters from given String?
public class duplicateCharacterString {

	public static void main(String[] args) {

		dupeChar("Hello I am learning strings functionalities");

	}

	public static void dupeChar(String str) {

		str = str.replaceAll(" ", ""); // trim the white space in given string

		// iterate each character in given string and count it.
		for (int i = 0; i < str.length(); i++) {

			int cnt = 0; // initialize the count variable

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) { //comparing the characters
					cnt++; // increase the count by 1
				}
			}			
			if (cnt > 1) { // if count will greater then 1 then character is repeated

				System.out.println("Duplicate characters are: " + str.charAt(i)); // Print duplicate character

				String s = String.valueOf(str.charAt(i)); //converting char into string

				str = str.replaceAll(s, ""); //remove all the str.charAt(i) character from given string 

				System.out.println(str); //will get the new string
			}

		}

	}

}
