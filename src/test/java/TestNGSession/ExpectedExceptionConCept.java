package TestNGSession;

import org.testng.annotations.Test;

public class ExpectedExceptionConCept {

	
	
//	@Test(expectedExceptions = ArithmeticException.class)
//	public void divTest() {
//		
//		int a = 9/0;
//		System.out.println(a);
//	}
	
//	@Test(expectedExceptions = Exception.class)
//	public void divTest() {
//		
//		int a = 9/0;
//		System.out.println(a);
//	}
	
	@Test(expectedExceptions = Throwable.class)
	public void divTest() {
		
		int a = 9/0;
		//no code will be executed after this
		System.out.println(a);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
		System.out.println(10);
	}
	
	@Test(expectedExceptions = NullPointerException.class)//this test will fail because the exception raised is ArithmeticException
	public void divTest1() {
		
		int a = 9/0;
		System.out.println(a);
	}
}
