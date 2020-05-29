package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	public static void main(String[] args) throws InterruptedException {


		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl(driver, "https://app.hubspot.com/");
//		br.navigateToUrl("http://www.google.com/");
		Thread.sleep(5000);
		String title = br.doGetTitle();
		System.out.println("title: "+ title );
		
//		
		
		By emailId= By.id("username");
		By password= By.id("password");
		By loginButton= By.id("loginBtn");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendKeys(emailId, "anand@gmail.com");
		eu.doSendKeys(password, "tet123");
		
		if (eu.doIsDisplayed(loginButton)){
			System.out.println("login button is displayed? : "+ eu.doIsDisplayed(loginButton));
			eu.doClick(loginButton);
		}
		
		
		
//		br.doQuitBrowser();
		System.out.println("browser is closed");
		
	}

}
