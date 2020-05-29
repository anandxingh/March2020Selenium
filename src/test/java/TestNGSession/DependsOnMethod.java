package TestNGSession;

import org.testng.annotations.Test;

public class DependsOnMethod {

	
	@Test
	public void loginTest() {
		System.out.println("login.....");
//		int a=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest", priority=2)
	public void homePageTest() {
		System.out.println("homePageTest.....");
		
	}
	
	@Test(dependsOnMethods = "loginTest", priority=1)
	public void searchPageTest() {
		System.out.println("searchPageTest.....");
		
	}
}
