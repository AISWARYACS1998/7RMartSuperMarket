package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class Managefootertext {
	public WebDriver driver;
	PageUtility utility;
	WaitUtility util;

	public Managefootertext(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		utility = new PageUtility(driver);
		util = new WaitUtility();
	}

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")
	WebElement editfooter;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addressfooter;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfooter;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonefooter;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement updatefooter;
	@FindBy(xpath = "//h1[text()='Footer Text']")
	WebElement assertelement;

	public Managefootertext enterEditFooter() {
		editfooter.click();
		return this;
	}

	public Managefootertext enterAddressFooter(String addr) {
		addressfooter.clear();
		addressfooter.sendKeys(addr);
		return this;
	}

	public Managefootertext enterEmailFooter(String ema) {
		emailfooter.clear();
		emailfooter.sendKeys(ema);
		return this;
	}

	public Managefootertext enterPhoneNumber(String phn) {
		phonefooter.clear();
		phonefooter.sendKeys(phn);
		return this;
	}

	public Managefootertext enterUpdate() {
		utility.scrollToElement(updatefooter);
		utility.clickElementJs(updatefooter);
		return this;
	}
	public boolean assertMethod() {
		return assertelement.isDisplayed();

	}
}