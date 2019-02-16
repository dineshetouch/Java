//Write a Java program to compute the sum of the first 100 prime numbers
public class sumOfPrimeNumber {

	public static void main(String[] args) {

		int number = 2; // As prime number is started from 2
		int sum = 2; // As first number of prime number is 2
		int reminder = 0;
		int totalSum = 0;

		System.out.print(number + ", "); // print first prime number i.e. 2

		for (number = 3; number < 100; number++) { //checking prime number from 3 to 100

			for (int i = 2; i < number; i++) { //divide the number from 2 to number

				reminder = number % i; 	//give the reminder
				
				if (reminder == 0) {	//if reminder == 0; then number will not be prime and it will break the internal for loop
					break;
				}
			}
			if (reminder != 0) {	//if reminder != 0; then number will be prime
				System.out.print(number + ", ");	// print prime numbers between 3 to 100
													
				totalSum = sum + number;
				sum = totalSum;			
			}
		}
		System.out.println();
		System.out.println("Sum of prime number is: " + totalSum); //print the sum of prime numbers between 1 to 100

	}

}
