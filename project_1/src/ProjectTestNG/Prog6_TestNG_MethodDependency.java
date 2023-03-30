package ProjectTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prog6_TestNG_MethodDependency {

	@Test
	public void a() {
		Assert.assertTrue(3>12);		//assertTrue expected is True if False then won't execute further
		System.out.println("This is a method test");
	}
	
	@Test(dependsOnMethods = "a") 		//this would depends on a() if a() fail, b() won't execute or skip
	public void b() {
		System.out.println("This is b method test");
	}
}
