package assignments;

import org.testng.annotations.Test;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class Assignment7 {
	WebDriver driver;
	public Date date;
	
 @BeforeTest
	  public void setUp() {
	 System.setProperty("webdriver.gecko.driver", "/Users/tanu/Desktop/IMP-Doc/geckodriver");
	 driver = new FirefoxDriver();
	 date = new Date();
	 driver.get("http://newtours.demoaut.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	  }	
 @Test
 public void bookTicket() throws Exception {
	 // For Login
	 driver.findElement(By.name("userName")).sendKeys("mercury");
	 driver.findElement(By.name("password")).sendKeys("mercury");
	 Thread.sleep(2000);
	 takeScreenshots();
	 driver.findElement(By.name("login")).click();
	 
	 
	 //For flight details
	 
	 Select Passengers = new Select(driver.findElement(By.name("passCount")));
	 Passengers.selectByValue("2");
	 Select Departing_From = new Select(driver.findElement(By.name("fromPort")));
	 Departing_From.selectByValue("San Francisco");
	 Select MonthOfJourney = new Select(driver.findElement(By.name("fromMonth")));
	 MonthOfJourney.selectByValue("8");
	 Select DateOfJourney = new Select(driver.findElement(By.name("fromDay")));
	 DateOfJourney.selectByValue("15");
	 Select Arriving_In = new Select(driver.findElement(By.name("toPort")));
	 Arriving_In.selectByValue("Frankfurt");
	 Select MonthOfReturning = new Select(driver.findElement(By.name("toMonth")));
	 MonthOfReturning.selectByValue("9");
	 Select DateOfReturning = new Select(driver.findElement(By.name("toDay")));
	 DateOfReturning.selectByValue("15");
	 
	 driver.findElement(By.cssSelector("input[value='Business']")).click();
	 Select Airline = new Select(driver.findElement(By.name("airline")));
	 Airline.selectByVisibleText("Unified Airlines");
	 Thread.sleep(1000);
	 driver.findElement(By.name("findFlights")).click();
	 Thread.sleep(2000);
	 takeScreenshots();
	 driver.findElement(By.name("reserveFlights")).click();
	 Thread.sleep(2000);
	 takeScreenshots();
	 
	 //For Booking Flight
	 driver.findElement(By.name("passFirst0")).sendKeys("Mohan");
	 driver.findElement(By.name("passLast0")).sendKeys("Raj");
	 driver.findElement(By.name("passFirst1")).sendKeys("Sheekha");
	 driver.findElement(By.name("passLast1")).sendKeys("Raj");
	 
	 Select Meal_Preference1 = new Select(driver.findElement(By.name("pass.0.meal")));
	 Meal_Preference1.selectByValue("HNML");
	 Select Meal_Preference2 = new Select(driver.findElement(By.name("pass.1.meal")));
	 Meal_Preference2.selectByValue("HNML");
	 
	 Select Credit_Card = new Select(driver.findElement(By.name("creditCard")));
	 Credit_Card.selectByValue("BA");
	 driver.findElement(By.name("creditnumber")).sendKeys("123456789");
	 Select Expiration_month = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
	 Expiration_month.selectByVisibleText("07");
	 Select Expiration_year = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
	 Expiration_year.selectByVisibleText("2010");
	 
	 driver.findElement(By.name("delAddress1")).sendKeys("2340 Saratoga Ave.");
	 driver.findElement(By.name("delCity")).sendKeys("San Jose");
	 driver.findElement(By.name("delZip")).sendKeys("95045");
	 driver.findElement(By.name("buyFlights")).click();
	 Thread.sleep(2000);
	 takeScreenshots();
	 
}
 public void takeScreenshots() throws Exception{
 //File MyFile =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 //Object timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
// FileUtils.copyFile(MyFile, new File("/Users/tanu/Documents/workspace/MyFile/"+ timeStamp  +".png"));
  
 }
 
 
@Test(invocationCount=5)
public void printTitle(){
	driver.get("https://www.dropbox.com/");
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
}

  

  @AfterTest
  public void closeBrowser() {
	  driver.quit();
  }

}
