package OOPs;

public class P5_Abstraction2 extends P5_Abstraction1 {

	void eat() {
		System.out.println("eating");
	}

	public static void main(String[] args) {
		P5_Abstraction2 a2 = new P5_Abstraction2();

		a2.eat();
		a2.b();
	}

}
