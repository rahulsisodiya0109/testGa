package project_1;

public class TypeCasting {

	public static void main(String[] args) {

		// widening casting
		int a = 5;
		double b = a; // automatic casting : int to double
		System.out.println(a);
		System.out.println(b);

		// narrowing casting(manual casting)

		double c = 6.0;
		int d = (int) c; // manual casting : double to int
		System.out.println(c);
		System.out.println(d);

		// converting string into int using parseint

		String e = "123";
		int f = Integer.parseInt(e);
		System.out.println(f);
		System.out.println(e + 1 + " | " + (f + 1));

		// converting integer to string
		int l = 124;
		String m = Integer.toString(l);

		System.out.println(l + 1 + " | " + m + 1);
	}

}
