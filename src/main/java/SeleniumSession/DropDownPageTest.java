package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPageTest {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		By locator = By.id("dropdown");
		ElementUtil eu1 = new ElementUtil(driver);
		
		eu1.doSelectByVisibleText(locator, "Option 2");
		
		eu1.doSelectByValue(locator, "1");
		
		eu1.doSelectByIndex(locator, 2);
		
	}

}
