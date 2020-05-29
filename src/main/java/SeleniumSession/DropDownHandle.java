package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {


//		/ Select class to handle the dropdowns if Select html tag is there
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		WebElement dropDown = driver.findElement(By.id("dropdown"));
		
		doSelectByVisibleText(dropDown, "Option 1");
		Thread.sleep(2000);
		doSelectByValue(dropDown, "2");
		Thread.sleep(3000);
		doSelectByIndex(dropDown, 1);
		
	}
	
	public static void doSelectByVisibleText(WebElement element, String value) {
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}

public static void doSelectByValue(WebElement element, String value) {
		
		Select select = new Select(element);
		select.selectByValue(value);
		
	}
public static void doSelectByIndex(WebElement element, int value) {
	
	Select select = new Select(element);
	select.selectByIndex(value);
}
}
