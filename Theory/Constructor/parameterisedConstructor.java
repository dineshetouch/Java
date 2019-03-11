package Constructor;

public class parameterisedConstructor {
	
	int var;
	
	parameterisedConstructor(){
		this.var=10;
	}
	
	parameterisedConstructor(int num){
		this.var=num;
	}
	parameterisedConstructor(int i, int j){
		System.out.println("Consstructor with two paramerer");
	}
	
	parameterisedConstructor(int i, int j, String name){
		System.out.println("Consstructor with three paramerer");
	}
	
	public int getValue(){
		return var;
	}

	public static void main(String[] args) {
		
		parameterisedConstructor obj = new parameterisedConstructor();
		parameterisedConstructor obj2 = new parameterisedConstructor(100);
		
		System.out.println("Var is: "+obj.getValue());
		System.out.println("Var is: "+obj2.getValue());
		
		parameterisedConstructor obj3 = new parameterisedConstructor(100, 50);
		parameterisedConstructor obj4 = new parameterisedConstructor(100, 50, "Dinesh");

	}

}
