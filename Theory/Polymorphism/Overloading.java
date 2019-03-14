package Polymorphism;

public class Overloading {

	public static void main(String[] args) {

		// Which method is to be called is determined by the arguments we pass while
		// calling methods. This happens at compile time so this type of polymorphism is
		// known as compile time polymorphism.
		
		Overload obj = new Overload();

		obj.demo(10);
		obj.demo(20, 30);
		double result  = obj.demo(5.5);
		
		System.out.println("O/P of double method in parent class: "+result);

	}

}
