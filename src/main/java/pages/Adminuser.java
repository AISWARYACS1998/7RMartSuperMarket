package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminuser 
{
	public WebDriver driver;
 	public Adminuser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
 
 	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'and @class='small-box-footer']")WebElement more;
	public void moreinfo()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		more.click();
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement add;
	public void clicks()
	{
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/list-admin");
		add.click();
	}
	@FindBy(xpath="//input[@id='username']")WebElement usernames;
	@FindBy(xpath="//input[@id='password']")WebElement passwords;
	public void home(String username,String password)
	{
		usernames.sendKeys(username);
		passwords.sendKeys(password);
	}
	@FindBy(xpath="//select[@name='user_type']") WebElement usertype;
	public void user()
	{
		Select select=new Select(usertype);
		select.selectByIndex(1);

	}
	@FindBy(xpath="//button[@name='Create']") WebElement save;
	public void saveclick()
	{
		save.click();
	}
	
	}
	

