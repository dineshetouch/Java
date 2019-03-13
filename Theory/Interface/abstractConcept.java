package Interface;

public class abstractConcept {

	public static void main(String[] args) {
		
		// we cannot create the object of abstract class
		
		SureshPhone obj = new SureshPhone();
		obj.dance();
		obj.call();
		obj.cook();
		obj.move();
		
		System.out.println("----------");
		
		MaheshPhone obj1 = new SureshPhone();
		obj1.dance();
		obj1.call();
		obj1.cook();
		obj1.move();
		
		System.out.println("----------");
		
		RameshPhone obj2 = new SureshPhone();
		obj2.dance();
		obj2.call();
		obj2.cook();
		obj2.move();

	}

}

abstract class MaheshPhone{ //abstract class
	
	public void call() {
		System.out.println("calling...");
	}
	public abstract void move(); //abstract method
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{ //Concrete class
	
	public void move() {
		System.out.println("moving...");
	}
}

class SureshPhone extends RameshPhone{
	
	public void dance() {
		System.out.println("dancing...");
	}
	public void cook() {
		System.out.println("cooking...");
	}
}







