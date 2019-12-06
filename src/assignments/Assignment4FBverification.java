package assignments;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment4FBverification {
WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public  void setUp(String browser){
		
			if(browser.equals("Chrome")){
				driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
			}
			else if(browser.equals("Firefox")){
				System.setProperty("webdriver.gecko.driver", "/Users/tanu/Desktop/IMP-Doc/geckodriver");
				driver = new FirefoxDriver();
			}
			else if(browser.equals("Safari")){
				System.setProperty("webdriver.safari.driver", "/Users/tanu/Desktop/IMP-Doc/safaridriver");
				driver = new SafariDriver();
		}
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
		}
		@Test
		public void fetchPageTitle(){
			
			// Fetch pageTitle
			String expectedTitle = "Facebook - Log in or Sign Up";
			String actualTitle = driver.getTitle();
			AssertJUnit.assertEquals(actualTitle, expectedTitle);
			System.out.println("The title of this page is : " + actualTitle);
		}
		
		@Test
		public void fetchPageText1(){	
			// Fetch pageText1
			String expectedText = "Facebook helps you connect and share with the people in your life";
			String actualText = driver.findElement(By.xpath("//h2[@class='inlineBlock _3ma _6n _6s _6v']")).getText();
			AssertJUnit.assertEquals(actualText, expectedText);
			System.out.println("The text on this page is : " + actualText);
		}
		
		@Test
		public void fetchPageText2(){	
			//fetch pageText2
			String expectedText2 = "It's free and always will be.";
			String actualText2 = driver.findElement(By.xpath("//div[@class='mbl _3m9 _6o _6s _mf']")).getText();
			AssertJUnit.assertEquals(actualText2, expectedText2);
			System.out.println("The next text on this page is : " + actualText2);
			
		}
		
		@AfterTest
		
		public void closeBrowser(){
			driver.close();
		}
		
	

}	