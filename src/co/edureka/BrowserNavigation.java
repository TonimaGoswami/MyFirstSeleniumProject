package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
static WebDriver driver;
	
	
	public  void login(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://store.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void navigateTo() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back(); // Expected to go back to demoqa website
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

	public static void main(String[] args) throws InterruptedException {
		BrowserNavigation navi = new BrowserNavigation();
		navi.login();
		navi.navigateTo();
	}

}
