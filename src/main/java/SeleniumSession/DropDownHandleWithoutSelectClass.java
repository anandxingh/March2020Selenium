package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	public static void main(String[] args) {

		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		
		String date = "18-Aug-1987";
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		By daysOptions = By.xpath("//select[@id='day']/option");
		By monthsOptions = By.xpath("//select[@id='month']/option");
		By yearsOptions = By.xpath("//select[@id='year']/option");
		
//		List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='day']/option"));
//		for(int i=0; i<optionsList.size(); i++) {
//			String text = optionsList.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equals("25")) {
//				optionsList.get(i).click();
//				break;
//			}
//		
//		
//		
//		}
	
//	doSlectDropDownWithoutSelectClass(driver, "//select[@id='day']/option", date.split("-")[0]);
//	doSlectDropDownWithoutSelectClass(driver, "//select[@id='month']/option", date.split("-")[1]);
//	doSlectDropDownWithoutSelectClass(driver, "//select[@id='year']/option", date.split("-")[2]);
	
		
		ElementUtil eu5 = new ElementUtil(driver);
		
		eu5.doSlectDropDownWithoutSelectClass(daysOptions, "25");
		eu5.doSlectDropDownWithoutSelectClass(monthsOptions, "Jul");
		eu5.doSlectDropDownWithoutSelectClass(yearsOptions, "1999");
	
	}
	
	
//		public static void doSlectDropDownWithoutSelectClass(WebDriver driver, String xPathValue, String value) {
//		List<WebElement> optionsList = driver.findElements(By.xpath(xPathValue));
//		for(int i=0; i<optionsList.size(); i++) {
//			String text = optionsList.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equals(value)) {
//				optionsList.get(i).click();
//				break;
//			}
//		}
//		}

}
