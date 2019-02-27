package Array;

import java.util.Arrays;

public class sortingArray {
	// sort the array in ascending order
	public static void main(String[] args) {

		int[] arr = { 34, 23, 55, 14, 18, 20 };

		int temp = 0; // initialize the temp variable

		// Now compare each values and swap them if condition will satisfy
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {

				if (arr[j] >= arr[k]) {
					// performing the swap operation
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		// print the sorted integer array
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("-------------sorting the char array----------------");

		char[] ch = { 'a', 'e', 'b', 'o', 'c' };

		char temCh = 0; // initialize the tempCh variable

		// comparing the each values
		for (int j = 0; j < ch.length; j++) {
			for (int k = j + 1; k < ch.length; k++) {

				if (ch[j] >= ch[k]) {
					// performing the swap operation of given value
					temCh = ch[j];
					ch[j] = ch[k];
					ch[k] = temCh;
				}
			}
		}
		// print the sorted char array
		for (char i : ch) {
			System.out.print(i + " ");
		}

	}

}
