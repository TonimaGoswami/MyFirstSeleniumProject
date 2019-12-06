package co.edureka;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class HoverEvent {
	static WebDriver driver;

	
	@Before
	public void setUp() {
	
			System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://store.demoqa.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
		}
	

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
		public void hover(){
			WebElement MainMenu = driver.findElement(By.xpath("//*[@id='menu-item-33']/a"));
			Actions builder  = new Actions(driver);
			Actions hoverMouse =  builder.moveToElement(MainMenu).moveToElement(driver.findElement(By.xpath("//*[@id='menu-item-36']")));
			hoverMouse.perform();
		}
		
	}


