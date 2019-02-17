//check if a String contains only digits

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String str1 = "123world"; //String contains number and letter both
		String str2 = "12345";	//String contains only numbers
		
		
		//******First method***************
		System.out.println("**** method-1 ****");
		
		try{
		
		//if string contains only digits then try block will run otherwise control will go to catch block
			
		Integer num = Integer.valueOf(str1); //Converting string into Integer
		System.out.println("String contains only digits: "+str1);
		
		}catch (NumberFormatException e){
			System.out.println("String doesn't contains only digits: "+str1);
		}
	
				
		//******Second method***************
		System.out.println("**** method-2 ****");
		
		System.out.println(str1 + ": "+str1.matches("[0-9]+")); //return false as String contains digits and letter both
		System.out.println(str2 + ": "+str2.matches("[0-9]+")); //return true as String contains digits only 
		
		
		
		//-------------matches method examples in String-----------------
		System.out.println("**** matches method examples in String ****");
		
		System.out.println(str1.matches("(.*)world")); //(.*) is using for prefix / suffix in matches method
		System.out.println(str1.matches("123(.*)")); //return true
		System.out.println(str2.matches("^[0-9]*$")); //return true if String contains digits only 
		System.out.println(str2.matches("[0-9]+"));	// return true if String contains digits only 
				

	}

}
