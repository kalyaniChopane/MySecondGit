package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicemercurry {

	 static WebDriver driver;
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demoaut.com/mercuryregister.php");
	}
	public void out()
	{
		driver.quit();
		
	}
	public static void main(String[] args)  
	{
		Practicemercurry ref=new Practicemercurry();
		ref.Setup();
	
		Fillform fill=new Fillform(driver);
		fill.form();
		
		SignON sign=new SignON(driver);
		sign.signform();
		
		TripDetails tripD=new TripDetails(driver);
		tripD.trip();
		
		Departreturn departRe=new Departreturn(driver);
		departRe.depart();
		
		ref.out();
		
	}

}
