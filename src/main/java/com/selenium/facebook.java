package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//chromebrowser
		
		//System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();//IE browser
		
		//System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();//firefox browser
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("kalyani");
		
		WebElement Lastname=driver.findElement(By.name("lastname"));
		Lastname.sendKeys("chopane");
		
		WebElement MobileNumber=driver.findElement(By.name("reg_email__"));
		MobileNumber.sendKeys("1234567865");
		
		//driver.findElement(By.name("websubmit")).click();
		
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();
		
		driver.quit();
		

	}

}
