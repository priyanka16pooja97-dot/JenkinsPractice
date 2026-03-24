package org.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MatrixAlertTask {
	
	@DataProvider (name="loginData")
	
	private String [][] loginData() {
		String [][] data = new String [2][2];
		
		data [0][0] = "java@gmail.com";
		data [0][1] = "pass@123";
		
		data [1][0] = "selenium@gmail.com";
		data [1][1] = "word@123";
		return data;
	}

	
	@Test (dataProvider = "loginData")
	
	private void MatrixAlertTask(String email, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		
	}

}
