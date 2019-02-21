//swap two string variables without using third or temp variable in java
public class swapString {

	public static void main(String[] args) {

		swapStringVariables("Hello", "Java");
	}

	public static void swapStringVariables(String s1, String s2) {
		
		System.out.println("before swap happen: "+s1 + " " + s2);

		s1 = s1.concat(s2); // s1 = HelloJava
		s2 = s1.substring(0, s1.length() - s2.length()); // s2 = Hello
		s1 = s1.substring(s2.length(), s1.length()); // s1 = java

		System.out.println("after swap happen: "+s1 + " " + s2);
	}
}
