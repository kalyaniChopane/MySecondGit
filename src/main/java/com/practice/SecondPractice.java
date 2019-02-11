package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SecondPractice {

	public static void main(String[] args) {
		
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		
		//System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement Username=driver.findElement(By.id("txtUsername"));
		Username.sendKeys("Admin");
		
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");
		
		WebElement Login=driver.findElement(By.id("btnLogin"));
		Login.click();
		
		WebElement PiM=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
		PiM.click();
		
		WebElement AddEmp=driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
		AddEmp.click();
		
		WebElement FirstempName=driver.findElement(By.name("firstName"));
		FirstempName.sendKeys("sayli");
		
		WebElement LastEmpName=driver.findElement(By.xpath("//*[@name='lastName'][@type='text']"));
		LastEmpName.sendKeys("zhehen");
		
		WebElement Employeeid=driver.findElement(By.name("employeeId"));
		Employeeid.sendKeys("10");
		
		WebElement Savebutton=driver.findElement(By.id("btnSave"));
		Savebutton.click();
		
		driver.quit();
	}

}
