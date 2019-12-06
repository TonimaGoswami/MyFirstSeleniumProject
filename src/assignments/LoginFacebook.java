package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {
	static WebDriver driver;
	
	
	public static void pageLoad(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public static void loginTest(){
		try {
			driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("tonimagoswami@gmail.com");
			driver.findElement(By.cssSelector("input#pass.inputtext")).sendKeys("Victoria2017");
			driver.findElement(By.cssSelector("input[value='Log In']")).click();
			driver.navigate().refresh();
			driver.navigate().back();
			driver.navigate().forward();
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		pageLoad();
		loginTest();

	}

}
