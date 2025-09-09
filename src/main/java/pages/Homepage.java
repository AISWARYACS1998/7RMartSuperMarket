package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class Homepage {
	public WebDriver driver;
	PageUtility utility;
	WaitUtility util;
	 public Homepage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 utility = new PageUtility(driver);
	        util = new WaitUtility();
	 }
 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and @class='small-box-footer']")WebElement more;
@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']")WebElement logout;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement morenews;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement morecategory;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement morecontact;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'and@class='small-box-footer']")WebElement morefooter;
@FindBy(xpath = "//img[@class='img-circle']") WebElement avatar;
public Adminuser moreinfo()
{
	//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
	more.click();
	return new Adminuser(driver);
}
public Homepage adminclick()
{
	
	admin.click();
	return this;
}
	public Homepage logoutclick()
	{
	logout.click();
	return this;
	}
	public Managenews moreinfonews()
	{
		morenews.click();
		return new Managenews(driver) ;
	}
	public ManageCategory moreinfocategory()
	{
		morecategory.click();
		return new ManageCategory(driver);
	}
	public boolean isAvatarDisplayed()
	{
		return avatar.isDisplayed();
		
	}
	public ManageContacts moreinfocontact()
	{
		morecontact.click();
		return new ManageContacts(driver);
	}
	public  Managefootertext moreinfofootertext()
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,6000)");
		util.waitUntilElementIsClickable(driver,morefooter);
		//utility.moveElement(morefooter);
		morefooter.click();
		return new Managefootertext(driver);
	}
}

