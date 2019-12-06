package TestNG;

import org.testng.annotations.Test;

import com.google.common.base.Function;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestNGSample {
	static WebDriver driver;
  @Test
  
  public void ExplicitWait(){
		driver.findElement(By.xpath(".//*[@id='account']/a/span[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement UserName =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("log")));
		UserName.sendKeys("sanket");
		WebElement Password = wait.until(ExpectedConditions.elementToBeClickable(By.id("pwd")));
		Password.sendKeys("sanket@12345");
		WebElement Login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		Login.click();
	}
  @Test
	public void fluentWait(){
	  driver.findElement(By.xpath(".//*[@id='account']/a/span[1]")).click();
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS).pollingEvery(200, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement UserLogin = fluentWait.until(new Function<WebDriver , WebElement>(){
			public WebElement apply(WebDriver driver){
				return driver.findElement(By.id("login"));
			
		
			}	
		});
	}
  @BeforeMethod
  public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://www.store.demoqa.com/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
		}
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
