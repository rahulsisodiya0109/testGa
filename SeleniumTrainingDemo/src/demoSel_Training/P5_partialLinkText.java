package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P5_partialLinkText {

	public static void main(String[] args) {
		
		
		// This is to present partialLinkText
		
				System.setProperty("webdriver.gecko.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\geckodriver.exe");
				WebDriver driver1 = new FirefoxDriver();
				
				driver1.get("https://www.facebook.com/");

				driver1.findElement(By.linkText("Privacy")).click();

				driver1.findElement(By.partialLinkText("printable")).click();

	}

}
