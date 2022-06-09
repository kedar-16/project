package TestCases;

import org.testng.annotations.Test;

import base.TestBase;

public class OpenSite extends TestBase {
	
	@Test(priority = 1)
	public void setup() throws InterruptedException
	{
		openBrowser();
		
	}
	@Test(priority = 2)
	public void close()
	{
		closeBrowser();
	}
	

}
