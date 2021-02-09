package Academy;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}

	@Test(dataProvider = "getData")
	public void basePagenavigation(String username, String password) throws IOException {

		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lo = new LoginPage(driver);
		lo.getEmail().sendKeys(username);
		lo.getPass().sendKeys(password);
		lo.getLogin().click();
		log.info("executed successfully");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		// 0th row
		data[0][0] = "jhjhj";
		data[0][1] = "hi";
		// data[0][2]="restricted user";
		// 1rst row
		data[1][0] = "mani";
		data[1][1] = "hello";
		// data[1][2]="non restricted user";
		return data;

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
		
	}

}
