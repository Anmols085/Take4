package com.sin.utility;

import org.openqa.selenium.WebDriver;

import com.sin.beans.PropertyBean;

public class BasePage {
	
	protected static WebDriver driver;
	private GetDesiredDrivers getDriver = null;

	public WebDriver getDriver() {
		return driver;
	}
/*	public void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}*/
	public WebDriver generateWebDriver(PropertyBean properties) {
		getDriver = new GetDesiredDrivers();
		String requiredDriver = properties.getProperty("Driver");
		if(requiredDriver.equalsIgnoreCase("Chrome")) driver = getDriver.generateChromeInstance();
		else if(requiredDriver.equalsIgnoreCase("Firefox"));
		else if(requiredDriver.equalsIgnoreCase("IE"));
		else if(requiredDriver.equalsIgnoreCase("Safari"));
		return driver;
	}
	public void quitDriver() {
		driver.quit();
	}
}
