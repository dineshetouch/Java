package Theory;

public class wrapperExamples {

	public static void main(String[] args) {
		
		//Primitive to Wrapper

		//Converting int into Integer 
		int a =20;		
		Integer i = Integer.valueOf(a); //converting int into Integer
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		System.out.println(a+ " "+i+" "+j);
		
		System.out.println("********************************************");
		//Wrapper to Primitive
		
		//Converting Integer to int
		Integer b = new Integer(3); 	
		int k = b.intValue(); //converting Integer to int
		int l = b; //unboxing, now compiler will write a.intValue() internally
		
		System.out.println(b+" "+k+" "+l);
		
		
		

	}

}
