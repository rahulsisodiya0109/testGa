package ProjectTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Prog9_TestNG_SoftAssert {

	@Test
	public void testCasetwo() {

		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
		System.out.println("soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();

	}
}
