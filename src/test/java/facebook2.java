import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class facebook2 {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//HP//eclipse-wp//com.beVisible//BrowserDrivers//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.visible.com/shop/smartphones");
		takeScreenshots();
		driver.findElement(By.xpath("//button[@data-testid='Apple-filter']")).click();
		takeScreenshots();

		driver.findElement(By.xpath("//div[@aria-label='Apple iPhone SE']")).click();
		takeScreenshots();

	}

	public static void takeScreenshots() throws Exception {

		Date currentDate = new Date();
		String takecurrentDate1 = currentDate.toString().replace(" ", "-").replace(":", "_");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File terget = new File(".\\screenshots\\home" + takecurrentDate1 + ".png");
		FileUtils.copyFile(Src, terget);

	}

}
