package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsForm {
	 WebDriver driver;
		
		public  void setup(){
			System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
		}
		public void contactForm(){
			WebElement NameField = driver.findElement(By.name("name"));
			String namePlaceholder = NameField.getAttribute("placeholder");
		}

	public static void main(String[] args) {
		

	}

}
