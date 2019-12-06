package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectExample {
static WebDriver driver;
	
	
	public  void login(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void selectOption(){
	Select day = new Select(driver.findElement(By.name("birthday_day")));
	day.selectByVisibleText("29");
	
	Select month = new Select(driver.findElement(By.name("birthday_month")));
	day.selectByIndex(2);
	
	
	Select year = new Select(driver.findElement(By.name("birthday_year")));
	day.selectByValue("1988");
	
	}
	public static void main(String[] args) {
		FacebookSelectExample MyObj = new FacebookSelectExample();
		MyObj.login();
		MyObj.selectOption();
		

	}
	

}
