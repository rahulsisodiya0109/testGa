package ProjectTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog9_TestNG_Assertion1 {

	@Test
	public void testCase2() {
 
		int a = 10;
		int b = 20;

		String actual = "google";
		String expected = "google";

		// the text is printed condition fail
		Assert.assertEquals(actual, expected, "Equal assertion fail.");
		System.out.println("Equal assertion pass.");

		Assert.assertTrue(a < b, "True assertion fail.");
		System.out.println("True assertion pass");

		Assert.assertFalse(a < b, "False assertion fail");
		System.out.println("False assertion pass");

		// if assertion fail execution stop and further line code won't execute.
	}
	
	@Test
	public void testCase3() {
		System.out.println("Hello Assertion, this is out of scope of previously failed assertion");
	}
}
