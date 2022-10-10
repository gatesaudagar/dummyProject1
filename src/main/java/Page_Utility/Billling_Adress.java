package Page_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_utility.Comman;

public class Billling_Adress extends Comman {

	Comman comman = new Comman();

	public Billling_Adress(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='streetLineOneField']")
	public WebElement StreetAdress;

	@FindBy(xpath = "//input[@value='500 West Madison']']")
	public WebElement enterstreetAdress;

	public void enterStreetAdress() {
		comman.EnterValue(StreetAdress, "500 West Madison");
		comman.HoverMouseOn(enterstreetAdress);
		comman.ClickOn(enterstreetAdress);

	}

}
