package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class Managenews {
	public WebDriver driver;
	PageUtility utility=new PageUtility(driver);
	WaitUtility wait=new WaitUtility();
	
	public Managenews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newitem;
	@FindBy(xpath="//textarea[@id='news']")WebElement enter;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	
	public Managenews item()
	{
		newitem.click();
		return this;
	}
	public Managenews enternews()
	{
		enter.sendKeys("the biggest news");
		return this;
	}
	public Managenews buttonclick()
	{
		save.click();
		return this;
	}

}
