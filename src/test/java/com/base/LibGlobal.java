package com.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal {
	WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUGUNTH\\eclipse-workspace\\Methods\\Library\\chromedriver.exe");
	
		driver = new ChromeDriver();
		return driver;

	}
	
	public void loadUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void type(WebElement element, String data) {
		element.sendKeys(data);
		
	}

	public void btnClick(WebElement element) {
		element.click();

	}
	
	public void quitBrowser(WebDriver driver) {
		driver.quit();

	}
	
	public void typeJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		
	}
	
	public void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}
	
	public String currentUrl(WebDriver driver, String data) {
		return driver.getCurrentUrl();
	}
	
	public String attributesGet(WebElement element, String data) {
		return element.getAttribute("value");
	}
	
	public String textGet(WebElement element, String data) {
		return element.getText();
	}
	
	public String titleGet(WebDriver driver, String data) {
		return driver.getTitle();
	}
	
	public boolean containsWrong(WebDriver driver, String data) {
		return driver.getCurrentUrl().contains("login_attempt");
	}
	
	public void actionMove(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void actionDragDrop(WebElement element1,WebElement element2) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element1, element2).perform();
	}
	
	public void actionContext(WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void actionDouble(WebElement element, String data) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
		
	}

	}

	

