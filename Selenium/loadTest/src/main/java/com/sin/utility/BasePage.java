package com.sin.utility;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected static WebDriver driver;
	private static GetDesiredDrivers getDriver = null;

	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}
	public static WebDriver generateWebDriver(String browser) {
		getDriver = new GetDesiredDrivers();
		if(browser.equalsIgnoreCase("Chrome")) driver = getDriver.generateChromeInstance();
		else if(browser.equalsIgnoreCase("Firefox"));
		else if(browser.equalsIgnoreCase("IE"));
		else if(browser.equalsIgnoreCase("Safari"));
		return driver;
	}
	public static void quitDriver() {
		driver.quit();
	}
}
