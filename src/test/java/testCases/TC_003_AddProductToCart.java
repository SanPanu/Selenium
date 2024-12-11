package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObjects.MainSelectionTabPage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class TC_003_AddProductToCart extends BaseClass
{
	@Test
	public void addAPurticularProductToCart() throws InterruptedException 
	{
		MainSelectionTabPage mt =new MainSelectionTabPage(driver);
		
		ProductPage pp=new ProductPage(driver);
		
		//mt.SelectComponents();
		
		mt.ClickTablets();
		
		String actualName = pp.nameOfTheProduct();
		assertEquals(actualName, "Samsung Galaxy Tab 10.1");
		pp.clickOnAddToCart();
		pp.Getnames("Samsung Galaxy Tab 10.1");
		pp.clickOnshopingcartLink();
		pp.EstimateTaxLink();
		pp.SelctContry();
		pp.Selctstate();
		pp.enterPincode();
		pp.clikchekoutButton();

	}
	
}
