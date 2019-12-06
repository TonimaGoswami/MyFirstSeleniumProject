package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {
	WebDriver driver;

	public void setup(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
		
	}
	public void TotalEmail(){
		try {
			WebDriverWait wait = new WebDriverWait(driver,50);
			
		WebElement UserName = 	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));
		UserName.sendKeys("tonimagoswami@gmail.com");
		
		WebElement Next = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("content.CwaK9")));
		Next.click();
			
		WebElement Password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));
		Password.sendKeys("123@India");
		
		WebElement SignIn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("content.CwaK9")));
		SignIn.click();
			
		
		WebElement Inbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Inbox")));
		Inbox.click();
		
		WebElement TextBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.Dj>span.ts")));
		String TotalEmail = TextBox.getText();
		
		System.out.println("Total Email :" + TotalEmail);
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Assignment5 mail = new Assignment5();
		mail.setup();
		mail.TotalEmail();
		

	}

}
