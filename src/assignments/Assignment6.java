package assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment6 {
	
	WebDriver driver;
	
	
	
	public  void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/tanu/Desktop/IMP-Doc/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}
	
	public void checkLinks() throws Exception{
		
	 WebElement pageFooter = driver.findElement(By.xpath("//*[@id='pageFooter']/div[2]"));
	 List<WebElement> links= pageFooter.findElements(By.tagName("a"));
	 System.out.println(links.size());
	 
	//List for storing all 'href' values for 'a' tag

	 ArrayList<String> Links_List = new ArrayList<String>(); 
	    for (WebElement elem : links) {
	        System.out.println(elem.getText()); // used to get text present between the anchor tags
	        System.out.println(elem.getAttribute("href"));
	        Links_List.add(elem.getAttribute("href")); 
	        System.out.println("..........................................................");
	    }

	    //Navigating to each link
	    int i=0;
	    for (String href : Links_List) {
	        driver.navigate().to(href);
	        System.out.println((++i) +": navigated to URL with href: "+ href);
	        Thread.sleep(3000); 
	        System.out.println("________________________________________________________");
	    }
	    driver.quit();
}
	public static void main(String[] args) throws Exception {
		Assignment6 check = new Assignment6();
		check.setUp();
		check.checkLinks();

	}
}

