package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P3_id {

public static void main(String[] args) {
	
	//this is to use webelement ID, Name and provide email data
	
	
	System.setProperty("webdriver.gecko.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\geckodriver.exe");
	WebDriver driver1 = new FirefoxDriver();
	
	driver1.get("https://www.facebook.com/");
	
	
	WebElement email = driver1.findElement(By.id("email"));
	email.sendKeys("rahulsisodiya109@gmail.com");

	
	}
		
	
		
    
	
}
