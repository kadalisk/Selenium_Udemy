package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L01Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.qaclickacademy.com");//Get to hit the url
		driver.findElement(By.xpath(".//*[@id='teacher-form']/button")).click();

		//driver.close();
	}

}
