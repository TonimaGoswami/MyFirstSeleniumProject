package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void validate(){
		String URL = "http://jqueryui.com/droppable/";
		String pageTitle = driver.getTitle();
		
		if (pageTitle.equals("Droppable | jQuery UI"))
				System.out.println("Title Pass");
		else
			System.out.println("Title Fail");
		driver.findElement(By.linkText("Development")).click();
		String actualURL = driver.getCurrentUrl();
		
		if (URL.equals(actualURL))
			System.out.println("URL Pass");
		else
		System.out.println("URL Fail");
		
		
		
}

	public static void main(String[] args) {
		Validations valid = new Validations();
		valid.setUp();
		valid.validate();
	}

}
