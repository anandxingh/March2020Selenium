package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> itr = windowHandles.iterator();
		
		if(itr.hasNext()) {
			String parentWindowID = itr.next();
			System.out.println("parent window Id: "+ parentWindowID);
			
			String childWindowID = itr.next();
			System.out.println("child window Id: "+childWindowID );
			
			String title = driver.switchTo().window(childWindowID).getTitle();
			System.out.println("child window title: "+title);
			driver.close();
			Thread.sleep(5000);
//			driver.switchTo().defaultContent().close();
			driver.switchTo().window(parentWindowID);
			System.out.println("parent window title: "+driver.getTitle());
			driver.close();
			
			
			
		}
		
		
	}

}
