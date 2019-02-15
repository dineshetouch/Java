
public class toTitleCase {

	public static void main(String[] args) {
		
		System.out.println(toTitleCase("ram is good boy"));
			
	}
	public static String toTitleCase(String givenString) {
	    String[] arr = givenString.split(" "); //spliting the string
	    StringBuffer sb = new StringBuffer();	//creating object of StringBuffer

	    for (int i = 0; i < arr.length; i++) {
	        sb.append(Character.toUpperCase(arr[i].charAt(0)))
	            .append(arr[i].substring(1)).append(" ");	//convert first letter of each word in uppercase
	    }
	
	    return sb.toString().trim(); //returing the String
	    
	}  

}
