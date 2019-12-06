package co.edureka;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommands {
 WebDriver driver, driver1;
	
	public  void setup(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
	}
	public void switchWindow(){
		String Parentwindow = driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id = 'button1']")).click();
		//driver.switchTo().window("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.");
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles){
			System.out.println(String.valueOf(handle));
		}
		WebElement TestDataHandling = driver.findElement(By.linkText("Test Data Handling"));
				TestDataHandling.click();
				
		
	}
	public void switchFrame(){
		driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(1);
		WebElement Paragraph = driver.findElement(By.xpath("html/body/p"));
		String ParaText = Paragraph.getText();
		System.out.println(ParaText);
	
	
	}

	public static void main(String[] args) {
		SwitchCommands commands = new SwitchCommands();
		commands.setup();
		//commands.switchWindow();
		commands.switchFrame();

	}

}
