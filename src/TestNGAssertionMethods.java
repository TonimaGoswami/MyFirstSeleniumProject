import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGAssertionMethods {
	WebDriver driver;
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public String PageTitle(){
		return driver.getTitle();
		
	}
	public int Sum(int a, int b){
		int sum = a + b;
		return sum;
	}
	public boolean StateTrue(){
		return true;
	}
	
	public Object StateNull(){
		return null;
	}

}
