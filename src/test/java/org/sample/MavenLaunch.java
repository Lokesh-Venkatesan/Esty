package org.sample;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenLaunch { public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	String c = driver.getCurrentUrl();
	System.out.println(c);

	String t = driver.getTitle();
	System.out.println(t);
	
	WebElement fb = driver.findElement(By.xpath("//input[@id='email']"));
	fb.sendKeys("Lokesh");
	
WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
pass.sendKeys("lokesh");
String l = pass.getAttribute("value");
System.out.println(l);

WebElement cl = driver.findElement(By.xpath("//button[@name='login']"));

cl.click();
			
}
	


}
