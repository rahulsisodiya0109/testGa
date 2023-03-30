package OOPs;

public class P1_Inheritance4 extends P1_Inheritance3 {

	public void multiply(int x, int y) {
		z = x*y;
		System.out.println("multiply is : "+ z);
	}
	
	public static void main(String[] args) {
		
		P1_Inheritance4 i4 = new P1_Inheritance4();
		
		i4.add(4, 8);
		i4.multiply(55, 4);
		i4.substract(77, 7);
	}
}
