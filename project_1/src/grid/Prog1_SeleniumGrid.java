package grid;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prog1_SeleniumGrid {

	@DataProvider(parallel = true)
	public Object[][] sendData() {

		Object array[][] = new Object[3][2];

		array[0][0] = "email1";
		array[0][1] = "chrome";

		array[1][0] = "email2";
		array[1][1] = "chrome";

		array[2][0] = "email3";
		array[2][1] = "chrome";
		
		return array;
	}

	@Test(dataProvider = "sendData")
	public void login(String user, String browser) throws Exception {

		DesiredCapabilities cap = null;

		if (browser.equalsIgnoreCase("chrome")) {

			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);

			RemoteWebDriver rDriver = new RemoteWebDriver(new URL("http://192.168.0.103:5556/wd/hub/"), cap);
			rDriver.get("https://www.facebook.com/");
			rDriver.findElement(By.id("email")).sendKeys(user);
		}
	}
}
