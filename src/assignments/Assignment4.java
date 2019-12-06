package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/Html/tryit.asp?filename=tryhtml_checkbox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}
	

	public void validateCheckbox() throws InterruptedException{
		driver.switchTo().frame("iframeResult");
		WebElement Checkbox1 = driver.findElement(By.xpath("html/body/form/input[@value='Bike']"));
		Checkbox1.click();
		boolean state1 = Checkbox1.isSelected();
		System.out.println("checkbox state true=checked,false=unchecked:" + state1);
		if(Checkbox1.isSelected()){
			System.out.println("Checkbox exists");
		}
		else{
			System.out.println("Checkbox doesn't exists");
		}
		
		WebElement Checkbox2 = driver.findElement(By.xpath("html/body/form/input[@value='Car']"));
		boolean state2 = Checkbox2.isSelected();
		System.out.println("checkbox state true=checked,false=unchecked:" + state2);
		
		
		if(Checkbox2.isSelected()){
			System.out.println("Checkbox exists");
		}
		else{
			System.out.println("Checkbox doesn't exists");
		}
		
		
	}
	
	
	public void readOnlyTextBox(){
		driver.get("http://www.w3schools.com/TAGS/tryit.asp?filename=tryhtml_input_readonly");
		driver.switchTo().frame("iframeResult");
		WebElement readOnlyText = driver.findElement(By.name("country"));
		System.out.println("Readonly property of text box :" + readOnlyText.getAttribute("readonly"));
		driver.switchTo().defaultContent();
	}
	
	
	public void disabledTextBox(){
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		driver.switchTo().frame("iframeResult");
		WebElement disabledText = driver.findElement(By.name("lname"));
		System.out.println("Enabled property of text box :" + disabledText.isEnabled());
		driver.switchTo().defaultContent();
		
	}
	

	public static void main(String[] args) throws Exception {
		 Assignment4 valid = new  Assignment4();
		valid.setUp();
		valid.validateCheckbox();
		valid.readOnlyTextBox();
		valid.disabledTextBox();
		driver.quit();

		
	}

}
