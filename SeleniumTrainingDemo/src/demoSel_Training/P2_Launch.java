package demoSel_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P2_Launch {

	public static void main(String[] args) {
		
		//this is to launch the browser through webdrives
		
		
	//	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
	//	WebDriver driver1 = new ChromeDriver();
		
	//	driver1.get("https://www.facebook.com/");
		
		
		System.setProperty("webdriver.gecko.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("https://www.facebook.com/");
	

		
	}

}
