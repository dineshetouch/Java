package patternAndPyramid;

public class floydSauareUsingStar {

	public static void main(String[] args) {

		printFloydSquare(5);

	}

	public static void printFloydSquare(int row) {

		for (int i = 1; i <= row; i++) {

			// printing first and last row
			if (i == 1 || i == row) { // if anyone condition of if statement will be true then control will go to inside the if statement.
				for (int j = 1; j <= row; j++) {
					System.out.print("*"); // printing the 1st and last row of square
				}
				System.out.println();
			}

			// printing second row to second last row
			if (i >= 2 && i <= row - 1) { // if both the conditions of if statement will be true then only control will go to inside the if statement.
				System.out.print("*"); // printing the 1st cols of 2nd to 2nd last row
				for (int k = 2; k < row; k++) {
					System.out.print(" "); // printing the remaining cols of 2nd to 2nd last row
				}
				System.out.println("*"); // printing the last cols of 2nd to 2nd last row
			}
		}

	}

}
