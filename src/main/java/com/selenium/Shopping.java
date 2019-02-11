package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shopping {
	
	WebDriver driver;
	
	public Shopping(WebDriver Driver2) 
	{
		driver=Driver2;
	}
	public void womenshop()
	{
		 WebElement womenshop=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
		 womenshop.click();
		 
		 WebElement clicktop=driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		 clicktop.click();
		 
		 WebElement frame1= driver.findElement(By.xpath("//iframe[contains(@id,'fancybox-frame')]"));
		 driver.switchTo().frame(frame1);
		 WebElement addtocart=driver.findElement(By.xpath("//button[@name='Submit']"));
		 addtocart.click();
		 
		
	}

}
