package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElementsExplicitWait {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		By locator = By.xpath("//div/ul[@class='footer-nav']//li");
		
//		WebDriverWait wait = new WebDriverWait(driver, 6);
//		
//		List<WebElement> linksList =   wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(locator)));
//		
//		System.out.println(linksList.size());
//		
//		for(int i=0 ; i<linksList.size(); i++) {
//			System.out.println(linksList.get(i).getText());
//		}
		
//		visibilityOfElements(driver, locator, 6);
		
		ElementUtil eu6 = new ElementUtil(driver);
		List<WebElement> footerLinksList = eu6.visibilityOfElements(locator, 6);
		System.out.println(footerLinksList.size());
		
		for(int i=0 ; i<footerLinksList.size(); i++) {
			System.out.println(footerLinksList.get(i).getText());
		}
		
	}

	
//		public static void visibilityOfElements(WebDriver driver, By locator, int timeUnit) {
//			WebDriverWait wait = new WebDriverWait(driver, timeUnit);
////			List<WebElement> footerLinksList =  wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(locator)));
//			List<WebElement> footerLinksList =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//			System.out.println(footerLinksList.size());
//			
//			for(int i=0 ; i<footerLinksList.size(); i++) {
//				System.out.println(footerLinksList.get(i).getText());
//		}
//		}
	
	
}
