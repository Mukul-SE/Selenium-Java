package Java.Selenium_JavaFramework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Java.Selenium_JavaFramework.testComponent.BaseTest;

public class StandAloneTest extends BaseTest{

	String productName="ZARA COAT 3";
	String url="https://rahulshettyacademy.com/client";
	
	@Test
	public void addProductToCart() {
		landingPage.openApplication(url);
		landingPage.logIn("mukulsharma@testmail.com", "Qait@123456");
		dashboardPage.clickOnAddToCartForProductName(productName);
		dashboardPage.clickOnCartButton();		
		Boolean match= myCartPage.checkProductAddedToCart(productName);
		Assert.assertTrue(match);
		
	}
	
}
