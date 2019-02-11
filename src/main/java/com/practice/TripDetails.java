package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TripDetails {
	WebDriver driver;
	
	public TripDetails(WebDriver Driver3)
	{
		driver=Driver3;
	}
		public void trip()
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement radiobutoon=driver.findElement(By.name("tripType"));
			radiobutoon.click();
			
			WebElement passenger=driver.findElement(By.name("passCount"));
			Select passCount=new Select(passenger);
			passCount.selectByValue("3");
			
			WebElement department=driver.findElement(By.name("fromPort"));
			Select department1=new Select(department);
			department1.selectByValue("Frankfurt");
			
			WebElement month=driver.findElement(By.name("fromMonth"));
			Select monthOn=new Select(month);
			monthOn.selectByVisibleText("February");
			
			WebElement day=driver.findElement(By.name("fromDay"));
			Select day1=new Select(day);
			day1.selectByValue("2");
			
			WebElement firstclass=driver.findElement(By.name("servClass"));
			firstclass.click();
			
			WebElement Button=driver.findElement(By.name("findFlights"));
			Button.click();
			
			
		}
	
}
