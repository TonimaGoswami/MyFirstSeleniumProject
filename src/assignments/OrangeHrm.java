package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
static WebDriver driver;
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://hrm.seleniumminutes.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Password");
		driver.findElement(By.id("btnLogin")).click();
	}
	public void validateCheckbox() throws InterruptedException{
		driver.findElement(By.xpath(".//*[@id='menu_admin_viewAdminModule']/b"));
		Thread.sleep(1000);
		Select drpJob = new Select(driver.findElement(By.xpath(".//*[@id='menu_admin_Job']")));
		drpJob.selectByVisibleText("Job Titles");
		WebElement Checkbox = driver.findElement(By.cssSelector("input#ohrmList_chkSelectRecord_1"));
		boolean state = Checkbox.isSelected();
		System.out.println("checkbox state true=checked,false=unchecked:" + state);
	}

	public static void main(String[] args) throws Exception {
		
		OrangeHrm valid = new OrangeHrm();
		valid.setUp();
		valid.login();
		valid.validateCheckbox();

	}

}
