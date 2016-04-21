package com.suresh.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L39DynamicRadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.utexas.edu/learn/forms/radio.html");
		int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
		for(int i=0; i<count; i++){			
			String text = driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			System.out.println(text);
			if (text == "Miss")
			{
				System.out.println(text);
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			}
		}
	}
	
}