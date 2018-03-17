package com.sin.scenario;

import org.testng.annotations.Test;

import com.sin.edx.EdxLoginFlow;
import com.sin.utility.BasePage;

import org.openqa.selenium.WebDriver;

public class Test003 {
	
	private EdxLoginFlow loginToEdx = null;

	@Test
	public void loginEdx() {

		WebDriver driver = BasePage.getDriver();
		loginToEdx = new EdxLoginFlow();
		driver.get("https://www.edx.org/");
		loginToEdx.navigateToLoginPage();
	}

}