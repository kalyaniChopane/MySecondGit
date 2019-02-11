package com.praticemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Fillform {
	WebDriver driver;
	
	public Fillform(WebDriver driver1)
	{
		driver=driver1;
	}
		
		public void fillformMethod() {

			WebElement firstName=driver.findElement(By.name("firstName"));
			firstName.sendKeys("Ashish");
			
			WebElement lastName=driver.findElement(By.name("lastName"));
			lastName.sendKeys("jons");
			
			WebElement phone=driver.findElement(By.name("phone"));
			phone.sendKeys("1234567890");
			
			WebElement userName=driver.findElement(By.name("userName"));
			userName.sendKeys("jons123@gmail.com");
			
			WebElement address1=driver.findElement(By.name("address1"));
			address1.sendKeys("kothrud depo pune");
			
			WebElement city=driver.findElement(By.name("city"));
			city.sendKeys("pune");
			
			WebElement state=driver.findElement(By.name("state"));
			state.sendKeys("kerla");
			
			WebElement postalCode=driver.findElement(By.name("postalCode"));
			postalCode.sendKeys("12345");
			
			WebElement country=driver.findElement(By.name("country"));
			Select country1=new Select(country);
			country1.selectByVisibleText("INDIA ");
			
			WebElement username=driver.findElement(By.name("email"));
			username.sendKeys("jons123@gmail.com");
			
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys("password1");
			
			WebElement confirmpass=driver.findElement(By.name("confirmPassword"));
			confirmpass.sendKeys("password1");
			
//			WebElement submitButton=driver.findElement(By.name("register"));
//			submitButton.click();
			
			
		}
}
