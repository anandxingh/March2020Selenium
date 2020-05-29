package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpWaitWithTitle {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		System.out.println(driver.getTitle());
		
		// implicit wait is applicable on web elements
		// implicit wait is also known as Global wait, as it will be  applicable for all the web elements by default 
		// Implicit wait is not applicable for title
		
		
	}

}
