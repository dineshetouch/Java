
public class Factorial {

	public static void main(String[] args) {
		
		factorial(7);
		
	}
	public static void factorial(int fact) {
		
		int start = 1; 
		int result=0;
		
		for (int next=2; next<=fact; next++) {	
			result = start * next;
			start = result;		
		}
		System.out.println(result);
		
	}
	
}
