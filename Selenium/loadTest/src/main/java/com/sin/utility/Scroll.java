package com.sin.utility;

import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends BasePage {

	public void scrollPage() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");
		// This will scroll the web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
