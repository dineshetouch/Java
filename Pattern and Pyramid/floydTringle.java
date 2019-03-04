package patternAndPyramid;

public class floydTringle {

	public static void main(String[] args) {
		
		
		printFloydTringle(5);
		
	}
	public static void printFloydTringle(int row) {
		int i, cols = 0, lastNum=0;
		
		for (i=1; i<=row; i++) {
			
			// since ending number of each row in Floyd triangle is 1,3,6,10,15,...
			//Formula: i(i+1)/2 = (i*i+i)/2
			lastNum = (i*i+i)/2; //Get the ending number of each row
			while (cols!= lastNum) {
				System.out.print(cols+1 +"  "); // cols+1 to get the last number of each row
				cols++;
			}
			System.out.println();
		}
		System.out.println("--------Second method------");
		
		int cnt = 1;
		
		for (i=1; i<=row; i++) {
			for (cols=0; cols<i; cols++) {
				System.out.print(cnt++ +"  "); //print the cols and then increment cnt also
			}
			System.out.println();
		}
		
	}

}
