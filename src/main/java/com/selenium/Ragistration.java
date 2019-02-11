package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ragistration {

WebDriver driver;
	
	public Ragistration(WebDriver Driver1) 
	{
		driver=Driver1;
	}

		public void signup() {
		
		WebElement singinbutton=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		singinbutton .click();
		
		 WebElement emailtext=driver.findElement(By.name("email_create"));
		 emailtext.sendKeys("damini@gmail.com");
		 
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
	}
}
