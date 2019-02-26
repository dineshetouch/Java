package Array;
//Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME. 
public class environmentVariable {

	public static void main(String[] args) {
		
		//System.getenv() is working on key value pair (HashMap)
		//Will pass the key name in System.getenv("key name") and will get their corresponding value.
		
		System.out.println(System.getenv("Path")); //give the path of eclipse
		System.out.println(System.getenv("TEMP")); // give the path of temp file
		System.out.println(System.getenv("Username")); // give the path of current OS username
		System.out.println(System.getenv("OS")); // provide OS details
		System.out.println(System.getenv("PATHEXT")); 
		System.out.println(System.getenv("pROCESSOR_IDENTIFIER")); // key value in given string is not case sensitive.
		System.out.println(System.getenv("windir"));
		System.out.println(System.getenv("windows_tracing_flags"));
		System.out.println(System.getenv("PSMOdulePath"));
		System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
		System.out.println(System.getenv("PROCESSOR_LEVEL"));

		
		 //getting null value as system didn't get the "Environment variable Path" key.
		System.out.println(System.getenv("Environment variable Path"));
		
		
	}

}
