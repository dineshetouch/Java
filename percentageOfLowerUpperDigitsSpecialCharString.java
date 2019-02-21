//Write a java program to find the percentage of uppercase letters, lowercase letters, digits and special characters in a given string
public class percentageOfLowerUpperDigitsSpecialCharString {

	public static void main(String[] args) {

		percentageUpperLowerDigitSpecialChar("AbcD12@#$E");

	}

	public static void percentageUpperLowerDigitSpecialChar(String str) {
		
		//initialize the count variables
		int cntUpper = 0;
		int cntLower = 0;
		int cntDigit = 0;
		
		//calculate the number of uppercase, lowercase, digits and special characters
		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) { //Character.isUpperCase(char c) will check the uppercase letter in given string and return boolean value.
				cntUpper++;	//get the count of uppercase

			} else if (Character.isLowerCase(str.charAt(i))) {
				cntLower++; //get the count of lowercase

			} else if (Character.isDigit(str.charAt(i))) {
				cntDigit++; //get the count of digits
			}

		}
		int cntSpecialChar = str.length() - (cntUpper + cntLower + cntDigit); //get the count of special characters
		
		//Now calculate the percentage of uppercase letters, lowercase letters, digits and special characters
		//converting integer into float as cntUpper and str.length() both are integer
		float f1 = (float) cntUpper / str.length(); 
		float f2 = (float) cntLower / str.length();
		float f3 = (float) cntDigit / str.length();
		float f4 = (float) cntSpecialChar / str.length();
		
		//get the percentage of uppercase letters, lowercase letters, digits and special characters
		//converting float value into integer by adding the cast
		int upperCasePercentage = (int) (f1 * 100); 
		int lowerCasePercentage = (int) (f2 * 100);
		int digitPercentage = (int) (f3 * 100);
		int specialcharPercentage = (int) (f4 * 100);

		System.out.println("Uppercase: " + upperCasePercentage + "%");
		System.out.println("Lowercase: " + lowerCasePercentage + "%");
		System.out.println("Digits: " + digitPercentage + "%");
		System.out.println("Special character: " + specialcharPercentage + "%");
	}

}
