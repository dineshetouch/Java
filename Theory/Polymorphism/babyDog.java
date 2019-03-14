package Polymorphism;
//Java Runtime Polymorphism with Multilevel Inheritance:
public class babyDog extends dog {
	
	void eat() {
		System.out.println("drinking milk");
	}

	public static void main(String[] args) {
		
		Animal a1, a2, a3;
		
		a1 = new Animal();
		a2 = new dog();
		a3 = new babyDog();
		
		a1.eat();
		a2.eat();
		a3.eat();
		
		System.out.println("***********");
		
		dog d = new babyDog();
		d.eat();
		

	}

}
