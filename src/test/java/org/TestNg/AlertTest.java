package org.TestNg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {
	public void tc2() {
		System.out.println("tc2");
	}
	
	
	@Test (priority=2, invocationCount=1, invocationTimeOut=10000)
	
	public void tc3() throws Exception {
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com/alert.xhtml");
		
		WebElement alert1 = driver.findElement(By.id("j_idt88:j_idt93"));
		alert1.click();

		Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);

		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.accept();

		driver.quit();
		
		
	}

}
