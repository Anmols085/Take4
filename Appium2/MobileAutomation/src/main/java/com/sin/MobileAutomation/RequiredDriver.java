package com.sin.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@SuppressWarnings("rawtypes")
public class RequiredDriver {
	
	public static AndroidDriver getDriverInstance(String str) throws MalformedURLException {
		AndroidDriver driver = null;
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				BuildDesiredCapabilities.getCapabilities(str));
		return driver;
	}
}
