package Rough;

public class B extends A {

	int i = 10;
	int j = 40;

	public void testA1() { // Overridden function
		System.out.println("test A1 child");
	}

	public void testB1() {
		System.out.println("test B1");
	}

	public static void main(String[] args) {
		// object of parent class
		A a = new A(); // able to call only parent class

		a.testA1();
		a.testA2();
		a.testA3();
		int y = a.i;// able to call only variable of parent class
		System.out.println(y);

		
		System.out.println("*************");
		
		// object of child class
		B b = new B(); // able to call all the functions of parent as well child 

		b.testA1(); // overridden func of child class
		b.testA2();
		b.testA3();
		b.testB1();
		System.out.println(b.i); // overridden of child variable
		System.out.println(b.k);
		
		System.out.println("*************");
		// creating object of child class with reference to parent class (Upcasting)
		A obj = new B(); // able to call all the function of parent class and overridden function of child class

		obj.testA1();
		obj.testA2();
		obj.testA3();
	
		//Rule: Runtime polymorphism can't be achieved by data members.
	System.out.println(obj.i);
	System.out.println(obj.k);
	//System.out.println(obj.j); unable to call as j variable is ion child class

	}

}
