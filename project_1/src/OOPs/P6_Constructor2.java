package OOPs;

public class P6_Constructor2 {
	// this is Parameterized constructor program

	int id;
	String name;
	String address;

	// default constructor
	P6_Constructor2() {
		System.out.println("Hello Default Constructor.");
	}

	// parameterized constructor
	P6_Constructor2(int a, String b, String c) {

		this.id = a;
		this.name = b;
		address = c;

		System.out.println(id + "    " + name + "    " + address);
	}

	// non-static method
	public void displayInfo() {
		System.out.println(id + "    " + name + "    " + address);
	}

	public static void main(String[] args) {
		// this is also an example of constructor overloading
		// default constructor called
		P6_Constructor2 c2 = new P6_Constructor2();

		// parameterized constructor called
		P6_Constructor2 c2_1 = new P6_Constructor2(1, "Ram", "Ayodhya");

		c2_1.displayInfo();

	}

}
