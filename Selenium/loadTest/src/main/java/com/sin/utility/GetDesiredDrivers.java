package com.sin.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetDesiredDrivers {
	
	public WebDriver generateChromeInstance() {
		ChromeOptions options = new ChromeOptions();
    	System.setProperty("webdriver.chrome.driver", 
    			"src/main/resources/chromedriver.exe");
    	options.addArguments("--start-maximized");
        return new ChromeDriver(options);
	}
}
