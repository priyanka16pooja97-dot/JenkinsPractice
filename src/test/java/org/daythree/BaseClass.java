package org.daythree;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	//Instance variable
	public static WebDriver driver;
	public static Alert alert;



	//Reusable Method by Using Selenium		
	public void initBrowser(String browser) {	
		switch(browser.toLowerCase())  {  
		case "chrome":{

			
			driver = new ChromeDriver();
			break;
		}
		case "edge":{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		case "firefox":{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		default :  System.out.println("invalid Browser Name");

		}
		driver.manage().window().maximize();
	}		
	//Url Pass	
	public void getUrl(String url) {
		driver.get(url);
	}	

	//Locator
	//id 
	public WebElement findElementId(String id) {
		return driver.findElement(By.id(id));
	}
	//Class
	public WebElement findElementClass(String text) {	
		return driver.findElement(By.className(text));
	}

	//name
	public WebElement findElementName(String name) {
		return driver.findElement(By.name(name));
	}

	//LinkText
	public WebElement findElementLinkText(String name) {
		return driver.findElement(By.linkText(name));
	}

	//Partial
	public WebElement findElementPartiaLinkText(String name) {
		return driver.findElement(By.partialLinkText(name));
	}

	//CSS Selector
	public WebElement findElementCSSselector(String name) {
		return driver.findElement(By.cssSelector(name));
	}

	//Xpath
	public WebElement findElementXpath(String name) {
		return driver.findElement(By.xpath(name));	
	}

	//Tagname
	public WebElement findElementTagName(String name) {
		return driver.findElement(By.tagName(name));	
	}

	//getCurrentUrl

	public void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public void gettTitle() {
		System.out.println(driver.getTitle());
	}

	//Sendkeys

	public void sendKeys(WebElement ele, String sendKeys) {
		ele.sendKeys(sendKeys);	
	} 
	//Click
	public void click(WebElement ele) {
		ele.click();
	}
	//getText  or using return
	public void getText(WebElement ele) {
		System.out.println(ele.getText());
		//	      return ele.getText();
		//		System.out.println(ele.getText());
	}

	//Close
	public void close() {
		driver.close();
	}
	//quit
	public void quit() {
		driver.quit();
	}
	//Navigate  // forward, Back, refresh,navigateTo


	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public void navigateMethod(String method) {
		switch(method.toLowerCase()) {
		case "forward":{
			driver.navigate().forward();
			break;
		}
		case "back":{
			driver.navigate().back();
			break;
		}
		case "refresh":{
			driver.navigate().refresh();
			break;
		}
		default : System.out.println("You given Method Wrong "+method);	
		}

	}

	//Implicit Wait

	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	//Alert

	//alert.accept();
	//alert.dismiss();
	//alert.sendKeys("text");
	//alert.getText();


	public void switchToAlert() {
		alert = driver.switchTo().alert();

	}

	public void alertSendKeys(String name) {
		//		alert = driver.switchTo().alert();
		alert.sendKeys(name);
	}

	public void alertMethods(String method) {
		switch(method.toLowerCase()) {
		case "accept":{
			alert.accept();
			break;
		}
		case "dismiss" :{
			alert.dismiss();
			break;
		}
		case "getText":{
			System.out.println(alert.getText());
			break;
		}
		default : System.out.println("Your Alert Inputs Methods Wrong");
		}
	}
	// ================= WINDOW METHODS =================

	public static String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public static Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public static void switchToWindow(String id) {
		driver.switchTo().window(id);
	}

	// ================= ACTIONS CLASS =================

	public static void mouseHover(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public static void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public static void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}


	// ================= SCREENSHOT =================

	public static void takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		FileUtils.copyFile(src, file);
	}

	// ================= DROPDOWN =================

	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// ================= FRAME METHODS =================

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrameByName(String name) {
		driver.switchTo().frame(name);
	}

	public void switchToFrameByElement(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	// ================= KEYBOARD ACTIONS =================

	public void pressEnter(WebElement ele) {
		ele.sendKeys(Keys.ENTER);
	}

	public void pressTab(WebElement ele) {
		ele.sendKeys(Keys.TAB);
	}

	public void copy(WebElement ele) {
		ele.sendKeys(Keys.CONTROL + "a");
		ele.sendKeys(Keys.CONTROL + "c");
	}

	public void paste(WebElement ele) {
		ele.sendKeys(Keys.CONTROL + "v");
	}

	public void keyDownCtrl() {
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
	}

	public void keyUpCtrl() {
		Actions act = new Actions(driver);
		act.keyUp(Keys.CONTROL).perform();
	}

	// ================= DRAG AND DROP =================

	public void dragAndDropjava(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public void clickAndHold(WebElement ele) {
		Actions act = new Actions(driver);
		act.clickAndHold(ele).perform();
	}

	public void release(WebElement ele) {
		Actions act = new Actions(driver);
		act.release(ele).perform();
	}

	// ================= WEB TABLE METHODS =================

	public int getRowCount(By tableRows) {
		List<WebElement> rows = driver.findElements(tableRows);
		return rows.size();
	}

	public int getColumnCount(By tableColumns) {
		List<WebElement> columns = driver.findElements(tableColumns);
		return columns.size();
	}

	public String getCellData(By cellLocator) {
		return driver.findElement(cellLocator).getText();
	}

	public void printAllTableData(By rowsLocator) {
		List<WebElement> rows = driver.findElements(rowsLocator);
		for (WebElement row : rows) {
			System.out.println(row.getText());
		}
	}

	// ================= JS EXECUTOR =================

	public void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}

	public void jsSendKeys(WebElement ele, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];", ele, value);
	}

	public void scrollBy(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(arguments[0],arguments[1]);", x, y);
	}

	public void scrollIntoView(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	public void scrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public void scrollToTop() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}







} //Class Bracket Close