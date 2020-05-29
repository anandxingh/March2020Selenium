package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacbookXpath {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		By fbLogo = By.xpath("//h1/a/i[@class = 'fb_logo img sp_vn-K2Ul6-5M sx_c299f6']");
		By PageCategories = By.xpath("//div[@id='pageFooterChildren' and @role='contentinfo']/ul//li/a[contains(text(),'Page categories')]");
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(fbLogo);
		element.click();
//		System.out.println(element.getText());
		
		driver.findElement(By.xpath("//a[contains(text(),'हिन्दी')]")).click();
		System.out.println(driver.getTitle());
		
//		driver.findElement(PageCategories).click();
		
		
		
		
		
	}

}
