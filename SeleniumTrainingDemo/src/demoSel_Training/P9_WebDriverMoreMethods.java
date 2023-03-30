package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9_WebDriverMoreMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//isSelected(), isEnabled(), clear(), click(), sendkeys(), isDisplayed
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://enterprise.bharatpe.in/");
		
		WebElement img1 = driver.findElement(By.xpath("//body/div[6]/div[2]/div[2]/div[4]/div[1]/div[1]/div[4]/img[1]"));
														
		
		//to check if the image is present or available on the page, enabled and selected
		System.out.println("image is available on the page : " + img1.isDisplayed());
		System.out.println("image is enabled on the page : " + img1.isEnabled());
		System.out.println("image is selected on the page : " + img1.isSelected());
		
		//=====================================================================
		// using click(), sendKeys()
		WebElement uName = driver.findElement(By.xpath("//input[@id='username']"));
		uName.sendKeys("rahul");
		Thread.sleep(5000);
		uName.clear();
		Thread.sleep(5000);
		uName.sendKeys("rahul sisodiya");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
