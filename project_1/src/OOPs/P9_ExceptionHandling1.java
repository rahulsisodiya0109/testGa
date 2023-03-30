package OOPs;

public class P9_ExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			int x = 5/0;	//this will give ArithmeticException
		}catch(ArithmeticException a) {
			a.printStackTrace();
			System.out.println("handled ArithmeticException....");
		}catch(NullPointerException b) {
			System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException c) {
			
		}catch(Exception c) {
	//the exception handler will always be at last in catch block because it's the parent class of all other exception,
	//if we give this at first then others, then it will throw error,..		
		}
		System.out.println("out of try block, exception handled,..");
		
		try {
			int y = 3/0;	//this will give ArithmeticException
		}catch(ArithmeticException a) {
			a.printStackTrace();
			System.out.println("handled AE....");
		}
		finally {
			System.out.println("finally will execute for sure");
		}

		
	}

}
