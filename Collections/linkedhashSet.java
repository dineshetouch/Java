package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashSet {

	public static void main(String[] args) {

		Book b1 = new Book(1, "Suresh", "Vineet", "abc", 30);
		Book b2 = new Book(2, "Ravi", "Deepak", "xyz", 40);
		Book b3 = new Book(3, "Mahesh", "Shantanu", "mno", 50);

		LinkedHashSet<Book> ls = new LinkedHashSet<Book>();

		ls.add(b1);
		ls.add(b2);
		ls.add(b3);
		
		//Using iterator
		Iterator<Book> itr = ls.iterator();

		while (itr.hasNext()) {
			Book b = (Book) itr.next();
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		
		System.out.println("-----------------------");
		
		//using for-each loop		
		for(Book b:ls) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}

}
