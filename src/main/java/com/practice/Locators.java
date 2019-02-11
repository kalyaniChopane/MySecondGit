package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin=driver.findElement(By.xpath("//a[contains(   .    ,'Sign in'  )]"));//. is used for space
		signin.click();
		
		WebElement CreatTextBox=driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control'][@name='email_create']"));
		CreatTextBox.sendKeys("joker@gmail.com");
		
		WebElement CreatAccount=driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive'  and  @type='submit']"));
		CreatAccount.click();//or //button[starts-with(@name,'SubmitC')]
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='customer_firstname' or @id='customer_firstname']"));
		firstName.sendKeys("kirti");
		
		WebElement lastName=driver.findElement(By.xpath("//input[contains(@name,'customer_lastname')]"));
		lastName.sendKeys("more");
		
		//WebElement email=driver.findElement(By.xpath("//input[starts-with(@name,'ema')  and  @data-validate='isEmail' ]"));
		//email.sendKeys("joker@gmail.com");
		
		WebElement password=driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("123456789");
		
		WebElement day=driver.findElement(By.cssSelector("select[name='days']"));
		Select daydrop=new Select(day);
		daydrop.selectByValue("4");
		
		WebElement month=driver.findElement(By.cssSelector("select[name*='months']"));
		Select monthdrop=new Select(month);
		monthdrop.selectByValue("2");
		
		WebElement year=driver.findElement(By.cssSelector("select[name^='years']"));
		Select yeardrop=new Select(year);
		yeardrop.selectByValue("1994");
		
		WebElement checkbox=driver.findElement(By.cssSelector("input[name$='newsletter']"));
		checkbox.click();
		
		WebElement firstname1=driver.findElement(By.cssSelector("input[name='firstname'][class='form-control']"));
		firstname1.sendKeys("kitkat");
		
		WebElement lastname1=driver.findElement(By.cssSelector("input[id='lastname']"));
		lastname1.sendKeys("more");
		
		WebElement company=driver.findElement(By.xpath("//input[contains(@id,'company')]"));
		company.sendKeys("netsol");
		
		WebElement address=driver.findElement(By.xpath("//input[starts-with(@type,'tex')][@name='address1']"));
		address.sendKeys("abc chowk");
		
		WebElement city=driver.findElement(By.xpath("//input[starts-with(@type,'tex')][@name='city']"));
		city.sendKeys("pune");
		
		WebElement state=driver.findElement(By.xpath("//select[starts-with(@id,'id_state')]"));
		Select state1=new Select(state);
		state1.selectByVisibleText("Louisiana");
		
		WebElement zipcode=driver.findElement(By.xpath("//input[@name='postcode']"));
		zipcode.sendKeys("12345");
		
		WebElement country=driver.findElement(By.cssSelector("select[name='id_country']"));
		Select country1=new Select(country);
		country1.selectByVisibleText("United States");
		
		WebElement mobilephone=driver.findElement(By.cssSelector("input[id='phone_mobile']"));
		mobilephone.sendKeys("82371093247");
		
		WebElement futureadd=driver.findElement(By.xpath("//input[starts-with(@name,'ali')  and @class='form-control']"));
		futureadd.sendKeys("karve nagar");
		
		WebElement registerButton=driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
		registerButton.click();
		
		
		
		

	}

}
