package Java.Selenium_JavaFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Java.Selenium_JavaFramework.utilities.BaseUI;

public class LandingPage extends BaseUI {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private static final String userEmailid= "userEmail";
	@FindBy(id=userEmailid)
	protected WebElement username;
	
	private static final String userPasswordid= "userPassword";
	@FindBy(id=userPasswordid)
	protected WebElement Password;
	
	private static final String logingbtnid= "login";
	@FindBy(id=logingbtnid)
	protected WebElement loginBtn;
	
	private static final String errorMessagecss="[role='alert']";
	@FindBy(css=errorMessagecss)
	protected WebElement errorMessagealert;
}
