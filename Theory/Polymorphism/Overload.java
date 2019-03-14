package Polymorphism;
//Compile time Polymorphism:Method Overloading on the other hand is a compile time polymorphism example.

public class Overload {

	void demo(int a) {
		System.out.println("a: "+a);
	}
	
	void demo(int a, int b) {
		System.out.println("a and b are: "+a+", "+b);
	}
	
	double demo(double d) {
		System.out.println("double d: "+d);
		
		return d*d;
	}
	
}
