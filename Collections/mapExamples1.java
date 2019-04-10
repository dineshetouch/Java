package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapExamples1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		System.out.println(map);

		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(103, "Vineet");
		map.put(103, "Rahul");
		
		System.out.println(map.get(100));
		System.out.println(map.get(101));
		
		System.out.println("-------Using for each loop-------");
		 // iterate through map using for-each loop
		
		//map.entrySet(); method will convert the map into set
	    //converting the set to Map.Entry<key, value> so that we can get key and value separately
		
		for (Map.Entry<Integer, String> m : map.entrySet()) { 
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("----------Using Iteration method(Old method)-----------");

		// Traversing map
		Set set = map.entrySet(); // converting to Set, so that we can traverse
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
