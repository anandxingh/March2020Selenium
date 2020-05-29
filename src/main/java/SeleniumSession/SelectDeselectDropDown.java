package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDeselectDropDown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(5000);
		
		WebElement choisedd = driver.findElement(By.id("justAnInputBox1"));
		choisedd.click();
		
		By locator = By.cssSelector("span.comboTreeItemTitle");
		
		List<WebElement> choiceList = driver.findElements(locator);
		
		for(int i=0; i<choiceList.size() ; i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);
			
			
			if(text.equals("choice 2")) {
				choiceList.get(i).click();
				Thread.sleep(3000);
				choiceList.get(i).click();
				break;
			}
			
			
			
//			choisedd.click();
//			if(choiceList.get(i).isSelected()) {
//			
//				choiceList.get(i).click();
//				System.out.println("choice deselected");
//				
//			}
			
			
		}
		
		
	}

}
