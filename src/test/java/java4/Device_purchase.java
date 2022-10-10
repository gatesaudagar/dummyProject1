package java4;
import static Base_utility.Comman.driver;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Utility.Account_Creation;
import Page_Utility.Billling_Adress;
import Page_Utility.LandingPage;

public class Device_purchase {

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
	public void loginSu1() throws IOException {
		lp.LoadURL("https://www.visible.com/shop/smartphones");
//		System.out.println(driver.getTitle());
//		Assert.assertEquals("Buy Smartphones & Cell Phones | Visible", driver.getTitle());

		lp.ClickAppleFilter();
		lp.clcikOniphoneSE();
		lp.clickOnPayToday();
		lp.clickOncontinue();
		lp.ClickOnNewMember();
		lp.ClickOnPlusPlan();
		lp.clickOnCheckout();
		Ac.enterFirstName();
		Ac.enterLastName();
		Ac.entereEmail();
		Ac.enterePassword();
		Ac.clickContinueOnCreateAccount();
		Ba.enterStreetAdress();

	}

}
