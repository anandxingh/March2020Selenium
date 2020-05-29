package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_WebElements {

	public static void main(String[] args) {


		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		By userName = By.cssSelector("input.form-control.private-form__control.login-email");
		By password = By.cssSelector("input#password");
		By loginButton = By.xpath("//i18n-string[text()='Log in']");
		
//		WebDriverWait wait = new WebDriverWait(driver,6);
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(userName)).sendKeys("anand@gmail.com");
////		driver.findElement(userName).sendKeys("anand@gmail.com");
//		//waiting for presence of element located by: By.cssSelector: input.form-control.private-form__control.login-email (tried for 2 second(s) with 500 milliseconds interval)
//		
//		driver.findElement(password).sendKeys("Test@123");
//		
//		wait = new WebDriverWait(driver,3);
//		wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
//		driver.findElement(loginButton).click();
		
		waitForElementPresence(driver, 6, userName).sendKeys("anand@gmail.com");
		driver.findElement(password).sendKeys("Test@123");
		waitForElementPresence(driver, 3, loginButton).click();
		
	}
	
	public static WebElement waitForElementPresence(WebDriver driver, int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		
		
	}
	

}
