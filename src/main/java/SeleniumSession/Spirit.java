package SeleniumSession;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spirit {

	public static void main(String[] args) throws InterruptedException {


		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spirit.com/");
		Thread.sleep(5000);
		By fromlist = By.xpath("//div[@class='d-flex flex-column flex-wrap ng-star-inserted']//div/button");
		 driver.findElement(By.xpath("//label[@for='flight-DestinationStationCode']//i[@class='icon-chevron-down ng-star-inserted']")).click();
		List<WebElement>  airportList = driver.findElements(fromlist);
		 //List<String> list = airportList.stream().map(WebElement::getText).collect(Collectors.toList());
		System.out.println(airportList.size());
		
		for(int i=0; i<airportList.size();i++) {
//			airportList.get(0).click();
			String airportName = airportList.get(0).getText();
			System.out.println("Airport name: "+airportName);
			break;
		}
	}

}
