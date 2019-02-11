package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	
	public class AutomationMethod {
		static WebDriver driver;
		
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	public void back()
	{
		driver.quit();
	}

	public static void main(String[] args)  {
		
		AutomationMethod automethod=new AutomationMethod();
		automethod.Setup();
		
		Ragistration register=new Ragistration(driver);
		register.signup();
		
		Shopping shoptop=new Shopping(driver);
		shoptop.womenshop();
		
		automethod.back();
		
	}

}
