package org.AmazonProject;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.daythree.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonSearch extends BaseClass {
	static WebDriverWait wait;
	static String parent;
	
	@BeforeClass
	public static void BrowserLaunch() {
		AmazonSearch obj = new AmazonSearch();
		obj.initBrowser("chrome");
		obj.implicitWait(20);
		wait = new
WebDriverWait(driver, Duration.ofSeconds(20));
		obj.getUrl("https://www.amazon.in/");
		parent = driver.getWindowHandle();
		
		
	}
	
	@Test
	public void addProductToCart() {
		searchAndCart("iphone 17");
		searchAndCart("Samsung Galaxy");
		searchAndCart("OnePlus Nord");
		searchAndCart("Oppo");
		
	}

	private void searchAndCart(String ProductName) {
	
		//SearchBox
		
		WebElement searchbox = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
				searchbox.clear();
				searchbox.sendKeys(ProductName+Keys.ENTER);
				
				List <WebElement> cssElements = driver.findElements(By.cssSelector(("div.s-main-slot div[data-component-type='s-search-result']")));
				cssElements.get(0).click();			
				
		//WindowHandles
				Set <String> WindowHandles = driver.getWindowHandles();
				
				for(String handle:WindowHandles) {
					if(!handle.equals(parent)) {
						driver.switchTo().window(handle);
		}
					System.out.println(driver.getCurrentUrl());
					
					AmazonSearch obj = new AmazonSearch();
					
					 driver.switchTo().window(parent);
				}
	}}
				
				
			//@AfterClass
			// public static void tearDown() {
			// driver.quit();
			//}
				
				
				
			