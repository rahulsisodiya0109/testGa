package OOPs;

public class P7_Interface2 implements P7_Interface1 {

	public void abc() {
		System.out.println("this is abc method.");
	}

	public static void main(String[] args) {
		
		P7_Interface2 i2 = new P7_Interface2();
		i2.abc();
		
		P7_Interface1 i2_1 = new P7_Interface2();  //passing the reference of interface and creating object of class through it's constructor
		i2_1.abc();
	}

}
