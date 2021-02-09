package pageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By contact=By.cssSelector("a[href*='contact.php']");
	By popup=By.xpath("button[text()='NO Thanks']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavigationbar()
	{
		return driver.findElement(contact);
	}
	
	public List<WebElement> getPopUpSize()
	{
		return driver.findElements(popup);
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
}
