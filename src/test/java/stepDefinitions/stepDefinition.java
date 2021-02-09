package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class stepDefinition extends base {
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);

	}

	@Given("^Click on Login link in home page to land on sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_sign_in_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LandingPage l = new LandingPage(driver);
		/*
		 * if(l.getPopUpSize().size()>0) { l.getPopUp().click(); }
		 */

		l.getLogin().click();

	}

	/*@When("^User enters (.+) and (.+) logs in $")
	public void user_enters_and_logs_in(String username, String password) throws Throwable {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		LoginPage lo = new LoginPage(driver);
		lo.getEmail().sendKeys(username);
		lo.getPass().sendKeys(password);
		
		lo.getLogin().click();
	}*/

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" logs in$")
	public void user_enters_and_logs_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage lo = new LoginPage(driver);
		lo.getEmail().sendKeys(arg1);
		lo.getPass().sendKeys(arg2);
		
		lo.getLogin().click();
	}


	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LoginPage l1 = new LoginPage(driver);
		Assert.assertTrue(l1.getvali().isDisplayed());
	}
	

	@Given("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}

}
