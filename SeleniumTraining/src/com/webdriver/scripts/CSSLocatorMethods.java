package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorMethods {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://guide.blazemeter.com/hc/en-us");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#categories>li:first-of-type")).click();
		Thread.sleep(3000);
		String strWaterMark  = driver.findElement(By.id("query")).getAttribute("placeholder");
		
		if (strWaterMark.contains("Enter a search term...")) {
			System.out.println("Watermark in Search textbox is displayed as : " + strWaterMark);
		} else {
			System.out.println("Expected watermark - Enter a search term... is not matching with the actual watermark - " + strWaterMark);
		}
				
		driver.quit();
	}

}
