package com.sin.utility;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;

import com.sin.beans.PropertyBean;

public class GetDesiredDrivers {

	private PropertyBean properties = new PropertyBean();
	Proxy proxy = new Proxy();
	String PROXY = properties.getProperty("ProxyUrl");

	public WebDriver generateChromeInstance() {
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		options.addArguments("--start-maximized");
		proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
		//options.setCapability(CapabilityType.PROXY, proxy);
		return new ChromeDriver(options);
	}
}