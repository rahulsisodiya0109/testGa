package OOPs;

public abstract class P5_Abstraction1 {

	static int a = 5;
	int b = 5;
	final int c = 10;

	// default constructor
	P5_Abstraction1() {
		System.out.println("Hello this is constructor");
	}

	// abstract method
	abstract void eat();

	// non-abstract method
	public void b() {
		System.out.println("non-abstract method");
	}
}
