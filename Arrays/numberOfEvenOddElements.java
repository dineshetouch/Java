package Array;

// Write a Java program to count the number of even and odd elements in a given array of integers
public class numberOfEvenOddElements {

	public static void main(String[] args) {

		int a[] = { 11, 12, 13, 14, 16, 17, 18, 19, 20 };
		numberOfEvenOddCount(a); // get the number of even and odd elements count on integer array "a"

		int b[] = { 11, 12, 13, 14, 16, 17, 18, 19, 20, 25, 26, 28, 29 };
		numberOfEvenOddCount(b); // get the number of even and odd elements count on integer array "b"

	}

	public static void numberOfEvenOddCount(int[] arr) {

		int cntEven = 0;
		int cntOdd = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " "); // print the whole integer array

			if (arr[i] % 2 == 0) {

				cntEven++; // get the number of even count
			}

		}
		System.out.println();
		System.out.println("number of even elements are: " + cntEven);

		cntOdd = arr.length - cntEven; // get the number of odd count

		System.out.println("number of odd elements are: " + cntOdd);

	}
}
