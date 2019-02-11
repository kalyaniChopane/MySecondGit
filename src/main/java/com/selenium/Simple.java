package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome class");
		
		System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.quit();
	}

}
