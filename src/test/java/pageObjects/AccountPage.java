package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage
{
	public AccountPage(WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement loginValidation;
	
	public String validatLogin()
	{
		return loginValidation.getText();
	}

}
