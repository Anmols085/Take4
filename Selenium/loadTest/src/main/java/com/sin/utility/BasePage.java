package com.sin.utility;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}
}
