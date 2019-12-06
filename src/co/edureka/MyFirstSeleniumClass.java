package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumClass {
	static WebDriver driver;
	
	public static void login(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");      //invoke a browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 driver.quit();
	
	}
	public static void createUser(){
		driver.findElement(By.id("email")).sendKeys("Tonima");
		driver.findElement(By.name("lastname")).sendKeys("Goswami");
		
	}
	public static void main(String[] args) {
		login();
		createUser();
	}
}