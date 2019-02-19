//check if a String contains another String
public class stringContainsAnotherString {

	public static void main(String[] args) {

		checkStringContainsAnotherString("hello I am learning java");
		
		System.out.println("--------------");
		
		checkStringContainsAnotherString("hello   ");

	}

	public static void checkStringContainsAnotherString(String str) {

		String[] temp = str.split(" "); //split the given string from white space

		System.out.println("Length of given string is: "+temp.length);

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" "); //print the given string
		}
		System.out.println();
		
		//if the length of given string will be greater then one then given string contains another string.
		//if length will be equal to one then given string doesn't contain another string.
		if (temp.length > 1) {
			System.out.println("Given string contains another string as length of string is greater then one");
		} else {
			System.out.println("Given String doesn't contains another string as it contains only one word");
		}

	}

}
