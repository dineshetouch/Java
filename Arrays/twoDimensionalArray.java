package Array;

public class twoDimensionalArray {

	public static void main(String[] args) {

		// declaration and instantiation
		int[][] i = new int[3][4]; // row: 3; column: 4

		// initialization
		// 1st row
		i[0][0] = 12;
		i[0][1] = 13;
		i[0][2] = 14;
		i[0][3] = 15;

		// 2nd row
		i[1][0] = 16;
		i[1][1] = 17;
		i[1][2] = 18;
		i[1][3] = 19;

		// 3rd row
		i[2][0] = 20;
		i[2][1] = 21;
		i[2][2] = 22;
		i[2][3] = 23;

		System.out.println("number of rows are: " + i.length); // print the number of rows
		System.out.println("number of columns are: " + i[0].length); // print the numbers of columns

		// print the table
		for (int a = 0; a < i.length; a++) {
			for (int b = 0; b < i[0].length; b++) {
				System.out.print(i[a][b] + "--");
			}
			System.out.println();
		}
		
		System.out.println("***********declaration, instantiation, initialization*************");
		
		//declaration, instantiation, initialization of 2D array		
		char arr[][] = {{'a', 'b', 'c'}, {'d','e', 'f'}, {'g', 'h', 'i'}}; // row=3, column=3
		
		System.out.println("number of rows are: "+ arr.length);
		System.out.println("number of cols are: "+ arr[0].length);
		
		//print the whole array	
		for (int j = 0; j<arr.length; j++){
			for (int k = 0; k<arr[0].length; k++){
				System.out.print(arr[j][k] + "--");
			}
			System.out.println();
		}
		

	}

}
