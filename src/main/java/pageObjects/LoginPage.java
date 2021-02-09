package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	By login=By.cssSelector("[value='Log In']");
	By email=By.cssSelector("[id='user_email']");
	By pass=By.cssSelector("[id='user_password']");
	By vali=By.cssSelector("[class='link-below-button']");
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPass()
	{
		return driver.findElement(pass);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
		
	}
	public WebElement getvali()
	{
		return driver.findElement(vali);
	}
}
