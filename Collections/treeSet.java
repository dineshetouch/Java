package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);

		Iterator<Integer> itr = set.descendingIterator(); // traversing elements in descending order
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Highest Value: " + set.first());
		System.out.println("Lowest Value: " + set.last());

		System.out.println(set);

		System.out.println("Highest Value: " + set.pollFirst()); // retrieve and remove the highest Value
		System.out.println("Lowest Value: " + set.pollLast()); // retrieve and remove the lowest Value

		for (Integer i : set) {
			System.out.println(i);
		}

	}

}
