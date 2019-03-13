package Constructor;

public class Data {

	int id;
	int age;
	String name;

	 Data() {

		 this(500, "Dinesh");
	}

	Data(int id, String name) {

		this(id, 25, name);
	}

	Data(int id, int age, String name) {
		
		this.id = id;
		this.age = age;
		this.name = name;

	}
	
	public static void main(String[] args) {

	}



}
