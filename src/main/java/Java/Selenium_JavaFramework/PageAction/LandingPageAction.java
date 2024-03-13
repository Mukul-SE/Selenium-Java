package Java.Selenium_JavaFramework.PageAction;

import org.openqa.selenium.WebDriver;

import Java.Selenium_JavaFramework.PageObject.LandingPage;

public class LandingPageAction extends LandingPage{
	WebDriver driver;

	public LandingPageAction(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	public void logIn(String userName, String password) {
		username.sendKeys(userName);
		Password.sendKeys(password);
		loginBtn.click();
	}
	
	public String getErrorMessage() {
		waitForElementToAppear(errorMessagealert);
		return errorMessagealert.getText().trim();
	}

}
