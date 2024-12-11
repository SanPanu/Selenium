package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage
{
	public ProductPage(WebDriver driver)
	{
		super (driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Samsung Galaxy Tab 10.1']")
	WebElement actProduct;
	
	@FindBy(xpath="//span[normalize-space()='Add to Cart']")
	WebElement addToCartButton;
	
	/*@FindBy(xpath="//button[@id='button-cart']")
	WebElement mainAddToCart;*/
	
	@FindBy(xpath="//a[normalize-space()='shopping cart']")
	WebElement shopingCart;
	
	@FindBy(xpath="//div[@class='table-responsive']//table[@class='table table-bordered']//tbody//tr")
	List<WebElement> productList;
	
	@FindBy(xpath="//a[@href='#collapse-shipping']")
	WebElement EstimateTax;
	
	@FindBy(xpath="//select[@name='country_id']")
	WebElement SelcContry;
	
	
	@FindBy(xpath="//select[@name='zone_id']")
	WebElement SelcState;
	

	
	@FindBy(xpath="//input[@name='postcode']")
	WebElement Pincode;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement chekoutButton;
	
	
	public void Getnames(String productName)
	{
		for (WebElement row : productList) {
	        WebElement productNameElement = row.findElement(By.xpath(".//td[2]"));
	        if (productNameElement.getText().equals(productName)) {
	            WebElement totalAmountElement = row.findElement(By.xpath(".//td[contains(text(),'$')][2]"));
	            System.out.println("Price of " + productName + ": " + totalAmountElement.getText());
	            break;
	        }
		}
	}
	
	public String nameOfTheProduct()
	{
		return actProduct.getText();
	}
	
	public void clickOnAddToCart()
	{
		addToCartButton.click();
	}
	
	/*public void clickmainOnAddTocart()
	{
		mainAddToCart.click();
	}*/
	
	public void clickOnshopingcartLink()
	{
		shopingCart.click();
	}
	
	public void EstimateTaxLink()
	{
		EstimateTax.click();
	}
	
	public void SelctContry()
	{
		
		
		Select sel=new Select(SelcContry);
		
		sel.selectByVisibleText("Germany");
		
	}
	
	public void Selctstate()
	{
		
		
		Select sel=new Select(SelcState);
		
		sel.selectByVisibleText("Hessen");
		
	}
	
	public void enterPincode()
	{
		Pincode.sendKeys("547896");
	}

	public void clikchekoutButton()
	{
		chekoutButton.click();
	}
}
