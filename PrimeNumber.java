
public class PrimeNumber {

	public static void main(String[] args) {

		numberToCheckPrime(89);

	}

	public static void numberToCheckPrime(int enterNumberTOCheck) {

		int divisible = enterNumberTOCheck/2; //any number is divisible by at least it's half it self.
		int reminder = 0; //initialize the reminder variable

		for (int checkDivision = divisible; checkDivision > 1; checkDivision--) { //i>1 as every prime number is started from 2 
			System.out.println(enterNumberTOCheck+" divided by: "+checkDivision); //Checking the division number
			reminder = enterNumberTOCheck % checkDivision; //give the reminder
			System.out.println("reminder: " + reminder);

			if (reminder == 0) {						// if reminder will be zero then number will not be prime and will break the loop
				System.out.println(enterNumberTOCheck + " is not prime");
				break;
			}

		}
		if (reminder != 0) {			//if reminder will not be zero then given number is prime.
			System.out.println(enterNumberTOCheck + " is prime");
		}

	}

}
