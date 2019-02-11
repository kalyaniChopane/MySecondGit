package com.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
		public LoginPage(WebDriver driver2)
		{
			driver=driver2;
		}
		public void New() 
		{
			WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys("admin");
			
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			password.sendKeys("demo123");
			
			WebElement login=driver.findElement(By.name("wp-submit"));
			login.click();
			
			//WebElement newclick=driver.findElement(By.xpath("//span[contains(text(),'New')]"));
			//newclick.click();
			
			WebElement user=driver.findElement(By.xpath("//div[contains(text(),'Users')]"));
			user.click();
			
			WebElement newUser=driver.findElement(By.linkText("Add New"));
			newUser.click();
			
			WebElement usernamebox=driver.findElement(By.name("user_login"));
			usernamebox.sendKeys("komalika");
			
			WebElement email=driver.findElement(By.name("email"));
			email.sendKeys("komalika@gmail.com");
			
			WebElement firstName=driver.findElement(By.name("first_name"));
			firstName.sendKeys("damini");
			
			WebElement lastName=driver.findElement(By.name("last_name"));
			lastName.sendKeys("dandekar");
			
			WebElement Passshow=driver.findElement(By.xpath("//button[contains(text(),'Show password')]"));
			Passshow.click();
			
			WebElement drop=driver.findElement(By.name("role"));
			Select dropdown=new Select(drop);
			dropdown.selectByVisibleText("Contributor");
			
			
			
			WebElement addbutton=driver.findElement(By.xpath("//input[@type='submit']"));
			addbutton.click();
			 
			
			/*WebElement textbox=driver.findElement(By.name("post_title"));
			textbox.sendKeys("you are good");
			
			WebElement addmedia=driver.findElement(By.id("insert-media-button"));
			addmedia.click();
			WebElement photo=driver.findElement(By.xpath("//button[@type='button'][@class='browser button button-hero']"));
			photo.sendKeys("Resource/dipika.jpg");*/
		}
		
	/*public void Login()
	{
		
		
		WebElement mediaClick=driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Media')]"));
		mediaClick.click();
		
		WebElement add=driver.findElement(By.partialLinkText("Add"));
		add.click();
	
		WebElement select=driver.findElement(By.id("plupload-browse-button"));
		select.sendKeys("Resource/download.jpg");
		
	}*/

}
