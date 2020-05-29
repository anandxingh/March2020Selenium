package SeleniumSession;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserUtil {

	WebDriver driver;
	
	public WebDriver init_driver(String browserName) {
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver= new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
//			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;
			
			default:System.out.println("browser is not found ");
			break;
		}
		return driver;
		
	}
	public void launchUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	public void navigateToUrl(String url) {
		driver.navigate().to(url);
	}
	
	public String doGetTitle() {
		return driver.getTitle();
	}
	
//	public void doQuitBrowser() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.quit();
//	}
}
