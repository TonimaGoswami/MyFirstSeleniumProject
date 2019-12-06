package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyInteraction {
	
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
		WebElement searchbox = driver.findElement(By.id("lst_ib"));
		
		Actions builder = new Actions(driver);
		
		//Generating an action to type a text in CAPS
		Action typeInCaps = builder.keyDown(searchbox, Keys.SHIFT).sendKeys(searchbox, "edureka online training")
				.keyUp(searchbox, Keys.SHIFT).build();
		
		// Performing the typeInCaps action
		typeInCaps.perform();
		
	}

	public static void main(String[] args) {
		
		KeyInteraction keyboard = new KeyInteraction();
		keyboard.setup();
		keyboard.keyboardActions();

	}

}
