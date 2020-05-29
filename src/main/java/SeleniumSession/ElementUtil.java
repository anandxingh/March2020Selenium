package SeleniumSession;


import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver= driver;
	}
	
	public List<WebElement> getElements(By locator) {
		List<WebElement> elements=driver.findElements(locator);
		return elements;

	}
	
	public WebElement getElement(By locator) {
		WebElement element= null;
		
		try {
			System.out.println("locator is: "+ locator);
			element= driver.findElement(locator);
		
		}
		catch(Exception e) {
			System.out.println("Some exception has occured: "+ locator);
		}
		
		return element;
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	
	 //**************************Actions Class Utils***********************
	
	public  void doSelectByVisibleText(By locator, String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}

	public  void doSelectByValue(By locator, String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	public  void doSelectByIndex(By locator, int value) {
	
	Select select = new Select(getElement(locator));
	select.selectByIndex(value);
}
	
	
	public int doDropDownOptionsCount(By locator) {
		return doGetDropDownOptions(locator).size();
	}
	

	public ArrayList<String> doGetDropDownOptions(By locator) {
		ArrayList<String> ar = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		
		for(int i=0 ; i<optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			ar.add(text);
	}
		return ar;
	
		
	}
	
public void doSelectDropDownValue( By locator, String value) {
		Select selectDays = new Select(getElement(locator));
		List<WebElement> days = selectDays.getOptions();
		for(int i=0 ; i<days.size(); i++) {
		String text = days.get(i).getText();
		
		if(text.equals(value)) {
			days.get(i).click();
			break;
	}
		}
	}

		public void doSlectDropDownWithoutSelectClass(By locator,String value) {
			List<WebElement> optionsList = getElements(locator);
			for(int i=0; i<optionsList.size(); i++) {
				String text = optionsList.get(i).getText();
				System.out.println(text);
		
		if(text.equals(value)) {
			optionsList.get(i).click();
			break;
		}
	}
	}
		public void doSelectChhoiceValue(By locator, String... value) {
//			List<WebElement> choiceList = driver.findElements(locator);
			List<WebElement> choiceList = getElements(locator);
			
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
				
		}
				
				
	}
			
		// select all choice
		else {
			try {
				for (int all = 0; all < choiceList.size(); all++) {
					choiceList.get(all).click();
				}
			} catch (Exception e) {
				//
			}
		}

	}
		
    //**************************Actions Class Utils***********************	
	
	public void doDragAndDrop(By source, By target) {
		
		Actions action = new Actions(driver);
		WebElement sourceEle = getElement(source);
		WebElement targetEle = getElement(target);
		action.dragAndDrop(sourceEle, targetEle).build().perform();
		
		
	}
	
	public void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}
	
	// ***************************** Wait Utils *******************************************
	
	
	public WebElement waitForElementPresence(By locator, int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		
		
	}
	
	public List<WebElement> visibilityOfElements(By locator, int timeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		List<WebElement> footerLinksList =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		return footerLinksList;
	}
	
	public WebElement waitforelementToBeVisible(By locator, int timeUnit) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public WebElement waitForElementToBeClickable(By locator, int timeUnit) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
	}
	
	public void waitForUrl(String url, int timeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		wait.until(ExpectedConditions.urlContains(url));
	}
	
	public Alert waitForAlertToBeVisible(By locator , int timeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
	
	// clickWhenReady:
		public void clickWhenReady(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
		}

		public String waitForTitleToBePresent(String title, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.titleContains(title));
			return driver.getTitle();
		}
	
	
	
	
}
