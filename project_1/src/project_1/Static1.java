package project_1;

public class Static1 {
	int a = 10;
	String b = "rahul";
	static int c = 11;

	public static void main(String[] args) {

		// c=12;
		Static1 n = new Static1();
		System.out.println(n.a);
		method1();
	}

	public static void method1() {
		int d = 19;
		System.out.println(c);
	}

	// non static
	public void method2() {
		int g = 11;
	}
}
