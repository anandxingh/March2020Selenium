package SeleniumSession;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {


		//1. get total links count
		//2. print the text of each link
		//3. print the href prop of each link
		
	    WebDriverManager.chromedriver().setup();
	    
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
		
//		co.addArguments("--incognito");
//		co.addArguments("-----");
		
		
	    WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.freshworks.com/");
//		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksList =  driver.findElements(By.tagName("a"));
		
		System.out.println("totallinks: "+ linksList.size());
		
		for(int i=0; i<= linksList.size(); i++) {
			String text = linksList.get(i).getText();
			System.out.println(i +"--->" + text);
		}
		
	}

}
