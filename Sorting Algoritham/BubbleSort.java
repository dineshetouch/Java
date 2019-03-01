package Sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] d = { 55, 1, 41, 0, 2, 8 };
		
		System.out.println("------original array--------");
		
		for (int i : d) {
			System.out.print(i + " "); // print the given array
		}		
		System.out.println();
		
		// if checkSorting method will return false then give array is not sorted
		//and it will go to while loop and perform the sorting operations till will get the sorted array.
		
		while (!checkSorting(d)) {
			sortingArray(d);
		}

		System.out.println("-------final sorted array-------");
		for (int i : d) {
			System.out.print(i + " "); // print final sorted array
		}

	}

	public static void sortingArray(int[] d) {
		// sort the array using bubble sort method
		for (int i = 0; i < d.length - 1; i++) {

			if (d[i] > d[i + 1]) {

				System.out.println("Sort the array for "+ d[i]+" "+d[i+1]);				
				swap(d, i, (i + 1));
				
				System.out.println("----after above element sorting--------");
				
				//print the sorted array after swapping the above element
				for (int j : d) {
					System.out.print(j + " ");
				}
				System.out.println();
				System.out.println("----------------------");
			}
		}
		
		
		for (int i : d) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static boolean checkSorting(int c[]) {
		// check the sorted array is sort or not
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] >= c[i + 1]) {
				return false; // return false if array is not sorted.
			}
		}
		return true; //return true if array is sorted
	}

	public static void swap(int a[], int i, int j) {
		int temp;
		// swap the values
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
