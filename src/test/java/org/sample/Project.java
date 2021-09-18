package org.sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Project extends BaseClass {
	
public static void main(String[] args) {
	
	firefox();
	
	launchBrowser("https://en-gb.facebook.com/");
	
	closeBrowser();
	
	
}

}
