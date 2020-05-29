package TestNGSession;

import org.testng.annotations.Test;

public class DesableTest {

	
	
	@Test
	public void test1() {
		System.out.println("test1......");
	}
	
	@Test(enabled=false)//these are attributes/properties of the Test annotation
	public void test2() {
		System.out.println("test2......");
	}
	
	@Test(enabled=true)
	public void test3() {
		System.out.println("test3......");
	}
	
	@Test
	public void test4() {
		System.out.println("test4......");
	}
	
	@Test
	public void test5() {
		System.out.println("test5.......");
	}
}
