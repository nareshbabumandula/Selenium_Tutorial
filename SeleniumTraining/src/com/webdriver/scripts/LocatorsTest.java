package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.mycontactform.com/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("(document.getElementsByTagName('input'))[0].value='Naresh'");
				
		driver.findElement(By.linkText("Sample Forms")).click();

		// Identifying the Subject text field with ID
		driver.findElement(By.id("subject")).sendKeys("Test Subject");
		Thread.sleep(2000);
		driver.findElement(By.id("subject")).clear();

		// Identifying the Subject text field with CSS Selector starts with function
		driver.findElement(By.cssSelector("input[id^='sub']")).sendKeys("Test Subject_1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='sub']")).clear();

		// Identifying the Subject text field with CSS Selector ends with function
		driver.findElement(By.cssSelector("input[id$='ject']")).sendKeys("Test Subject_2");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id$='ject']")).clear();

		// Identifying the Subject text field with CSS Selector Contains function
		driver.findElement(By.cssSelector("input[id*='subject']")).sendKeys("Test Subject_3");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id*='subject']")).clear();

		// Identifying the Subject text field with XPath with start-with function
		driver.findElement(By.xpath("//input[starts-with(@id,'subj')]")).sendKeys("Test Subject_4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'subj')]")).clear();
	
		// Identifying the Subject text field with XPath with contains function
		driver.findElement(By.xpath("//input[contains(@id,'subject')]")).sendKeys("Test Subject_5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'subject')]")).clear();
				
		driver.findElement(By.xpath("//input[@id='email']/preceding::tr/../tr[2]/td/input")).sendKeys("Test Subject_6");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
