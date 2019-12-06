package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertConfirmPopUp {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Downloads/IMP-Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void ConfirmPopUp() {
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='Textbox']/button")).click();
		//Thread.sleep(5000);
		Alert simpleAlert = driver.switchTo().alert();
		String AlertText = simpleAlert.getText();
		System.out.println(AlertText);
		simpleAlert.sendKeys("Tonima");
		simpleAlert.accept();
		
		
	}

	public static void main(String[] args)  {
		AlertConfirmPopUp alert = new AlertConfirmPopUp();
		alert.setUp();
		alert.ConfirmPopUp();
	

	}

}
