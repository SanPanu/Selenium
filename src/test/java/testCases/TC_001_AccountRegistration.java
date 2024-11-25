package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass
{
	
	
	@Test
	public void register() 
	{
		logger.info("**** Started Exicuting TC_001_AccountRegistration **** ");
		
		HomePage hp=new HomePage(driver);
		
		
		hp.clickOnMyAccount();
		logger.info("Clicked On My Account");
		hp.clickOnRegisterAccount();
		//hp.clickOnLoginAccount();
		
		AccountRegistrationPage ar=new AccountRegistrationPage(driver);
		
		logger.info("Providing Customer details....");
		ar.enterFirstName("San");
		ar.enterLastName("Pan");
		ar.enterEmail(generateRandomEmail()+"@gmail.com");
		ar.enterPhoneNumber(generateRandomPhonenuber());
		
		String Passwrd=generateRandomPass();
		ar.enterPassword(Passwrd);
		ar.enterConfirmPass(Passwrd);
		ar.clickOnAgreement();
		ar.clickOnContinue();
		
		logger.info("Validating Registering Account");
		String cnfMessage = ar.getAccountCreationConfirmationMessage();
		Assert.assertEquals(cnfMessage,"Your Account Has Been Created!");
		
		
	}
	
	public String generateRandomEmail()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String generateRandomPhonenuber()
	{
		String generatedPhoneNumber = RandomStringUtils.randomNumeric(10);
		return generatedPhoneNumber;
	}
	
	public String generateRandomPass()
	{
		String generatedPassalph=RandomStringUtils.randomAlphanumeric(5, 6);
		return generatedPassalph;	
	}
}
