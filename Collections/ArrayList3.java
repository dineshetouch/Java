package collection;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(list);
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		
		System.out.println("Add: "+list);
		
		list.remove("Ravi"); //It will remove Ravi from 0th index
		
		System.out.println("Remove: "+list);
		System.out.println(list.indexOf("Ravi"));

	}

}
