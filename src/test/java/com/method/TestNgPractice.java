package com.method;

import org.testng.annotations.Test;

import com.practice.Departreturn;
import com.practice.Fillform;
import com.practice.SignON;
import com.practice.TripDetails;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestNgPractice {
	
	WebDriver driver;
	
  @Test
  public void signonMethod() 
  {
	  System.out.println("-----SignIn form-----");

	  SignON ref1 = new SignON(driver);
	  ref1.signform();
	  
  }
  @Test
  public void fillformMethod() 
  {
	  System.out.println("-----FillForm form-----");
	   
	  Fillform fill=new Fillform(driver);
	  fill.form();
  }
  @Test
  public void TripdetailsMethod()
  {
	 System.out.println("----TripDetails-----");
	 
	TripDetails tripd=new TripDetails(driver);
	tripd.trip();
  }
  public void departreturnMethod()
  {
	  System.out.println("-----DepartReturn-----");
	   
	  Departreturn departreturn=new Departreturn(driver);
	  departreturn.depart();
  }
  
  
  @BeforeTest
  public void SetUp()
  {
	  String browser="chrome";
	  
	  if (browser.equalsIgnoreCase("chrome")) 
	  {
		  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if (browser.equalsIgnoreCase("firefox")) 
	  {
		  System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("Internet")) 
	  {
		  System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  else 
	  {
		System.out.println("Wrong Browser");
	  }
	  
//	  System.out.println("-----SetUp-----");
//	  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  //driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demoaut.com/mercuryregister.php");
	  
}

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
