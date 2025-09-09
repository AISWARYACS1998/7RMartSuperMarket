package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Fileuploadutility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategory {
	public WebDriver driver;
PageUtility utility;
	WaitUtility util;
	Fileuploadutility fileutility;
	
	public ManageCategory(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		utility = new PageUtility(driver);
        util = new WaitUtility();
        fileutility = new Fileuploadutility(); // initialize inside in constructor
	
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement buttonsave;
	@FindBy(xpath="//input[@name='category']")WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")WebElement choose;
	@FindBy(xpath="//label[text()='Show On Top Menu']")WebElement topmenu;
@FindBy(xpath="//label[text()='Show On Left Menu']")WebElement leftmenu;
@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
public ManageCategory savebutton()
{
	buttonsave.click();
	return new ManageCategory(driver);
}
public ManageCategory categorypage()
{
	//category.click();
	category.sendKeys("pastha");
	return this;
}
public  ManageCategory discountoption()
{
	discount.click();
	return this;
	
}
public  ManageCategory choosefile(String path)
{

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,6000)");

	choose.sendKeys("C:\\Users\\aiswa\\OneDrive\\Desktop\\screenshots\\addition answer.png");
	return this;
}
public  ManageCategory topmenushow()
{
	util.waitUntilElementIsClickable(driver,topmenu);
	utility.moveElement(topmenu);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,6000)");
	topmenu.click();
	return this;
}
public  ManageCategory leftmenushow()
{
	util.waitUntilElementIsClickable(driver,leftmenu);
	utility.moveElement(leftmenu);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,6000)");
	leftmenu.click();
	return this;
}
public  ManageCategory button()
{
	util.waitUntilElementIsClickable(driver,save);
	utility.moveElement(save);
	save.click();
	return this;
}

}



