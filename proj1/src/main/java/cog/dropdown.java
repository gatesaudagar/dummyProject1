package cog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropdown {

	WebDriver driver;

	@BeforeTest
	public void driverSetup() {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//HP//eclipse-wp//com.visible//BrowserDrivers//chromedriver.exe");

		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
	}

	@Test
	public void DropDown() {
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

	}

}
