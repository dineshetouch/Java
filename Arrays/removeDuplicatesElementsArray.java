package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Write a Java program to remove duplicate elements from an array
public class removeDuplicatesElementsArray {

	public static void main(String[] args) {

		char ch[] = { 'a', 'b', 'c', 'd', 'a', 'c', 'o','o','x', 'm'};

		int j = 0;

		char[] temp = new char[ch.length];

		for (int i = 0; i < ch.length; i++) {

			for (int k = 0; k < ch.length; k++) {

				if (ch[i] != ch[k]) {

					if (!isPresent(temp, ch[i])) {
						temp[j] = ch[i];
						j++;
					}
				}
			}
		}

System.out.println("unique");
		for (char i : temp)
			System.out.println(i);
	}

	public static boolean isPresent(char[] arr, char c) {
		for (char i : arr) {
			if (c == i) {

				return true;
			}
		}
		return false;
	}

}
