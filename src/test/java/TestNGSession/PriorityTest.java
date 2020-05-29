package TestNGSession;

import org.testng.annotations.Test;

public class PriorityTest {

	//if the priority is not defined than the execution order is based on alphabetic sequence 
	//my observation by default the priority is 0, if it is not declared--- if the priority is defined(<0) for few and 
	//--no priority for the rest. then the execution order will start with non priority based test cases than alphabet then priority base..
	
	@Test(priority =0)
	public void test1() {
		System.out.println("test 1......");
	}
	
	@Test(priority =0)
	public void test2() {
		System.out.println("test 2......");
	}
	
	@Test
	public void test3() {
		System.out.println("test 3......");
	}
	
	@Test
	public void test4() {
		System.out.println("test 4......");
	}
	
	@Test
	public void test5() {
		System.out.println("test 5......");
	}
}
