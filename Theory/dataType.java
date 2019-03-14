package Theory;

public class dataType {

	public static void main(String[] args) {
		  byte x;
		  int a = 270;
		  double b = 128.128;
		  
		  System.out.println(" int converted to byte");
		  x = (byte) a; //Capacity of byte is -128 to 127. 
		  System.out.println("a = " + a + " and x = " + x);
		  
		  System.out.println("\n double converted to int");
		  a = (int) b;
		  System.out.println("b = " + b + " and a = " + a);
		  
		  System.out.println("\n double converted to byte");
		  x = (byte)b;
		  System.out.println("b = " + b + " and x = " + x);

	}

}

