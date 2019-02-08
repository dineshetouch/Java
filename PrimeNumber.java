import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {

		checkPrimeNumber(55);

	}

	public static void checkPrimeNumber(int number) {
		//Since prime number is divisible by it self only hence inserting a for loop to check the reminder.
		//if reminder will be zero then given number is not prime else given number will prime.
		
		int reminder=0;
		int m = number/2; //every number is divisible by it half only
		List<Boolean> list = new ArrayList<>();
			
		for (int i = m; i > 1; i--) {
			
//			if (i%2==0)
//				continue; //To break the current iteration and move to next iteration and it used within the loop.
			System.out.println(i);
			reminder = number%i;
			System.out.println("reminder"+reminder);
			if (reminder == 0) {
				System.out.println(number+" is not prime number");
				break;
			}else {
				list.add(false);
			}
				
		}
		//System.out.println(">>>"+list.toString());
		System.out.println(list.toString());
		if(! list.toString().contains("true"))
			System.out.println(">>>Prmise is TRUE>> "+number);
		/*if (reminder == 0) {
			System.out.println(number+" is not prime number");
		}else {
			System.out.println(number+" is prime number");
		}*/
	}

}
