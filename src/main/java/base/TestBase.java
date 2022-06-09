package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	Properties pr;
	public static WebDriver driver;
	
	public void propertiesFile()
	{
		try {
		pr=new Properties();
		FileInputStream file=new FileInputStream("D:\\kp\\Automation\\demoproject\\propertiesfile\\config.properties");
		pr.load(file);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void openBrowser()
	{
		System.setProperty("webdriver,chrome,driver", "D:\\kp\\Automation\\demoproject\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public void closeBrowser()
	{
		driver.close();
	}


}
