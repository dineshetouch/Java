package Array;

//Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array
public class swapFirstLastElementArray {

	public static void main(String[] args) {

		int arr[] = { 11, 12, 13, 14, 15, 16, 17 };

		// print the given array
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}

		System.out.println();

		int temp; // initialize the temp variable

		// swap first and last element of integer array
		temp = arr[0];
		arr[0] = arr[arr.length - 1]; // swap the first element
		arr[arr.length - 1] = temp; // swap the last element

		// Print the new array after swapping
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}

	}

}
