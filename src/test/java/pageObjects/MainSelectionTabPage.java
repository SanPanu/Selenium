package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainSelectionTabPage extends BasePage
{
	
	public MainSelectionTabPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	/*@FindBy(xpath="//a[@class='dropdown-toggle'][normalize-space()='Components'][1]")
	WebElement components;*/

	@FindBy(xpath="//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]")
	WebElement Tablets;
	
	
	/*Actions act=new Actions(driver);
	public void SelectComponents()
	{
		
		act.moveToElement(components).build().perform();
	}*/
	public void ClickTablets()
	{
		Tablets.click();
	}
	
	
}
