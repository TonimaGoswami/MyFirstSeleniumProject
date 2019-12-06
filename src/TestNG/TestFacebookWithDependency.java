package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFacebookWithDependency {
	WebDriver driver;

	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

	}

	@Test(dependsOnMethods = { "openBrowser" })
	public void loginToFacebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("tonimagoswami@gmail.com");
		driver.findElement(By.cssSelector("input#pass.inputtext")).sendKeys("Victoria2017");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
