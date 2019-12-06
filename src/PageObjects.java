import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjects {
	
	WebDriver driver;
	By HelloSign = By.xpath(".//*[@id='nav-logobar-greeting']/span[1]]");
	By UserName = By.id("ap_email");
	By Password = By.id("ap_password");
	By SignInButton = By.id("signInSubmit");

public void setup(){
	driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
}
public void login(){
	
	driver.findElement(HelloSign).click();
	driver.findElement(UserName).sendKeys("tonimagoswami@gmail.com");
	driver.findElement(Password).sendKeys("123@India");
	driver.findElement(SignInButton).click();
	
	
	
}

}
