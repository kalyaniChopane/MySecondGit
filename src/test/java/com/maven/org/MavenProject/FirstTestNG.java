package com.maven.org.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	WebDriver driver;
	
  @Test(priority=1)
  public void signupMethod() 
  {
	  	System.out.println("----signup----");
	  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	WebElement signin=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	  	signin.click();
	  
	  	WebElement emailtext=driver.findElement(By.id("email_create"));
		 emailtext.sendKeys("RoshniHa@gmail.com");
		 
		 WebElement submitbtn=driver.findElement(By.xpath("//button[@type='submit'][@id='SubmitCreate']"));
		 submitbtn.click();
 	 
		 WebElement customerName=driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		 customerName.sendKeys("roshni");
		 

		 WebElement lastName=driver.findElement(By.id("customer_lastname"));
		 lastName.sendKeys("harne");
		 
		 WebElement password=driver.findElement(By.id("passwd"));
		 password.sendKeys("anki123");
		 
		 WebElement days=driver.findElement(By.name("days"));
		 Select date=new Select(days);
		 date.selectByValue("5");
		 
		 WebElement months=driver.findElement(By.id("months"));
		 Select month=new Select(months);
		 month.selectByValue("3");
		 
		 WebElement year=driver.findElement(By.id("years"));
		 Select year1=new Select(year);
		 year1.selectByValue("2017");
		 
		 WebElement checkbox=driver.findElement(By.name("newsletter"));
		 checkbox.click();
		 
		 WebElement firstcustName=driver.findElement(By.xpath("//input[@type='text'][@name='firstname']"));
		 firstcustName.sendKeys("smita");
		 
		 WebElement lastcustname=driver.findElement(By.xpath("//input[@name='lastname'][@type='text']"));
		 lastcustname.sendKeys("jeet");
		 
		 WebElement companytext=driver.findElement(By.name("company"));
		 companytext.sendKeys("info");
		 
		 WebElement address=driver.findElement(By.id("address1"));
		 address.sendKeys("karve nagar ");
		 
		 WebElement city=driver.findElement(By.id("city"));
		 city.sendKeys("pune");
		 
		 WebElement state=driver.findElement(By.id("id_state"));
		 Select statedropdown=new Select(state);
		 statedropdown.selectByVisibleText("Arkansas");
		 
		 WebElement zipcode=driver.findElement(By.id("postcode"));
		 zipcode.sendKeys("40056");
		 
		 WebElement country=driver.findElement(By.id("id_country"));
		 country.click();
		 
		 WebElement mobilephone=driver.findElement(By.name("phone_mobile"));
		 mobilephone.sendKeys("98325668874");
		 
		 WebElement futureaddress=driver.findElement(By.name("alias"));
		 futureaddress.sendKeys("hadpasar");
		 
		 WebElement register=driver.findElement(By.xpath("//*[contains(text(),'Register')]"));
		 register.click();
		 
		 
  }
  @Test(priority=2)
  public void shoppingMethod()
  {
	  System.out.println("-----shopping----");
	  	WebElement womenshop=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		 womenshop.click();
		 
		 WebElement clicktop=driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		 clicktop.click();
		 
		 WebElement frame1= driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
		 driver.switchTo().frame(frame1);
		 WebElement addtocart=driver.findElement(By.xpath("//button[@name='Submit']"));
		 addtocart.click();  
  }
  
  @BeforeTest
  public void setupMethod(String browserName) 
  {
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  }
	  else if(browserName.equalsIgnoreCase("FF"))
	  {
		  System.setProperty("WebDriver.gecko.driver", "Resource/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  
	  
  }
	

  @AfterTest
  public void backmethod() 
  {
	  System.out.println("-----close-----");
	  driver.quit();
  }

}
