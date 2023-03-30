package project_Garima;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro2_radiobutton {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\panther\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'new account')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> radio = driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("sie of the radio="+radio.size());
		radio.get(0).click();
		radio.get(1).isEnabled();
		Thread.sleep(2000);
		//2way
		List<WebElement> radio1=driver.findElements(By.xpath("//label[@class='_58mt']"));
		String sbutton="male";
		for(int i=0;i<radio1.size();i++)
		{
		if(radio1.get(i).getText().equalsIgnoreCase(sbutton))
		{
			radio1.get(i).click();
			System.out.println(sbutton+"clicked");
			break;
		}
		}   
	}

}
