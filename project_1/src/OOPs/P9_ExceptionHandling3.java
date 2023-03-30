package OOPs;

public class P9_ExceptionHandling3 {

	public static void main(String[] args) {

		try {
			int i = 10 / 2; // this will not give error still it will go to finally block
		} finally {

			try {
				int j = 5 / 0;
			} catch (Exception e) {
//				e.printStackTrace();
			}
			System.out.println("finally will execute always");
		}

	}

}
