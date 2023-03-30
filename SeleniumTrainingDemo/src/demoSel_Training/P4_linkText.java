package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P4_linkText {

	public static void main(String[] args) {
	
		// This is to present linkText
		
				System.setProperty("webdriver.gecko.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\geckodriver.exe");
				WebDriver driver1 = new FirefoxDriver();
				
				driver1.get("https://www.facebook.com/");

				driver1.findElement(By.linkText("Privacy")).click();
				
				driver1.close();  // closes parent window
//				driver1.quit();   // closes parent and child both

	}

}
