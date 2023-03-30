package ProjectTestNG;

import org.testng.annotations.Test;

public class ExceptionHandling {

	//we could use "Throwable.class", "Exxception.class" but "Error.class" won't be used since it's exception not error
	@Test(expectedExceptions = ArithmeticException.class)
	public void abc() {

		int a = 0;
		int b = 1 / a;
		System.out.println(b);

	}

}
