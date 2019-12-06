package TestNG;

import org.testng.annotations.*;

public class TestAnnotations {
	@Test
	public void test1(){
		System.out.println("Inside test1");
		
	}
	@Test
	public void test2(){
		System.out.println("Inside test2");
	}
	@Test
	public void test3(){
		System.out.println("Inside test3");
	}
	@BeforeMethod
	public void beforeEveryMethod(){
		System.out.println("Before every test method");
	}
	@AfterMethod
	public void afterEveryMethod(){
		System.out.println("Before every test method");
	}
	
		
	@BeforeTest
	public void beforeAnyTest(){
		System.out.println("Before any test method is run");
		
	}
	@AfterTest
	public void afterAllTheTests(){
		System.out.println("After all test methods have run");
	}
	
//	@BeforeClass
//	public void beforeEveryClass(){
//		
//	}
//	@AfterClass
//	public void afterAllClass(){
		
	}
	
		
















