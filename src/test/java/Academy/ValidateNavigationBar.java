package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigationBar extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("validatenavigation");
	}
	@Test
	public void contactnavigationbar() throws IOException
	
	{
		
		//driver.get(prop.getProperty("url"));
	
	LandingPage l1=new LandingPage(driver);
	Assert.assertTrue(l1.getNavigationbar().isDisplayed());
	log.info("navigation is enabled successfully");
	//Assert.assertFalse(false);
	
	
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}
	
	
}
