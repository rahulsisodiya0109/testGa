package ProjectTestNG;

import org.testng.annotations.Test;

public class Prog3_TestNG_Priority {

	@Test(priority = -20)
	public void a() {
		System.out.println("This is a method");
	}

	@Test(priority = 2)
	public void b() {
		System.out.println("This is b method"); 
	}

	@Test(priority = 0)
	public void d() {
		System.out.println("This is d method");
	}

	@Test
	public void c() {
		System.out.println("This is c method"); // test with no priority would be treated as priority 0 and
												// then would prioritized on alpha-numeric order
	}
}
