package OOPs;

public class P2_Polymorphism_MethodOverloading7 {

	public void add(int x, long y) {
		System.out.println(x + y);
	}

	public void add(long x, int y) {
		System.out.println(x + y);
	}

//	public static void main(String[] args) {
//		P2_Polymorphism_MethodOverloading7 m7 = new P2_Polymorphism_MethodOverloading7();
//		m7.add(7, 8); // ambiguity is there...
//
//	}

}
