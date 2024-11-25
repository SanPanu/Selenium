package testCases;

import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass
{
	@Test
	public void login()
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnLoginAccount();
		
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail("sanpan@gmail.com");
		lp.enterPassword("admin");
		lp.clickLoginButton();
		
	}

}
