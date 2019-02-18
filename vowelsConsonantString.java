//count number of vowels and consonants in a String

public class vowelsConsonantString {

	public static void main(String[] args) {

		numberOfVowelsConsonants("hello i am learning java");
		
	}
	public static void numberOfVowelsConsonants(String str){

		str = str.replaceAll(" ", ""); //remove all white space in string

		System.out.println(str); //print the removed white space string

		String vowels = "aeiou"; //crating string of all vowels
		
		int cnt = 0;	//initialize the cnt variable
		
		//check the numbers of vowels in given string and count it
		for (int i = 0; i < vowels.length(); i++) {	//iterate each vowels in given string
			for (int j = 0; j < str.length(); j++) { 

				if (vowels.charAt(i) == str.charAt(j)) {
					
					System.out.println(vowels.charAt(i) + " : contains in string");
					cnt++;
				}
			}
		}
		System.out.println("number of vowels = " + cnt); //get the count of numbers of vowels in given string

		int consonants = str.length() - cnt; ////get the count of numbers of consonants in given string

		System.out.println("number of consonants = " + consonants); //print number of consonants
	}

}
