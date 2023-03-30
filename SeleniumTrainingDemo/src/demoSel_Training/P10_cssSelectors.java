package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_cssSelectors {

	public static void main(String[] args) {
		// CSS Selectors
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("shshshhs");
		
	}

}
