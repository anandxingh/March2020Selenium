package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImage {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		List<WebElement> image = driver.findElements(By.tagName("img"));
		
		System.out.println("image count: "+ image.size());
		
		for(int i=0; i<=image.size()-1 ; i++) {
			System.out.println(i+" "+ image.get(i));
		}
		
	}

}
