package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardInteraction {
	 WebDriver driver;
		
		public  void setup(){
			System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
		}
		public void keyboardActions(){
			driver.findElement(By.id("lst_ib")).sendKeys("edureka online training");
			
			Actions actionbuilder = new Actions(driver);
			actionbuilder.sendKeys(Keys.CONTROL).sendKeys("a")
			.build().perform();
			actionbuilder.sendKeys(Keys.ENTER)
			.build().perform();
					
}
	public static void main(String[] args) {
		KeyInteraction keyboard = new KeyInteraction();
		keyboard.setup();
		keyboard.keyboardActions();

		

	}

}
