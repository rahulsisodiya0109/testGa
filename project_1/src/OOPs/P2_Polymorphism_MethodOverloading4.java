package OOPs;

public class P2_Polymorphism_MethodOverloading4 extends P2_Polymorphism_MethodOverloading3 {

	public static void main(String[] args) {
		
		P2_Polymorphism_MethodOverloading4.add(4, 5);
		add(50, 100); // since extended i.e. inherited so static method can be directly called

		System.out.println(P2_Polymorphism_MethodOverloading3.add(8, 7, 4));
	}
}
