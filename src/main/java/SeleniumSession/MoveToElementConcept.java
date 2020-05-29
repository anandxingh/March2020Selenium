package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		//http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146
		
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.className("menulink"));
		Actions action = new Actions(driver);
//		WebElement courses= driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a"));
		action.moveToElement(element).build().perform();
		Thread.sleep(4000);
		WebElement course = driver.findElement(By.linkText("COURSES"));
		course.click();
		
		
		
		
	}

}
