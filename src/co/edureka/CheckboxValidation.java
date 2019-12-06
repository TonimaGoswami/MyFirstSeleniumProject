package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxValidation {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://semantic-ui.com/modules/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void validateCheckbox(){
		WebElement checkbox = driver.findElement(By.xpath("//*[@id = 'example']/div[4]/div[1]/div[2]/div[4]/div[1]/div[2]/div/input"));
		boolean state = checkbox.isSelected();
		System.out.println("checkbox state true=checked,false=unchecked:" + state);
		driver.findElement(By.xpath("//*[@id = 'example']/div[4]/div[1]/div[2]/div[4]/div[1]/div[2]/div/label"));
		boolean state1 = checkbox.isSelected();
		System.out.println("checkbox state true=checked,false=unchecked:" + state1);
		
		
	}
	public void validateRadiobutton(){
		WebElement radiobutton1 = driver.findElement(By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[4]/div[1]/div[5]/div/div/div[1]/div/label"));
		WebElement radiobutton2 = driver.findElement(By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[4]/div[1]/div[5]/div/div/div[2]/div/label"));
		boolean state = radiobutton1.isSelected();
		System.out.println("radiobutton1 state true=checked,false=unchecked:" + state);
		
		boolean state1 = radiobutton2.isSelected();
		System.out.println("radiobutton2 state true=checked,false=unchecked:" + state1);
		
		
	}

	public static void main(String[] args) {
		CheckboxValidation valid = new CheckboxValidation();
		valid.setUp();
		valid.validateCheckbox();
		valid.validateRadiobutton();

	}

}
