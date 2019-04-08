package collection;

//User-defined class objects in Java ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		// Creating user-defined class objects
		Student s1 = new Student(101, "Dinesh", "Varanasi");
		Student s2 = new Student(102, "Vineet", "Mumbai");
		Student s3 = new Student(103, "Deepak", "Navi Mumbai");

		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1); // adding Student class object
		al.add(s2);
		al.add(s3);

		// Getting Iterator
		Iterator itr = al.iterator();

		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.city);
		}

	}

}
