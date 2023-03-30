package OOPs;

public class P9_ExceptionHandling2 {

	public static void main(String[] args) {

		String s = null;

		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// e.printStackTrace();
		}

		System.out.println("exception handled.");

		String t = "hello";
		try {
			int i = Integer.parseInt(t);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}  

		System.out.println("NumberFormatException handled");

		int u[] = new int[5];

		try {
			u[10] = 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException handled.");
		}

	}
}
