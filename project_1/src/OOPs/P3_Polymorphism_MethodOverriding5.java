package OOPs;

public class P3_Polymorphism_MethodOverriding5 {

	public static void main(String[] args) {
		P3_Polymorphism_MethodOverriding3 mr3 = new P3_Polymorphism_MethodOverriding4();
		// passing the reference of parent class but creating the object of child class.

		mr3.cook(); // this will print from child class due to overriding
		mr3.eat();
		mr3.handwash();
//		mr3.angry();	// undefined

	}
}
