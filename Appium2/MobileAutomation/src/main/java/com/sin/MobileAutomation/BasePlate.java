package com.sin.MobileAutomation;

import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("rawtypes")
public class BasePlate 
{
	protected static AndroidDriver androidDriver;

	public static AndroidDriver getAndroidDriver() {
		return androidDriver;
	}
	public static void quitAndroidDriver(AndroidDriver androidDriver) {
		androidDriver.quit();
	}
	public static void main(String[] str) throws InterruptedException {
		launchDriver("Amazon");
		Thread.sleep(10000);
		quitAndroidDriver(androidDriver);
	}
	public static AndroidDriver launchDriver(String applicationName) {
		try {
		androidDriver = (AndroidDriver) RequiredDriver.getDriverInstance(applicationName);
		}catch (Exception e) {
			System.out.println("Did not work");
		}
		return androidDriver;
	}
}
