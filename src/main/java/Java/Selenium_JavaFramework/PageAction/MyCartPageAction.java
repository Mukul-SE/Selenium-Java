package Java.Selenium_JavaFramework.PageAction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Java.Selenium_JavaFramework.PageObject.MyCartPage;

public class MyCartPageAction extends MyCartPage{
	WebDriver driver;

	public MyCartPageAction(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public List<WebElement> getCartProductsList(){
		return myCartProductList ;
		
	}

	public Boolean checkProductAddedToCart(String productName) {
		List<WebElement> cartProducts= getCartProductsList();
		
		return cartProducts.stream().anyMatch(cartproduct-> cartproduct.getText().equals(productName));
	}
}
