package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Assign4KeyboardInteraction {
	static WebDriver driver;
	
	public  void setup(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void keyboardActions(){
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		
		Actions actionbuilder = new Actions(driver);
		
	    Action multipleActions =	 actionbuilder.moveToElement(Searchbox).click()
	    		.keyDown(Searchbox, Keys.SHIFT).sendKeys(Searchbox, "lampshade").moveToElement(driver.findElement(By.cssSelector("input.nav-input"))).click()
	    		.sendKeys(Keys.CONTROL).sendKeys("HOME").build();
	
		multipleActions.perform();
		
		
				
}

	public static void main(String[] args) {
		Assign4KeyboardInteraction keyboard = new Assign4KeyboardInteraction();
		keyboard.setup();
		keyboard.keyboardActions();
		//driver.quit();

	}

}
