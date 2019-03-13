package Theory;

public class typeCasting {
//Assigning a value of one type to a variable of another type is known as Type Casting
//it is two types: Widening (implicit) Casting and Narrowing (Explicit) casting
	public static void main(String[] args) {
		
		//Widening Casing: the target type is larger than the source type		
		int i = 100;
		long l = i;
		float f = l;
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		
		System.out.println("*****************************");
		
		//Narrowing Casting: the target type is smaller then source type
		double d = 100.04;
		long k = (int) d;
		short j = (short) d; 
		
		System.out.println(d);
		System.out.println(k);
		System.out.println(j);
		

	}

}
