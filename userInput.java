import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		//The main purpose of the Scanner class is to parse primitive types and strings using regular expressions, however it is also can be used to read input from the user in the command line.
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Pleae enter the first number: ");
		int i = input.nextInt(); //take the integer value from user
		
		System.out.println("Pleae enter the second number: ");
		int j = input.nextInt();//take the integer value from user
		
		int k = i*j; //Multiplying the above two integer values.
		
		System.out.println("multiplication of two numbers from user is: "+k);
		

	}

}
