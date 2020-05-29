package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frame/index.html");
		
		int frems = driver.findElements(By.tagName("frame")).size();
		System.out.println("total number of frames: "+ frems);
		driver.switchTo().frame("main");//frame with name
		
		///http://classic.freecrm.com/
		
		
//		driver.switchTo().frame(2);//frame with index
//		
//		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
//		driver.switchTo().defaultContent();
		
		
	}

}
