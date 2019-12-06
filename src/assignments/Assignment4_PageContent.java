package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_PageContent {
       WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void fetchPageContent(){
		String pageContent = driver.findElement(By.tagName("body")).getText();
		System.out.println(pageContent);
		driver.close();
	}

	public static void main(String[] args) {
		
		Assignment4_PageContent	content = new Assignment4_PageContent();
		content.setUp();
		content.fetchPageContent();
		

	}

}
