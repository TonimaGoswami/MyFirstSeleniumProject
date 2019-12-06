package co.edureka;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class bikes {
  @Test
  public void apache() {
	  System.out.println("apache test executed");
  }
  @Test
  public void Avenger() {
	  System.out.println("Avenger test executed");
  }
  @Test
  public void RoyalEnfield() {
	  System.out.println("RoyalEnfield test executed");
  }
  @Test
  public void Honda() {
	  System.out.println("Honda test executed");
  }
  @Test
  public void Ducati() {
	  System.out.println("Ducati test executed");
  }
  @Test
  public void Pulsar() {
	  System.out.println("Pulsar test executed");
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
