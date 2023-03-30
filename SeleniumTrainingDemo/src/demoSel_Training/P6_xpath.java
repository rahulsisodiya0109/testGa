package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_xpath {
	
public static void main(String[] args) {
		
		
		//this is to use webelement ID, Name and provide email data
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		driver1.findElement(By.xpath("//input[@id='email']")).sendKeys("rahulsisodiya109@gmail.com");
		driver1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Rahul");
		driver1.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		
	
	}

}
