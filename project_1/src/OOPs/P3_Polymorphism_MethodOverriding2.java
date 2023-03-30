package OOPs;

public class P3_Polymorphism_MethodOverriding2 extends P3_Polymorphism_MethodOverriding1 {

	public void eat() {
		System.out.println("You are eating.");
	}

	public static void main(String[] args) {
		P3_Polymorphism_MethodOverriding2 mr2 = new P3_Polymorphism_MethodOverriding2();

		mr2.eat(); // this would print "You are eating." method from the child class.

// while compilation it will pick eat() method from parents class but at run it will go with child class.

		//mr2.main(args);// stack overflow errors
		
		P3_Polymorphism_MethodOverriding1 mr1 = new P3_Polymorphism_MethodOverriding1();
		
		mr1.eat();
	}
}
