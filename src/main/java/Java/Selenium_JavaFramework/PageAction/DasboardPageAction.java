package Java.Selenium_JavaFramework.PageAction;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Java.Selenium_JavaFramework.PageObject.DasboardPage;

public class DasboardPageAction extends DasboardPage{
	WebDriver driver;

	public DasboardPageAction(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public List<WebElement> getAllProducts(){
		waitForAllElementToAppear(products);
		return products;
		
	}
	
	public WebElement addProductByName(String productName) {
		WebElement prod = 	getAllProducts().stream().filter(product->
		productText(product).getText().equals(productName)).findFirst().orElse(null);
		return prod;
//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}
	
	public void clickOnAddToCartForProductName(String productName) {
		productAddToCart(addProductByName(productName)).click();
		waitForElementToAppear(toastMessageele);
		waitForElementToDisappear(loaderele);
	}
	
	public void clickOnCartButton() {
		waitForElementToBeClickable(cartpagebutton);
		cartpagebutton.click();
	}

}
