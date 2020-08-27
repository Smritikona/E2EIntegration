package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void tc_1(){
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();                   // Maximizing browser window
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.quit();
	}
}
