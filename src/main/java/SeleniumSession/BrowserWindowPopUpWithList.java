package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpWithList {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		
		driver.get("http://popuptest.com/goodpopups.html");
		
//		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> handles = driver.getWindowHandles();
		
		List<String> handlesList = new ArrayList<String>(handles);
		
		System.out.println(handlesList.size());
	
//		for(int i=0; i<handlesList.size();i++) {
			
			String parentWindowId = handlesList.get(0);
			String childWindowId = handlesList.get(1);
			
			System.out.println(parentWindowId);
			System.out.println(childWindowId);
			Thread.sleep(3000);
			driver.switchTo().window(childWindowId);
			System.out.println("child window popup title: "+ driver.getTitle());
			System.out.println("child window popup url: "+ driver.getCurrentUrl());
			driver.close();
			Thread.sleep(3000);
			driver.switchTo().window(parentWindowId);
			System.out.println("parent window popup title: "+ driver.getTitle());
			System.out.println("parent window popup url: "+ driver.getCurrentUrl());
			driver.close();
//		}
		
		
		
	}

}
