package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L02BrowserMethods {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.qaclickacademy.com");//Get to hit the url
		System.out.println("The title is: " + driver.getTitle());
		System.out.println("The Page Source is: " + driver.getPageSource());
		System.out.println("The Page Current URL is: " + driver.getCurrentUrl());
		driver.close();
		
		
	}

}
