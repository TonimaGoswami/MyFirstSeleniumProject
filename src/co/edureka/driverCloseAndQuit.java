package co.edureka;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverCloseAndQuit {
	static WebDriver driver;
	
	public static void login(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumframework.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
	}
	public static void closeAndQuit() throws InterruptedException{
		driver.findElement(By.id("button1")).click();
		Thread.sleep(5000);
		driver.close();

		
	}
	public static void main(String[] args) throws InterruptedException {
		login();
		closeAndQuit();
	}

}
