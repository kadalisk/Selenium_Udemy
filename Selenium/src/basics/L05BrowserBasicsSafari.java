package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class L05BrowserBasicsSafari {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver", "C:\\SureshKumarKadali\\Software\\Selenium\\IEDriverServer.exe");

		WebDriver driver = new SafariDriver();
		
		driver.get("http://www.qaclickacademy.com");//Get to hit the url
		System.out.println("The title is: " + driver.getTitle());
		System.out.println("The Page Source is: " + driver.getPageSource());
		System.out.println("The Page Current URL is: " + driver.getCurrentUrl());
		//driver.close();
		
		
	}

}
