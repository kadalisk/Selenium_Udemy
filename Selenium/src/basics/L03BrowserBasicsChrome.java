package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03BrowserBasicsChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SureshKumarKadali\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com");//Get to hit the url
		System.out.println("The title is: " + driver.getTitle());
		System.out.println("The Page Source is: " + driver.getPageSource());
		System.out.println("The Page Current URL is: " + driver.getCurrentUrl());
		driver.close();
		
		
	}

}