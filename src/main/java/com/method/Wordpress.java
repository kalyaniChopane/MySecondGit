package com.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wordpress {
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		Wordpress word=new Wordpress();
		word.Setup();
		
		LoginPage newuser=new LoginPage(driver);
		newuser.New();
		
		
		
	}
	public void Setup(){
	System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demosite.center/wordpress/wp-login.php");

	}
	public void back()
	{
		driver.quit();
	}

}
