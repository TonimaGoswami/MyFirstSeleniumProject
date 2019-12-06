package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragAndDrop {
static WebDriver driver;
	
	
	public  void login(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	public void seleniumActions(){
		driver.switchTo().frame(0);
		WebElement dragFrom =driver.findElement(By.id("draggable"));
		WebElement dragTo = driver.findElement(By.id("droppable"));
		
							
		Actions builder = new Actions(driver);
		Action dragAndDrop =  builder.clickAndHold(dragFrom)
				.moveToElement(dragTo).release(dragTo).build();
		
		dragAndDrop.perform();
	}
	public void verifyDrop(){
		String TargetText = driver.findElement(By.xpath(".//*[@id = 'droppable']/p")).getText();
		if (TargetText.equals("Dropped"))
			System.out.println("State test Pass");
		else
			System.out.println("State test Fail:");
				
	
	
	}

	public static void main(String[] args) {
		
		JqueryDragAndDrop drag = new JqueryDragAndDrop();
		drag.login();
		drag.seleniumActions();
		drag.verifyDrop();
	}

}
