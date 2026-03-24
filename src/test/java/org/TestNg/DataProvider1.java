package org.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class DataProvider1 {
	@Test(dataProviderClass = DataUtils.class, dataProvider = "loginData")
	
	private void AlertTask1 (String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://affiliate.flipkart.com/");
		
		//Identify the webelement using locators
		
		driver.findElement(By.id("inputEmail")).sendKeys(email);
		driver.findElement(By.id("inputPassword")).sendKeys(password);
		
		
		
	}
	
	
	
	

}
