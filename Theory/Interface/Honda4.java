package Interface;

public class Honda4 extends Bike {

	public static void main(String[] args) {
		
		Bike obj = new Honda4();
		
		obj.run();

	}

	@Override
	void run() {
		System.out.println("running safely");
		
	}

}
