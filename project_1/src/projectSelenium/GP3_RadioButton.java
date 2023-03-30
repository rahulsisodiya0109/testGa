package projectSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GP3_RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM_AUTOMATION_TESTING\\SOFTWARE\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'New Account')]")).click();
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//input[@value='1']")).click(); // female
		Thread.sleep(2000);

		List<WebElement> radio = driver.findElements(By.xpath("//label[@class='_58mt']")); // female 0 ; male 1; custom
																							// 3
		System.out.println("size of the radio" + radio.size());

		System.out.println(radio.get(1).isEnabled());
		System.out.println(radio.get(0).isDisplayed());
		radio.get(2).click();
		System.out.println(radio.get(0).getText()); //female
		System.out.println(radio.get(0).isSelected());
		Thread.sleep(2000);
		radio.get(1).click();
		System.out.println(radio.get(0).isSelected());
		Thread.sleep(3000);
		
		//Second way
		
		List<WebElement> radio1= driver.findElements(By.xpath("//label[@class='_58mt']"));
		String expResult="Female";
		for(int i=0; i<radio1.size();i++) {
			
			if(radio1.get(i).getText().equalsIgnoreCase(expResult)) {
				radio1.get(i).click();
				System.out.println(expResult + "clicked");
				break;
			}
		}
		
		
		
	}

}
