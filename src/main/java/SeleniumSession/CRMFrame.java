package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMFrame {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://classic.freecrm.com/");
		WebElement email = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		email.sendKeys("batchautomation");
		password.sendKeys("Test@12345");
		Thread.sleep(5000);
		driver.findElement(By.className("btn-small")).click();
		
		driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
		WebElement contacts= driver.findElement(By.linkText("Contacts"));
		Thread.sleep(4000);
		contacts.click();
		
	}

}
