package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dummy1 {

	@BeforeSuite
	public void test1() {
		
		System.out.println("Test1");
	}
	@AfterSuite
	public void test2() {
		System.out.println("Test2");
		
	}
	@BeforeClass
	public void test3() {
		System.out.println("Test3");
	}
	@AfterClass
	public void test4() {
		System.out.println("Test4");
	}
	@BeforeMethod
	public void test5() {
		System.out.println("Test5");
	}
	@AfterMethod
	public void test6() {
		System.out.println("Test6");
	}

	@Test()
	public void test9() {
		System.out.println("Test9");
	}
	
	@Test(priority=1)
	public void test10()
	{
		System.out.println("Test10");
	}
	

	
	@BeforeTest
	public void test7() {
		System.out.println("Test7");
	}
	
	@AfterTest
	public void test8() {
		System.out.println("Test8");
	}
	
	
	
	
}

