package OOPs;

public class P7_Interface5 extends P1_Inheritance1 implements P7_Interface3, P7_Interface4 {

	public void b() {
		System.out.println("b method");
	}

	public void a() {
		System.out.println("a method");
	}

	public static void main(String[] args) {
		
		P7_Interface5 i5 = new P7_Interface5();
		i5.a();
		i5.b();
		System.out.println(i5.roll);
	}

}
