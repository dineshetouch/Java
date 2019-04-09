package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {

	public static void main(String[] args) {
		
		Deque<String> ad = new ArrayDeque<String>();
		
		ad.add("arvind");
		ad.add("vimal");
		ad.add("mukul");
		ad.add("jai");
		
		for(String s:ad) {
			System.out.println(s);
		}
		
		ad.poll();// pollFirst(); it is same as poll()
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
		

	}

}
