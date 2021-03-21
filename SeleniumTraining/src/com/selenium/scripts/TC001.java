package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.findElement(By.cssSelector("input#user")).sendKeys("navneet");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Secure*1234");
		Thread.sleep(4000);
		driver.quit();

	}

}
