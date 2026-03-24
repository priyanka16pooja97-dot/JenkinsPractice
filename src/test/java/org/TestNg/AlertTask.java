package org.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AlertTask {
	
	@Parameters ({"email","password", "browser"})
	
	@Test
	
	private void AlertTask (String email, String password, String browser) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://affiliate.flipkart.com/");
		
		// To find the webelement using Locator
		
		//id
		
		driver.findElement(By.id("inputEmail")).sendKeys(email);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		
	}

}
