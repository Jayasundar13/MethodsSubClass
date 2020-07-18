package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Access {
	public static void main(String[] args) {
		
		LibGlobal global = new LibGlobal();
		WebDriver driver = global.getDriver();
		global.loadUrl(driver,"https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		global.type(txtUserName, "java");
		
		System.out.println(global.attributesGet(txtUserName,"value"));
		
		String data = null;
		System.out.println(global.titleGet(driver, data));
		
		WebElement textInPage = driver.findElement(By.xpath("//span[text()='Create an account']"));
		System.out.println(global.textGet(textInPage, data));
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		global.type(txtPassword, "hello");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Log In']"));
		global.btnClick(btnLogin);
		
		System.out.println(global.currentUrl(driver, data));
		
		global.refreshPage(driver);
		
		global.quitBrowser(driver);
	}

}
