//java program to prove that strings are immutable in java
public class ImmutableString {

	public static void main(String[] args) {
//refer this url: https://www.javatpoint.com/immutable-string
		
//In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
//Once string object is created its data or state can't be changed but a new string object is created.
		
		String s1 = "Hello"; //s1 is a reference point which is pointing towards the string object "Hello" 
		
		 s1.concat("Java"); //concat() method only appends the string at the end and another memory will be alloted for "HelloJava" object in heap.
		 					//but still s1 reference point pointing towards the string object "Hello"
		System.out.println(s1); //Print "Hello" only as string are immutable
	
		System.out.println("--------------------------------------");
	
		//if we explicitely change the reference point from string object "Hello" to "HelloJava" then output will be changed but string are still immutable.
		
		String s = "Hello";
		
		//changing the reference point
		s = s.concat("Java"); //now reference point s is pointing towards the String object "HelloJava"
		
		System.out.println(s);
		
		
	}

}
