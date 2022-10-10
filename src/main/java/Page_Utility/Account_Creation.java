package Page_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utility.Comman;

public class Account_Creation extends Comman {

	Comman comman = new Comman();

	public Account_Creation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement LastName;

	@FindBy(xpath = "//input[@name='email']")
	public WebElement Email;

	@FindBy(xpath = "//input[@name='password']")
	public WebElement PassWord;
	
	@FindBy(xpath = "//button[@id='signUpCreateBtn']")
	public WebElement clickContinue;

	public void enterFirstName() {

		comman.EnterValue(FirstName, "VisibleLLC");
	}

	public void enterLastName() {

		comman.EnterValue(LastName, "Test");
	}

	public void entereEmail() {

		comman.EnterValue(Email, "preproduat100+0809_986579@gmail.com");
	}

	public void enterePassword() {

		comman.EnterValue(PassWord, "$Thinair321");
	}

	public void clickContinueOnCreateAccount() {

		comman.ClickOn(clickContinue);
	}
}


