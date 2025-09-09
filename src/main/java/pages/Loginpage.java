package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
 	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Username']")WebElement user;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement pass;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	
	public Loginpage enterUsername(String username,String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
		return this;
	}
	public Homepage clickLogin()
	{
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeSelected(signin));
		signin.click();
		return new Homepage(driver);
	}
	public boolean IsDashboardisDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public boolean isalertDisplayed()
	{
		return alert.isDisplayed();
	}
	

}
