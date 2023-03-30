package OOPs;

public class P2_Polymorphism_MethodOverloading8 {

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void add(long x, long y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		P2_Polymorphism_MethodOverloading8 m8 = new P2_Polymorphism_MethodOverloading8();
		m8.add(7, 8); // ambiguity issue resolved...

// here it will select method as per the memory allocation, whatsoever takes less memory will be used.

	}
}
