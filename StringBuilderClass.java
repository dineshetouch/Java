
public class StringBuilderClass {

	public static void main(String[] args) {
		
		String str = "hello i am new in java";
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(sb.length());	//give the length of string
		System.out.println(sb.append(" : Dinesh"));	//concatenates the given argument with this string.
		System.out.println(sb.insert(10, " very ")); //inserts the given string with this string at the given position.
		System.out.println(sb.replace(0, 5, "hi")); //replaces the given string from the specified beginIndex and endIndex.
		System.out.println(sb.delete(25, 35)); //deletes the string from the specified beginIndex to endIndex.
		System.out.println(sb.reverse());	//reverses the current string.
		System.out.println(sb.charAt(3)); //Returns the char value at the specified index.
		
	}

}
