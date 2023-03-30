package project_1;

public class Array3 {

	public static void main(String[] args) {
		int[] c = { 3, 2, 1, 4, 5 };
		PassingArrayToMethod(c);
	}

	public static void PassingArrayToMethod(int a[]) {

		int b = a[0]; // b=3
		for (int i = 0; i < a.length; i++) // a.length = 5
		{

			if (b >= a[i]) {
				System.out.println(b);
			} else {
				System.out.println("abcd");
			}

		}
	}

}
