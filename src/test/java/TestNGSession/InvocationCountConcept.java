package TestNGSession;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	
	
	
	@Test(invocationCount=5)// to generate load on system, used in api testing
	public void googleTip() {
		System.out.println("google test");
	}
	
	
	
}
