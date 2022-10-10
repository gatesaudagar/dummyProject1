import Base_utility.Comman;
import Page_Utility.Account_Creation;
import Page_Utility.Billling_Adress;
import Page_Utility.LandingPage;
import Utility.FolderOperations;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import static Base_utility.Comman.driver;

public class SmokeTest {
	LandingPage lp = new LandingPage(driver);
	Account_Creation Ac = new Account_Creation(driver);
	Billling_Adress Ba = new Billling_Adress(driver);

//	FolderOperations FO = new FolderOperations();
//
//	@BeforeClass
//	public void BforeClass() {
//		FO.CreateSSFolder();
//	}

	@BeforeTest()
	public void BforeTest() {
		lp.InvokeBrowser("Chrome");
		lp.ImpliWait(10L);
		lp.MaximiseBrowser();

		PageFactory.initElements(driver, lp);
		PageFactory.initElements(driver, Ac);
		PageFactory.initElements(driver, Ba);
		

	}

	// @AfterTest
	public void AfterTest() {
		lp.Quit();
	}

	@Test(priority = 0)
	public void loginSu(Method method) throws IOException {
		lp.LoadURL("https://www.visible.com/shop/smartphones");
//		System.out.println(driver.getTitle());
//		Assert.assertEquals("Buy Smartphones & Cell Phones | Visible", driver.getTitle());

		lp.ClickAppleFilter();
		lp.clcikOniphoneSE(); 
		lp.clickOnPayToday();
		lp.TakeScreenShot("C://Users//HP//eclipse-wp//com.beVisible//ScreenShots" , "screen");
		lp.clickOncontinue();
		lp.ClickOnNewMember();
		lp.ClickOnPlusPlan();
		//lp.TakeScreenShot(".//ScreenShots//home.png" , "screen2");
//		lp.AddanAppleWatch();
//		lp.ClickWatch();
//		lp.clickOnPayToday();
//		lp.clickOncontinue();
		lp.clickOnCheckout();
		Ac.enterFirstName();
		Ac.enterLastName();
		Ac.entereEmail();
		Ac.enterePassword();
		Ac.clickContinueOnCreateAccount();
		Ba.enterStreetAdress();
	

	}

}
