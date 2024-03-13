package Java.Selenium_JavaFramework.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Java.Selenium_JavaFramework.utilities.BaseUI;

public class MyCartPage extends BaseUI {

	WebDriver driver;

	public MyCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private static final String myCartProductcss=".cartSection h3";
	@FindBy(css=myCartProductcss)
	protected List<WebElement> myCartProductList;
	
	
}
