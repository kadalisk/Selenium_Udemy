package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L02Locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");//Get to hit the url
		driver.findElement(By.id("email")).sendKeys("Test1234");
		driver.findElement(By.name("pass")).sendKeys("kdkljaldf");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

		//driver.close();
	}

}