package com.suresh.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L38RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.utexas.edu/learn/forms/radio.html");
		
		for(int i=1; i<11; i++){

		
		driver.findElement(By.xpath("//input[@id='mr']")).click();
		driver.findElement(By.xpath("//input[@id='mrs']")).click();
		driver.findElement(By.xpath("//input[@id='miss']")).click();
		driver.findElement(By.xpath("//input[@id='ms']")).click();
		driver.findElement(By.xpath("//input[@id='dr']")).click();
		
		}
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		
		
	}
	
}