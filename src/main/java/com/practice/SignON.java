package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignON {
	
	WebDriver driver;
	public SignON(WebDriver Driver2)
	{
		driver=Driver2;
	}
		public void signform()
		{
			WebElement signTab=driver.findElement(By.xpath("//a[contains(text(),'sign-in' )]"));
			signTab.click();
			
			WebElement userName=driver.findElement(By.name("userName"));
			userName.sendKeys("jons123@gmail.com");
			
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("password1");
			
			WebElement login=driver.findElement(By.name("login"));
			login.click();
			
		}
}
