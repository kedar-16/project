package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.TestBase;
import pages.LoginPage;

public class loginPageTest extends TestBase {
	LoginPage lp;
	@BeforeMethod
	public void open()
	{
		lp=new LoginPage();
		openBrowser();
	}
	@Test
	public void TC_001setuplogin()
	{	Boolean value = lp.username();
		Assert.assertEquals(value, true);
	}
	@AfterMethod
	public void close()
	{
		closeBrowser();
	}
}


