package com.praticemaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestngPractice {
	
	WebDriver driver;
	
  @Test
  public void register() 
  {
	System.out.println("-----Ragistration form------");
	
	Fillform fill=new Fillform(driver);
	fill.fillformMethod();
  }
  @Parameters("browserName")
@BeforeTest
  public void setupMethod(String name) 
  {
	  System.out.println("-----setup----");
	  String browser=name;
	  if (browser.equalsIgnoreCase("chrome")) 
	  {
		System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
		driver=new ChromeDriver();
	  }
	  else if (browser.equalsIgnoreCase("firefox")) 
	  { 
		 System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
		 driver=new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("internet")) 
	  {
		 System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
	  }
	  else
	  {
		  System.out.println("Wrong Browser");
	  }
	 
	  driver.manage().window().maximize();
	  driver.get("http://demoaut.com/mercuryregister.php");
	  
  }

  @AfterTest
  public void tearMethod() 
  {
	  System.out.println("----close----");
	  driver.quit(); 
  }

}
