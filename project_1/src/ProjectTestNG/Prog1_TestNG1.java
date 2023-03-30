package ProjectTestNG;

import org.testng.annotations.*;

public class Prog1_TestNG1 {
 
	@Test
	public void a() {
		System.out.println("This is Test 'a'");
	}

	@Test
	public void a1() {
		System.out.println("This is Test a1"); 
	}

	@BeforeSuite
	public void b() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void c() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void d() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void e() {
		System.out.println("Before Method");
	}

	@AfterSuite
	public void f() {
		System.out.println("After Suite");
	}

	@AfterTest
	public void g() {
		System.out.println("After Test");
	}

	@AfterClass
	public void h() {
		System.out.println("After Class");
	}

	@AfterMethod
	public void i() {
		System.out.println("After Method");
	}

}
