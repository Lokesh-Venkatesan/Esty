package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void chrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
public static void firefox() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	
}
	public static void launchBrowser(String url) {

driver.get(url);
		
	}
	
	public static void closeBrowser() {

		driver.close();
		
	}
	
	
}
