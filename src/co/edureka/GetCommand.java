package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {
static WebDriver driver;
	
	
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public static void getText(){
		String pageTitle = driver.getTitle();
		System.out.println("The page title is : " + pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println("The page Url is : " + pageUrl);
		
		String pageSourceCode = driver.getPageSource();
		System.out.println("The  source code is : " + pageSourceCode);
		
		
		String pageText = driver.findElement(By.xpath("//h2[@class='inlineBlock _3ma _6n _6s _6v']")).getText();
		System.out.println("The text on page is : " + pageText);
		
		
	}

	public static void main(String[] args) {
		setUp();
		getText();
		

	}

}
