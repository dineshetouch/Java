package Constructor;
//When A constructor calls another constructor of same class then this is called constructor chaining.
public class ConstructorChaining {
	
	int age;
	String name;
	
	ConstructorChaining(){
		this("Dinesh");
	}
	ConstructorChaining(String name){
		this(30, name);
	}
	
	ConstructorChaining(int age, String name){
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[] args) {
		
		ConstructorChaining obj = new ConstructorChaining();
		
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);

	}

}
