package patternAndPyramid;

public class invertedHalfPyramidUsingStar {

	public static void main(String[] args) {
	
		invertedHalfPyramid(5);
	}
	public static void invertedHalfPyramid(int n) {

		for (int i = n; i > 0; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
