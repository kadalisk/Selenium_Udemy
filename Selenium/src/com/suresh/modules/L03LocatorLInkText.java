package com.suresh.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L03LocatorLInkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login");//Get to hit the url
		driver.findElement(By.linkText("Forgot password")).click();

		//driver.close();
	}

}
