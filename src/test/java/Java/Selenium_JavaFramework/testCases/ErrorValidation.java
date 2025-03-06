package Java.Selenium_JavaFramework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Java.Selenium_JavaFramework.testComponent.BaseTest;

public class ErrorValidation extends BaseTest{

	String productName="ZARA COAT 3";
	String url="https://rahulshettyacademy.com/client";
	
	@Test
	public void addProductToCart() {
		landingPage.openApplication(url);
		landingPage.logIn("mukulsharma@testmail.com", "Qait@12348");
		Assert.assertEquals("Incorrect email or password.", landingPage.getErrorMessage());
		
		
	}
	
}
