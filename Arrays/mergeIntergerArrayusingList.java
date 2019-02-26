package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to merge two given sorted array of integers and create a new sorted array.
public class mergeIntergerArrayusingList {

	public static void main(String[] args) {
		
		int a1[] = { 11, 55, 14, 18 };
		int a2[] = { 13, 45, 24, 38 };
		
		// print the first array before sorting
		for (int i: a1) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		// Print the second array before sorting
		for (int i: a2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// sort both the arrays in ascending order
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		// print the first array after sorting
		for (int i: a1) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// print the second array after sorting
		for (int i: a2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		List<Integer> list = new ArrayList<Integer>(); // creating list of Integer
		
		// adding array a1 into list
		for (int j =0; j<a1.length; j++) {		
			list.add(a1[j]);
		}
		
		// adding array a2 into list
		for (int j =0; j<a2.length; j++) {		
			list.add(a2[j]);
		}
		
		// print all the element which is added into list.
		for (int j: list) {
		System.out.print(j+" ");
		}
		
		System.out.println();
		
		// convert list into object array
		Object[] a4 = list.toArray();
		
		Arrays.sort(a4); //sort the array in ascending order
		
		//print the object array after sorting
		for(Object i : a4) {	
			System.out.print(i+" ");
		}
		

	}

}
