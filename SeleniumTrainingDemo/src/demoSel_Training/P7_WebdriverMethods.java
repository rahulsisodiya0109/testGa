package demoSel_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7_WebdriverMethods {

	public static void main(String[] args) {
		
		System.out.println("This is the Practise Class");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\webdrivers\\chromedriver.exe");
		WebDriver xyz = new ChromeDriver();
		
		xyz.get("https://www.facebook.com/");
		 
		String pageTitle = xyz.getTitle();
		System.out.println("page title is: "+pageTitle);
		
		System.out.println("page url is: "+ xyz.getCurrentUrl());		
		
		WebElement unm = xyz.findElement(By.id("email"));
		
		System.out.println("attribute is : "+ unm.getAttribute("class"));
		System.out.println("tag name is : "+ unm.getTagName());
		System.out.println("text is : " + unm.getText());
		System.out.println("css is : " + unm.getCssValue("id"));
		
				
		//xyz.close();

	}

}
