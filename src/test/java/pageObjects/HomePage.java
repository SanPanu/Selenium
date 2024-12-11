package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement myAccout;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement registerAccount;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginAccount;
	
	
	
	public void clickOnMyAccount()
	{
		myAccout.click();
	}
	public void clickOnRegisterAccount()
	{
		registerAccount.click();
	}
	public void clickOnLoginAccount()
	{
		loginAccount.click();
	}
}
