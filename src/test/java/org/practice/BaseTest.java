package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public static ThreadLocal<WebDriver>driver = new ThreadLocal<>();
	
	@BeforeClass
	
	public void setup() {
		driver.set(new ChromeDriver());
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	@AfterClass
	
	public void TearDown() {
		driver.get().quit();
	}

}
