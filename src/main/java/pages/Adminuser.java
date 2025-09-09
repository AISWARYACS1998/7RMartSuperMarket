package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class Adminuser 
{
	public WebDriver driver;
	PageUtility utility=new PageUtility(driver);
	WaitUtility wait=new WaitUtility();
 	public Adminuser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
 
 	
	
@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement add;
@FindBy(xpath="//input[@id='username']")WebElement usernames;
@FindBy(xpath="//input[@id='password']")WebElement passwords;
@FindBy(xpath="//select[@name='user_type']") WebElement usertype;
@FindBy(xpath="//button[@name='Create']") WebElement save;


	public Adminuser clicks()
	{
		//driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-admin");
		add.click();
		return this;
	}

	public Adminuser home(String username,String password)
	{
		usernames.sendKeys(username);
		passwords.sendKeys(password);
		return this;
	}
	
	public Adminuser user()
	{
		utility.selectByIndex(usertype, 1);
		return this;
	}
	
	public Adminuser saveclick()
	{
		save.click();
		return this;
	}

	public Adminuser moreinfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
	

