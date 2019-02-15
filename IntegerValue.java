import java.util.Random;
import java.util.Scanner;

//Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers
public class IntegerValue {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first number");
		int firstNumber = s.nextInt(); // enter first number in console

		if (firstNumber > 25 && firstNumber < 75) {
			System.out.println("First number is >> " + firstNumber);
		} else {
			System.out.println("First number is not in between 25 & 75");
			System.exit(0); // terminate the JVM
		}

		System.out.println("Enter the second number");
		int secondNumber = s.nextInt(); // enter second number in console

		if (secondNumber > 25 && secondNumber < 75) {
			System.out.println("Second number is >> " + secondNumber);
		} else {
			System.out.println("Second number is not in between 25 & 75");
			System.exit(0); // terminate the JVM
		}

		String a = Integer.toString(firstNumber); // converting the integer into string
		String temp[] = a.split(""); // splitting firstNumber into digit

		System.out.println("second digit in firstNumber "+temp[1]);

		String b = Integer.toString(secondNumber); // converting the integer into string
		String temp1[] = b.split(""); // splitting secondNumber into digit

		System.out.println("first digit in secondNumber "+temp1[0]);
		System.out.println("second digit in secondNumber "+temp1[1]);

		// Comparing each digit in both the numbers
		if (temp[0].equals(temp1[0])) {
			System.out.println("Common digit in both number is " + temp[0]);
		}
		if (temp[0].equals(temp1[1])) {
			System.out.println("Common digit in both number is " + temp[0]);
		}
		if (temp[1].equals(temp1[0])) {
			System.out.println("Common digit in both number is " + temp[1]);
		}
		if (temp[1].equals(temp1[1])) {
			System.out.println("Common digit in both number is " + temp[1]);
		} else {
			System.out.println("None of the number is comman in both the numbers");
		}

	}

}
