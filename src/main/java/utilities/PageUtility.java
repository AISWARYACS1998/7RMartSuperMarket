package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {
	WebDriver driver;
	public PageUtility(WebDriver driver)
	{
		this.driver=driver;
	}
	public void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void selectByVisibletext(WebElement element1,String text)
	{

		Select select=new Select(element1);
		select.selectByVisibleText(text);
	}
	public void selectByvalues(WebElement element2,String value)
	{

		Select select=new Select(element2);
		select.selectByValue(value);
	}
	

	public void moveElement(WebElement element)
		{
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		}
		public void doubleClick(WebElement element)
		{
			Actions actions = new Actions(driver);
			actions.doubleClick(element).perform();
		}
		public void dragAndDrop(WebElement sourceelement, WebElement targetelement)
		{
			Actions actions = new Actions(driver);
			actions.dragAndDrop(sourceelement, targetelement).perform();
		}
		public void rightClick(WebElement element)
		{
			Actions actions = new Actions(driver);
			actions.contextClick(element).perform();
		}
		public void clickAndHoldRelease(WebElement targetelement)
		{
			Actions actions = new Actions(driver);
			actions.clickAndHold(targetelement).release().perform();	
		}
		public void scrollToElement(WebElement element)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,4000)");
		
				
		}
		public void clickElementJs(WebElement element)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()",element);
			
		}
	public class WaitUtility {
		
		public void waitUntilElementIsClickable(WebDriver driver,WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void waitUntilElementIsVisible(WebDriver driver, WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}

	}
}
