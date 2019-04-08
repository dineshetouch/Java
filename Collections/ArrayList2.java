package collection;

import java.util.ArrayList;
//Java ArrayList example to add elements
public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList();
		
		System.out.println("Initial list of element: "+al);
		
		//Adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("After invoking add(E e) method: "+al);
		
		//Adding an element at the specific position
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: "+al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		System.out.println(al2);
		
		//Adding second list elements to the first list
		al.addAll(al2);
		
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);
		
		ArrayList<String> al3=new ArrayList<String>();  
		
		al3.add("John");  
        al3.add("Rahul");
        
        //Adding second list elements to the first list at specific position  
        al.addAll(1, al3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);
        
        //Removing element by name
        al.remove("John");
        System.out.println("Rmove John from List: "+ al);
        
        //Removing element by index
        al.remove(0);
        System.out.println("Removing 0th index (Ravi) from list: "+al);
        
        //Removing all the elements available in the list  
        al.clear();  
        System.out.println("After invoking clear() method: "+al); 

	}

}
