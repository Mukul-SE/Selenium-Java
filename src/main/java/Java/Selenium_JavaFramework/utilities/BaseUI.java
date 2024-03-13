package Java.Selenium_JavaFramework.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUI {
	WebDriver driver;
	WebDriverWait wait;
	
	public BaseUI(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void waitForElementToAppear(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForAllElementToAppear(List<WebElement> element) {
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	
	
	public void waitForElementToDisappear(WebElement element) {
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	
	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void openApplication(String url) {
		driver.get(url);
	}
}
