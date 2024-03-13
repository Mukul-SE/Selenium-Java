package Java.Selenium_JavaFramework.PageObject;

import java.util.List;

import org.bouncycastle.asn1.cmp.ProtectedPart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import Java.Selenium_JavaFramework.utilities.BaseUI;

public class DasboardPage extends BaseUI {

	WebDriver driver;

	public DasboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".mb-3")
	protected List<WebElement> products;
	
	private static final String productTextcss= "b";
	@FindBy(css=productTextcss)
	protected WebElement productText;
	
	private static final String addtocartbtncss= ".card-body button:last-of-type";
	@FindBy(css=addtocartbtncss)
	protected WebElement addToCartButton;
	
	private static final String toastMessagecss= "#toast-container";
	@FindBy(css=toastMessagecss)
	protected WebElement toastMessageele;
	
	private static final String loadercss= ".ng-animating";
	@FindBy(css=loadercss)
	protected WebElement loaderele;
	
	private static final String cartLinkcss= "[routerlink='/dashboard/cart']";
	@FindBy(css=cartLinkcss)
	protected WebElement cartpagebutton;
	
	public WebElement productText(WebElement product) {
		return product.findElement(By.cssSelector(productTextcss));
	}
	
	public WebElement productAddToCart(WebElement productCart) {
		return productCart.findElement(By.cssSelector(addtocartbtncss));
	}
	
	
	
}
