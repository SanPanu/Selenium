package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmPass;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreement;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebutton;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement AccountCreationConfirmationMessage;
	
	
	public void enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void enterEmail(String emails)
	{
		email.sendKeys(emails);
	}
	
	public void enterPhoneNumber(String phnum)
	{
		phoneNumber.sendKeys(phnum);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterConfirmPass(String cnfPass)
	{
		confirmPass.sendKeys(cnfPass);
	}
	
	public void clickOnAgreement()
	{
		agreement.click();
	}
	
	public void clickOnContinue()
	{
		continuebutton.click();
	}
	
	public String getAccountCreationConfirmationMessage()
	{
		try {
		return(AccountCreationConfirmationMessage.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
		
	}
}
