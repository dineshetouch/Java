package collection;

import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq = new PriorityQueue <Integer> ();
		
		pq.add(34);
		pq.add(55);
		pq.add(24);
		pq.add(66);
		pq.add(14);
		pq.add(34);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());	//return null if queue is empty
		System.out.println(pq.element()); //return exception if queue is empty
		
		pq.remove(); //remove the head element of queue and throw exception if queue is empty.
		System.out.println(pq);
		pq.poll(); //remove the head element of queue and return null if queue is empty
		System.out.println(pq);
		

	}

}
