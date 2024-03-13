package Java.Selenium_JavaFramework.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {

	private static WebDriver driver;

	private WebDriverFactory() {
		// Private constructor to prevent instantiation
	}

	public static WebDriver initializeDriver() throws IOException {

		if (driver == null) {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("./globalProperties.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");

			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		}

		return driver;
	}
	
	public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
