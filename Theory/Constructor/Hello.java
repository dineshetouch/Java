package Constructor;

public class Hello {
	
	String name;
	
	Hello(){
		
		name="BeginnersBook.com";
		
	}

	public static void main(String[] args) {
		Hello obj = new Hello();
		System.out.println(obj.name);

	}

}
