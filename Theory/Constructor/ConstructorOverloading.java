package Constructor;

public class ConstructorOverloading {
	
	int stdId;
	int stdAge;
	String stdName;
	
	ConstructorOverloading(){
		stdId = 2300;
		stdAge = 30;
		stdName = "Dinesh";
	}
	
	ConstructorOverloading(int stdId, int stdAge, String stdName){
		
		this.stdId = stdId;
		this.stdAge = stdAge;
		this.stdName = stdName;
		
	}
	

	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading();
		
		System.out.println("Name: "+obj.stdName);
		System.out.println("Id: "+obj.stdId);
		System.out.println("Age: "+obj.stdAge);
		
		
		ConstructorOverloading obj1 = new ConstructorOverloading(2291, 28, "Vineet");
		
		System.out.println("Name: "+obj1.stdName);
		System.out.println("Id: "+obj1.stdId);
		System.out.println("Age: "+obj1.stdAge);

	}

}
