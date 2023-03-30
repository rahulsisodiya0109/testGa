package OOPs;

public class P9_ExceptionHandling4 {

	public static void checkEligibility(int age) {

		try {
			if (age < 18) {
				throw new ArithmeticException("Not applicable for voting.");  // for throwing single exception
			} else {
				System.out.println("applicable");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) throws InterruptedException  , Exception, InterruptedException{
		checkEligibility(17);
		Thread.sleep(1000);  //tried with multiple exception
		checkEligibility(21);
	}

}
