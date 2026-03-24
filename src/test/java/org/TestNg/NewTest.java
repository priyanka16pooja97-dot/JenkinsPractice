package org.TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {

    @Parameters({"sendkeys"})
    @Test
    private void alertTask1(String name) {

        WebDriver driver = new ChromeDriver();
//        System.out.println("Search value: "+name);
        driver.get("https://www.amazon.in/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        
        System.out.println("Search value: "+name);
        
    
        
        //id

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(name+Keys.ENTER);
       
        
    }
}
    

		
