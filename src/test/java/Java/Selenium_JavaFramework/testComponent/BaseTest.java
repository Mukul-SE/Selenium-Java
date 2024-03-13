package Java.Selenium_JavaFramework.testComponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Java.Selenium_JavaFramework.PageAction.DasboardPageAction;
import Java.Selenium_JavaFramework.PageAction.LandingPageAction;
import Java.Selenium_JavaFramework.PageAction.MyCartPageAction;
import Java.Selenium_JavaFramework.utilities.WebDriverFactory;

public class BaseTest {

	public WebDriver driver;
	public LandingPageAction landingPage;
	public DasboardPageAction dashboardPage;
	public MyCartPageAction myCartPage;
	
	@BeforeClass
	public void launchApplication() throws Exception {
		_init();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	@AfterClass
	public void closeSession() {
		WebDriverFactory.quitDriver();
	}
	private void _init() throws Exception {
		driver=WebDriverFactory.initializeDriver();
		landingPage= new LandingPageAction(driver);
		dashboardPage= new DasboardPageAction(driver);
		myCartPage= new MyCartPageAction(driver);
		
	}

	

}
