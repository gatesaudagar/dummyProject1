import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//HP//eclipse-wp//com.beVisible//BrowserDrivers//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		screenShots();
		driver.get("https://www.aertrip.com/");
		Thread.sleep(3000);
		screenShots();
		driver.close();
		screenShots();
		screenShots();
		screenShots();
		screenShots();
		screenShots();
		

	}

	public static void screenShots() throws Exception {

		Date currentDate = new Date();
		System.out.println(currentDate);

		String screenShotFileName = currentDate.toString().replace(" ", "-").replace(":", "_");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//ScreenShots//" + screenShotFileName + ".png");
		FileUtils.copyFile(Src, target);

	}

}
