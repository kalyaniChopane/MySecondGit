package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Departreturn {
	WebDriver driver;
	
		public Departreturn(WebDriver Driver4) 
		{
			driver=Driver4;
	    }
		public void depart() 
		{
			WebElement depart=driver.findElement(By.xpath("//input[contains(@type,'radio')  and (@name='outFlight')   and (@value='Blue Skies Airlines$361$271$7:10')]"));
			depart.click();
			
			WebElement continueBtn=driver.findElement(By.xpath("//input[contains(@name,'reserveFlights')]"));
			continueBtn.click();
			
			WebElement NameText=driver.findElement(By.xpath("//input[contains(@name,'passFirst0')]"));
			NameText.sendKeys("kirti");
			
			WebElement LastNameText=driver.findElement(By.xpath("//input[contains(@name,'passLast0') and  (@size='15')]"));
			LastNameText.sendKeys("stream");
			
			WebElement mealdropdown=driver.findElement(By.name("pass.0.meal"));
			Select mealdrop=new Select(mealdropdown);
			mealdrop.selectByVisibleText("Low Cholesterol");
			
			WebElement carddropdown=driver.findElement(By.name("creditCard"));
			Select cardtypedrop=new Select(carddropdown);
			cardtypedrop.selectByVisibleText("MasterCard");
			
			WebElement number=driver.findElement(By.name("creditnumber"));
			number.sendKeys("111");
			
			WebElement first=driver.findElement(By.name("cc_frst_name"));
			first.sendKeys("stream");
			
			WebElement middlename=driver.findElement(By.xpath("//input[@type='TEXT'][@name='cc_mid_name']"));
			middlename.sendKeys("cdef");
			
			WebElement lastNAme=driver.findElement(By.name("cc_last_name"));
			lastNAme.sendKeys("deokar");
			
			WebElement securepurchase=driver.findElement(By.name("buyFlights"));
			securepurchase.click();
			
			
			
			
		}
}
