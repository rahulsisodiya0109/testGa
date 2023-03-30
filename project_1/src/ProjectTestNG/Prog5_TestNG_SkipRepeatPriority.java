package ProjectTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Prog5_TestNG_SkipRepeatPriority {

	@Test
	public void a() {
		System.out.println("This is a method test");
	}
	
	@Test(invocationCount = 2, priority = -1, enabled = false) 		//since enabled is false it will skip
	public void b() {
		System.out.println("This is b method test"); 
	}
	
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("This is c method test");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("This is d before method");
	}
}
