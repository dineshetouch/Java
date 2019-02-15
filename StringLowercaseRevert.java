
public class StringLowercaseRevert {

	public static void main(String[] args) {
		
		String str = "Learning Strings Functionalities";
		
		//convert a given string into lowercase
		System.out.println(str.toLowerCase());
		
		//reverse a word
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse()); //reverse the string
		
		//reverse a word using program logic
		String temp[] = str.split(""); //spliting the String
		for (int i=temp.length-1; i>=0; i--) { 
			System.out.print(temp[i]);
		}

	}

}
