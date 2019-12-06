package co.edureka;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class JunitTest {
	WebDriver driver;

	@Before
	public void setup(){
			System.out.println("This is before test");
		}
	
	
	
	
	@Test
	public void test1(){
		System.out.println("This is test1");
	}
	
	@Test
	public void test2(){
		System.out.println("This is test2");
	}
	
	
	@After
public void teardown(){
		System.out.println("This is after test");
	}
	
	
	
	
	
	
}
