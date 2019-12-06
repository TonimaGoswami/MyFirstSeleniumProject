package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void SwitchToAlert() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button"));
		Thread.sleep(5000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		Thread.sleep(2000);
		
	}
	public void ConfirmPopUp() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button"));
		Thread.sleep(5000);
		Alert simpleAlert = driver.switchTo().alert();
		String AlertText = simpleAlert.getText();
		System.out.println(AlertText);
		simpleAlert.dismiss();
		
		
	}

	public static void main(String[] args) throws Exception {
		Alerts alert = new Alerts();
		alert.setUp();
		alert.SwitchToAlert();
		alert.ConfirmPopUp();
	
		
		
	}

}
