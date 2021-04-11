package com.webdriver.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowserTest {
	
	static WebDriver driver;
	/**
	 * @author Navneet
	 * @Method LaunchBrowser
	 * @Desc This method is used to launch the browser and access the site
	 * @Input Parameters Browser Name
	 * @Output NA
	 * @DateCreated 11-Apr-2021
	 * @DateModified NA
	 * @param strBrowser
	 */
	public void LaunchBrowser(String strBrowser) {
		switch (strBrowser.toLowerCase().trim()) {
		case "ie": {
			System.setProperty("webdriver.ie.driver", ".\\browsers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		case "chrome": case "google":{
			System.setProperty("webdriver.chrome.driver", ".\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		case "ff":{
			System.setProperty("webdriver.gecko.driver", ".\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		
		case "edge":{
			System.setProperty("webdriver.edge.driver", ".\\browsers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}
			
		
		default:
			System.out.println("Invalid Browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://blazedemo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
	}

	public static void main(String[] args) {
		
		LaunchBrowserTest lbt = new LaunchBrowserTest();
		lbt.LaunchBrowser("edge");
		driver.quit();
	}

}
