package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextArea {
	static WebDriver driver;
	
	
	public  void login(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void clearText() throws InterruptedException{
		WebElement msgBox = driver.findElement(By.name("message"));
		msgBox.sendKeys("This is the first text");
		Thread.sleep(3000);
		msgBox.clear();
		Thread.sleep(3000);
		msgBox.sendKeys("This is the second text");
	
	}
	public static void main(String[]args) throws InterruptedException{
		ClearTextArea cleararea = new ClearTextArea();
		cleararea.login();
		cleararea.clearText();
	}
}
