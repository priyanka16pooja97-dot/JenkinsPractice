package org.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AnnotationsDemo {
	
	WebDriver driver;

	@BeforeSuite
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	  
    
    @Test(priority=1)
    
    public void Search() {
    	System.out.println("Search");
    	
    	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
    	searchbox.sendKeys("iPhone 17");
    	searchbox.submit();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	
    }
    
    
    @Test(priority=2, dependsOnMethods = "Search")
    
    public void addtocart() throws InterruptedException {
    	System.out.println("addtocart");
    	
    	for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }

        Thread.sleep(3000);

    	
    	WebElement addtocart = driver.findElement(By.id("a-autoid-1-announce"));
    	addtocart.click();
    	
    }
  
    

    	@AfterSuite
    	public void teardown() {
    		driver.quit();
    	}
    	
  
}
	


