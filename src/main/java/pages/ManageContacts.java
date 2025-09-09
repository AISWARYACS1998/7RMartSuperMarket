package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageContacts {
	public WebDriver driver;
	PageUtility utility;
	WaitUtility util;

	public ManageContacts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		utility = new PageUtility(driver);
		util = new WaitUtility();
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement edit;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonenumber;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement address;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deliverytime;
	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement deliverylimit;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;
	@FindBy(xpath = "//h1[text()='Contact Us']")
	WebElement assertelement;

	public ManageContacts contactedit() {
		edit.click();
		return this;
	}

	public ManageContacts updatePhoneNumber(String var) {
		phonenumber.clear();
		phonenumber.sendKeys(var);
		return this;
	}

	public ManageContacts updateEmail(String ema) {
		email.clear();
		email.sendKeys(ema);
		return this;
	}

	public ManageContacts updateAddress(String addr) {
		address.clear();
		address.sendKeys(addr);
		return this;
	}

	public ManageContacts updateDeliveryTime(String delvryt) {
		deliverytime.clear();
		deliverytime.sendKeys(delvryt);
		return this;
	}

	public ManageContacts updateDeliveryLimit(String delvryl) {
		deliverylimit.clear();
		deliverylimit.sendKeys(delvryl);
		return this;
	}

	public ManageContacts updateStatus() {
		utility.scrollToElement(update);
		utility.clickElementJs(update);
		return this;
	}
	public boolean assertioncheck() {
		return assertelement.isDisplayed();
	}
}