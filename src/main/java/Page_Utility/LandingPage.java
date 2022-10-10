package Page_Utility;

import Base_utility.Comman;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Time;

public class LandingPage extends Comman {
	Comman comman = new Comman();

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-testid='Apple-filter']")
	public WebElement AppleFilter;

	@FindBy(xpath = "//div[@aria-label='Apple iPhone SE']")
	public WebElement iPhoneSE;

	@FindBy(xpath = "//button[@class='sc-jQAphf gfUyYU']")
	public WebElement PayToday;

	@FindBy(xpath = "//button[@data-testid='addcart-button']")
	public WebElement ContinueButton;

	@FindBy(xpath = "//button[@data-hover='New member']")
	public WebElement NewMember;

	@FindBy(xpath = "//button[@aria-label='Choose Visible+ plan']")
	public WebElement PlusPlan;

	@FindBy(xpath = "//button[@label='Add an Apple Watch']")
	public WebElement AddAppleWatch;

	@FindBy(xpath = "//div[@aria-label='Apple Watch SE']")
	public WebElement AppleWatch;
	
	@FindBy(xpath = "//button[@data-hover='Checkout']")
	public WebElement Checkout;
	

	public void ClickWatch() {
		comman.ClickOn(AppleWatch);
	}

	public void AddanAppleWatch() {
		comman.ClickOn(AddAppleWatch);
	}

	public void ClickOnPlusPlan() {
		comman.ClickOn(PlusPlan);

	}

	public void ClickOnNewMember() {
		comman.ClickOn(NewMember);

	}

	public void ClickAppleFilter() {
		comman.ClickOn(AppleFilter);

	}

	public void clcikOniphoneSE() {
		comman.ClickOn(iPhoneSE);
	}

	public void clickOnPayToday() {
		comman.ClickOn(PayToday);
	}

	public void clickOncontinue() {
		comman.ClickOn(ContinueButton);
	}
	
	public void clickOnCheckout() {
		comman.ClickOn(Checkout);
	}
	
	
}
