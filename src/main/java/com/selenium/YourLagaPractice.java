package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourLagaPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		WebElement singinbutton=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		singinbutton .click();
		
		 WebElement emailtext=driver.findElement(By.id("email_create"));
		 emailtext.sendKeys("tinakallu05@gmail.com");
		 
		 WebElement submitbtn=driver.findElement(By.name("SubmitCreate"));
		 submitbtn.click();
		 
		 
		 
		 WebElement gender1=driver.findElement(By.xpath("//*[@name='id_gender'][@type='radio']"));
		 gender1.click();
		 
		 WebElement customerName=driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		 customerName.sendKeys("ankita");
		 
		 WebElement lastName=driver.findElement(By.id("customer_lastname"));
		 lastName.sendKeys("jeet");
		 
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
		 firstcustName.sendKeys("ankita");
		 
		 WebElement lastcustname=driver.findElement(By.xpath("//input[@name='lastname'][@type='text']"));
		 lastcustname.sendKeys("jeet");
		 
		 WebElement companytext=driver.findElement(By.name("company"));
		 companytext.sendKeys("baxture");
		 
		 WebElement address=driver.findElement(By.id("address1"));
		 address.sendKeys("karve nagar near rajaram pool");
		 
		 WebElement city=driver.findElement(By.id("city"));
		 city.sendKeys("pune");
		 
		 WebElement state=driver.findElement(By.id("id_state"));
		 Select statedropdown=new Select(state);
		 statedropdown.selectByVisibleText("Arkansas");
		 
		 WebElement zipcode=driver.findElement(By.id("postcode"));
		 zipcode.sendKeys("40053");
		 
		 WebElement country=driver.findElement(By.id("id_country"));
		 country.click();
		 
		 WebElement mobilephone=driver.findElement(By.name("phone_mobile"));
		 mobilephone.sendKeys("12345678901");
		 
		 WebElement futureaddress=driver.findElement(By.name("alias"));
		 futureaddress.sendKeys("abcdefghij");
		 
		 WebElement register=driver.findElement(By.xpath("//*[contains(text(),'Register')]"));
		 register.click();
		
		 WebElement womenshop=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		 womenshop.click();
		 
		 WebElement clicktop=driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		 clicktop.click();
		 
		 WebElement frame1= driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
		 driver.switchTo().frame(frame1);
		 WebElement addtocart=driver.findElement(By.xpath("//button[@name='Submit']"));
		 addtocart.click();
		 
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(5000);
		 WebElement proceedpopwindow=driver.findElement(By.xpath("//a[@rel='nofollow'][@title='Proceed to checkout']"));
		 proceedpopwindow.click();
		 
		 WebElement proceedtocheckout=driver.findElement(By.xpath("//a[@title='Proceed to checkout'][@class='button btn btn-default standard-checkout button-medium']"));
		 proceedtocheckout.click();
		 
		 WebElement processAddress=driver.findElement(By.name("processAddress"));
		 processAddress.click();
		 
		 WebElement processCarrier=driver.findElement(By.name("processCarrier"));
		 processCarrier.click();
		 
		 
		 WebElement checkboxagree=driver.findElement(By.name("cgv"));
		 
		 Actions act= new Actions(driver);
		 act.moveToElement(checkboxagree).click().build().perform();
		 
		 WebElement processCarrierpayment=driver.findElement(By.name("processCarrier"));
		 processCarrierpayment.click();
	
		 
		 
		 
		 
		 driver.quit();
		 
		 
		}

}
