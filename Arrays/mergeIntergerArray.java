package Array;
import java.util.Arrays;
//Write a Java program to merge two given sorted array of integers and create a new sorted array.
public class mergeIntergerArray {

	public static void main(String[] args) {
		
		int a1[] = { 11, 55, 14, 18 };
		int a2[] = { 13, 45, 24, 38 };
		
		// sort both array in ascending order
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		int a3[] = new int[a1.length + a2.length]; // array a3 will merge both the arrays a1 and a2
		
		// adding array a1 into array a3
		for (int i=0; i<a1.length; i++) {		
			a3[i] = a1[i];
		}
		
		// adding array a2 into array a3
		for (int i=0; i<a2.length; i++) {			 
			a3[a1.length + i] = a2[i]; // already assigned data till [a1.length], now it next entry will be [a1.length + i]		
		}
		
		// printing the a3 array before sorting it
		for (Integer i: a3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// now sort the array a3 in ascending order
		Arrays.sort(a3);
		
		// now printing the sorted array a3 
		for (Integer i: a3) {
			System.out.print(i+" ");
		}

	}

}
