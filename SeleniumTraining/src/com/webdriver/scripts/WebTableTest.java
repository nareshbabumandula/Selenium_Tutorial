package com.webdriver.scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit Wait

		driver.get("https://en.wikipedia.org/wiki/List_of_special_economic_zones_in_India");
		List<WebElement> columns = driver.findElements(By.xpath("//caption[contains(text(),'November')]/../thead/tr/th"));
		
		// For each loop
		for (WebElement column : columns) {
			System.out.println(column.getText());
		}
		
		// Lambda Expression
		columns.forEach((column)->System.out.println(column.getText()));

	}

}
