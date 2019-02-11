package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstPractice {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoaut.com/mercuryregister.php");
		
		WebElement Firstname=driver.findElement(By.name("firstName"));
		Firstname.sendKeys("kalyani");
		
		WebElement Lastname=driver.findElement(By.xpath("//*[@name='lastName']"));
		Lastname.sendKeys("damini");
		
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("1112787302");
		
		WebElement email=driver.findElement(By.xpath("//*[@name='userName'][@id='userName']"));
		email.sendKeys("kalyanidamini@yahoo.com");
		
		WebElement Address=driver.findElement(By.name("address1"));
		Address.sendKeys("karve nagar");
		
		WebElement City=driver.findElement(By.name("city"));
		City.sendKeys("pune");
		
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("maharashtra");
		
		WebElement zipcode=driver.findElement(By.name("postalCode"));
		zipcode.sendKeys("400054");
		
		WebElement country=driver.findElement(By.name("country"));
		Select country1=new Select(country);
		country1.selectByVisibleText("INDIA ");
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("tina@gmail.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("kal12345");
		
		WebElement confirmpassword=driver.findElement(By.name("confirmPassword"));
		confirmpassword.sendKeys("kal12345");
		
		WebElement submit=driver.findElement(By.name("register"));
		submit.click();
		
		Thread.sleep(4000);
		driver.quit();

	}

}
