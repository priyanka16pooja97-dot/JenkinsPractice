package org.pageobjectmodel;

import org.daythree.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	//PrivateVariable
	
	//Annotations
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBys ({@FindBy (id="pass"),@FindBy(xpath="//input[@id='pass']")}) //And operator
	private WebElement password;
	
	@FindAll ({@FindBy(name="login"),@FindBy(id="email")}) //or operator
	private WebElement loginButton;
	
	//Constructor
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Getter & Setter
	
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}



