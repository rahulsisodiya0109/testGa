package ProjectTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Prog4_TestNG_SkipRepeat {

	// we can comment @Test annotation and skip the test to execute
	// @Test
	public void a() {
		System.out.println("This is a method"); 
	}

	// using (enabled = false), mostly used in industry
	@Test(enabled = false)
	public void b() {
		System.out.println("This is b method");
	}

	// we can repeat the single test execution with (invocationCount = 2)
	@Test(invocationCount = 3)
	public void c() {
		System.out.println("This is c method");
	}

	// can skip with invocation count as 0
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("This is d method");
	}

	//Correct way but not recommended
	@Test
	public void e() {
		System.out.println("This is e method");
		throw new SkipException("Skipping e test method");		//anything after in this method is unreachable
		//System.out.println("Hello");		//this code is unreachable
	}
}
