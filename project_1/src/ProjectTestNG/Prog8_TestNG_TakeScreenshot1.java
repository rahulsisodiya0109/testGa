package ProjectTestNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Prog8_TestNG_TakeScreenshot1 {
	
	// this is the program to take screenshot
	
	WebDriver driver;

	public void captureScreenshot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			// create reference of TakeScreenshot interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScheenshotAs() method to capture screenshot in File format
			// getScheenshotAs() method return type is - File
			File source = ts.getScreenshotAs(OutputType.FILE);

			// Copy file to a specific location with certain format(like .png)
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
			System.out.println(result.getName() + " method() screenshot captured.");

		}
	}
}
