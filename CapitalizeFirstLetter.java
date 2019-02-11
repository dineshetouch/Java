
public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		
		String str = "hello i am learning java";
		
		String temp[] = str.split(" "); // split the string from space
		
		for (int i=0; i<temp.length; i++) {
		
		String firstLetter = temp[i].substring(0, 1); //give the first letter of above temp[i] string
		//System.out.println(firstLetter);
		
		String firstLetterUpper = firstLetter.toUpperCase(); //Change the first letter in upper case
		//System.out.println(firstLetterUpper);
		
		String afterFirstLetter = temp[i].substring(1, temp[i].length()); //give the remaining words of String
		
		System.out.print(firstLetterUpper+afterFirstLetter+" "); 
		}
		
	}

}
