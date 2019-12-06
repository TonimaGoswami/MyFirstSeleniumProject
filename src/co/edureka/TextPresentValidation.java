package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextPresentValidation {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void TextInTextBox(){
		WebElement NameField = driver.findElement(By.name("name"));
		String namePlaceholder = NameField.getAttribute("placeholder");
		
		if (namePlaceholder.equals("Name *"))
			System.out.println("Name field placeholder Pass:");
		else
			System.out.println("Name field placeholder Fail:");
		
		WebElement EmailField = driver.findElement(By.xpath("//*[@id='presscore-contact-form-widget-3']/form/div/span[2]/input"));
		String emailPlaceholder = EmailField.getAttribute("placeholder");
		
		if (namePlaceholder.equals("E-mail *"))
			System.out.println("Email field placeholder Pass:");
		else
			System.out.println("Email field placeholder Fail:");
				
				
	}

	public static void main(String[] args) {
		TextPresentValidation text = new TextPresentValidation();
		text.setUp();
		text.TextInTextBox();

	}

}
