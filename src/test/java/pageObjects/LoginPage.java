package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']") //sanpan@gmail.com
	WebElement emailfield;
	
	@FindBy(xpath="//input[@id='input-password']")//admin
	WebElement passwordfield;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	public void enterEmail(String emails)
	{
		emailfield.sendKeys(emails);
	}
	
	public void enterPassword(String pass)
	{
		passwordfield.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
