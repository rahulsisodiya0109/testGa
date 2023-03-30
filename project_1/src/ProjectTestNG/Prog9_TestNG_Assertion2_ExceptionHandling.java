package ProjectTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog9_TestNG_Assertion2_ExceptionHandling {

	@Test
	public void testCase2() {

		String actual = "google";
		String expected = "goooogle";

		try {
			Assert.assertEquals(actual, expected, "Equal assertion fail.");
		} catch (AssertionError a) {
			a.printStackTrace();		//use error class reference to print error with method printStackTrace
		}	
		System.out.println("Equal assertion pass.");
//try and catch is used to handle the exceptions, we just need to use following keywords
//named as 1)Throwable> 1.1>Exception>(can have many other exception errors)
//                      1.2>Error>(can have many other errors)
	
	
	}
}
