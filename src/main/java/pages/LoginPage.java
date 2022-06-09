package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;




public class LoginPage extends TestBase
{
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement txtusername;
	@FindBy(xpath = "//input[@placeholder='Password']")WebElement txtpass;
	@FindBy(xpath = "//input[@name='login-button']")WebElement btnLogin;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Boolean username()
	{
		return txtusername.isDisplayed();
	}
	public Boolean pass()
	{
		return txtpass.isDisplayed();
	}
	public Boolean loginbtn()
	{
		return btnLogin.isDisplayed();
	}
	
	
	
}
