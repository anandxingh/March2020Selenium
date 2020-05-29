package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("justAnInputBox")).click();
//		List<WebElement> choiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
	
		By locator = By.cssSelector("span.comboTreeItemTitle");
		
//		for(int i=0; i< choiceList.size(); i++) {
//			String text = choiceList.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equals("choice 6 1")) {
//			choiceList.get(i).click();
//			break;
//			}
//			
//			
//		}
		
		// 1. single value selection:
		// 2. multiple value selection:
		// 3. select all values:

//		doSelectChhoiceValue(driver, locator, "choice 3","choice 6 2","choice 6 2 3");
		doSelectChhoiceValue(driver, locator, "choice 1");
		
//		doSelectChhoiceValue(driver, locator, "All");
	}
	
	public static void doSelectChhoiceValue(WebDriver driver, By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		
		if(!value[0].equalsIgnoreCase("All")){
		for(int i=0; i< choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			
			for(int k=0; k<value.length; k++) {
			System.out.println("vaklue of k: :"+value[k]);
				if(text.equals(value[k])) {
			choiceList.get(i).click();
			break;
			}
			
			}
			break;
			}
			
			
		}
		
		//select all choice
		else {
			try {
			for(int all=0; all<choiceList.size(); all++) {
				choiceList.get(all).click();
			}
			}
			catch(Exception e) {
//				System.out.println(e);
			}
		}
		
	}

}
