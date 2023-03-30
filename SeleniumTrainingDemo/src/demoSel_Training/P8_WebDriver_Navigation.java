package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8_WebDriver_Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("This is for WebDriver Navogation Methods");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		
		driver.findElement(By.linkText("Images")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
