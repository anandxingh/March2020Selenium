package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {


		//user actions:
		//drag and drop
		//right click
		//move to element/
		//click and sendkeys
		//double click
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		//http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146
	
		By sourcelocator = By.id("draggable");
		By targetlocator = By.id("droppable");
		WebElement sourceEle = driver.findElement(sourcelocator);
		WebElement targetEle = driver.findElement(targetlocator);
		
		Actions action = new Actions(driver);
		
//		action.dragAndDrop(sourceEle, targetEle).build().perform();
		
		action.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
	
		//1 action: build.perform
				//1 action : perform
				
				//multiple actions : no --wont work
				//multiple actions : yes --build.perform or .perform
		
	}

}
