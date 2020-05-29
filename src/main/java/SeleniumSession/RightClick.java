package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.className("context-menu-one"));
		
//		WebElement rightClickMe = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		Actions action = new Actions(driver);
		 action.contextClick(rightClick).build().perform();
		 
		List<WebElement> rightClickOptionsList = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));
		
		System.out.println(rightClickOptionsList.size());
		
		for(int i=0; i<rightClickOptionsList.size(); i++) {
			String text = rightClickOptionsList.get(i).getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				rightClickOptionsList.get(i).click();
				break;
				
			}
			
		}
		
		
	}

}
