package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropDown {

	public static void main(String[] args) {


		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
		
		String date = "18-Aug-1987";
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		
		ElementUtil eu3 = new ElementUtil(driver);
		
		ElementUtil eu4 = new ElementUtil(driver);
		eu4.doSelectDropDownValue(day, "19");
		eu4.doSelectDropDownValue(month, "Nov");
		eu4.doSelectDropDownValue(year, "1988");
		
		
		
//		eu3.doSelectByVisibleText(day, "2");
//		eu3.doSelectByVisibleText(month, "Mar");
//		eu3.doSelectByVisibleText(year, "1987");
		
//		eu3.doSelectByVisibleText(day, date.split("-")[0]);
//		eu3.doSelectByVisibleText(month, date.split("-")[1]);
//		eu3.doSelectByVisibleText(year, date.split("-")[2]);
		
//		Select selectDays = new Select(driver.findElement(day));
//		List<WebElement> days = selectDays.getOptions();
//		System.out.println(days.size());
//		
//		for(int i=0 ; i<days.size(); i++) {
//			String text = days.get(i).getText();
//		System.out.println(text);
//		
//		if(text.equals(15)) {
//			days.get(i).click();
//			break;
//		}
//		}
//		System.out.println("--------------");
//		Select selectMonths = new Select(driver.findElement(month));
//		List<WebElement> months= selectMonths.getOptions();
//		System.out.println(months.size());
//		
//		for(int j=0 ; j<months.size(); j++) {
//			String text = months.get(j).getText();
//		System.out.println(text);
//		}
//		System.out.println("--------------");
//		Select selectYears = new Select(driver.findElement(year));
//		List<WebElement> years = selectYears.getOptions();
//		System.out.println(years.size());
//		
//		for(int k=0 ; k<years.size(); k++) {
//			String text = years.get(k).getText();
//		System.out.println(text);
//		}
//		
//		ArrayList<String> days = doGetDropDownOptions(driver, day);
//		System.out.println(days.size());
//		System.out.println(days);
//		
//		ArrayList<String> months= doGetDropDownOptions(driver, month);
//		System.out.println(months.size());
//		System.out.println(months);
//		
//		ArrayList<String> years= doGetDropDownOptions(driver, year);
//		System.out.println(years.size());
//		System.out.println(years);
//		
//		System.out.println("total options in day list box : "+ doDropDownOptionsCount(driver, day));
//		doSelectDropDownValue(driver, day, "15");
//		doSelectDropDownValue(driver, month, "Mar");	
//		doSelectDropDownValue(driver, year, "1987");
	}
	
	public static void doSelectDropDownValue(WebDriver driver, By locator, String value) {
		
		Select selectDays = new Select(driver.findElement(locator));
		List<WebElement> days = selectDays.getOptions();
//		System.out.println(days.size());
		
		for(int i=0 ; i<days.size(); i++) {
			String text = days.get(i).getText();
//		System.out.println(text);
		
		if(text.equals(value)) {
			days.get(i).click();
			break;
	}
		}
	}
	
	public static int doDropDownOptionsCount(WebDriver driver, By locator) {
		return doGetDropDownOptions(driver, locator).size();
	}

	public static ArrayList<String> doGetDropDownOptions(WebDriver driver, By locator) {
		ArrayList<String> ar = new ArrayList<String>();
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();
//		System.out.println(optionsList.size());
		
		for(int i=0 ; i<optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			
			
			ar.add(text);
//		System.out.println(text);
	}
		return ar;
	
} 

}
