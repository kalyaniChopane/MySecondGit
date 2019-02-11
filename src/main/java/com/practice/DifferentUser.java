package com.practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentUser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.clear();
		System.out.println("Username: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println(name);
		firstname.sendKeys(name);

	}

}
