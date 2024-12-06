package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass
{
	@Test
	public void login() 
	{
		
		HomePage hp=new HomePage(driver);
		logger.info("*** Logging into Account ***");
		hp.clickOnMyAccount();
		hp.clickOnLoginAccount();
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering Email & Password.....");
		lp.enterEmail(p.getProperty("Username"));
		lp.enterPassword(p.getProperty("Password"));
		lp.clickLoginButton();
		
		AccountPage ap=new AccountPage(driver);
		String actualtext = ap.validatLogin();
		Assert.assertEquals(actualtext, "My Account");
		
		logger.info("Logged In Successgfully....");
		
		
	}

}
