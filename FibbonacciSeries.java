public class FibbonacciSeries {

	public static void main(String[] args) {
		
		displayFibonacciSeries(20);

	}
	
	public static void displayFibonacciSeries(int rangEnd) {
		
		int start=0;
		int next= 1;
		int result;
		
		for (int end = 1; end<=rangEnd; end++) {		
			result = next+start;
			System.out.println(result);
			next = start;
			start = result;
		}
}
}
