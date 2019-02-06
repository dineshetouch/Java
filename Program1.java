
public class Program1 {

	public static void main(String[] args){
		
		String str = "Hello i am learning java am";
		
		System.out.println(str);
		System.out.println("length of string is "+str.length());
		System.out.println("Charactor at 4th index is "+ str.charAt(4));
		
		//Substrings
		System.out.println("**************Substrings*****************");
		System.out.println(str.substring(6, 15)); //Printing substring in between 6th to 15th index
		System.out.println(str.subSequence(6, 15)); //Printing subsequence in between 6th to 15th index
		System.out.println(str.substring(8)); //Printing the string after 8th index
		
		//Index
		System.out.println("**************Index*****************");
		System.out.println(str.indexOf("am"));//index of string
		System.out.println(str.indexOf('r'));// index of character
		System.out.println(str.indexOf('a', 9)); //1st occurrence of 'a' after 9th index
		System.out.println(str.indexOf("am", 12)); //1st occurrence of 'am' after 12th index
		System.out.println(str.lastIndexOf('m'));//last occurrence of character 'm'
		System.out.println(str.lastIndexOf("am")); //last occurrence of String 'am'
		
		
		//split
		System.out.println("***************Split*******************");	
		String temp[] = str.split(" ");
		
		System.out.println(temp.length);
		System.out.println(temp[5]);
		
		for (int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		System.out.println("***************concatination*********************");
		String str1 = "hello how are you";
		
		System.out.println(str.concat(str));
		System.out.println(str.concat(str1));
		
		System.out.println("************Comparision of strings*****************");		
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str1)); //equalsIgnoreCase will ignore the upper and lower case
		System.out.println(str.equalsIgnoreCase(str));
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str));
		System.out.println(str.contentEquals(str1)); //check the content of two strings
		
		System.out.println("-------------------------------------");
		
		String str2 = "";
		System.out.println(str2.isEmpty()); //return true if string are empty otherwise return false.
		System.out.println(str.toUpperCase()); //Print the string in upper case
		System.out.println(str.toLowerCase()); //Print the string in lower case
		System.out.println(str.replace('i', 'y')); //replace the character
		System.out.println(str.replaceAll(str, str1)); //replace the str to str1
		

		
		
	}

}
