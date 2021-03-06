package com.sin.scenario;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.sin.beans.PropertyBean;
import com.sin.edx.EdxLoginFlow;
import com.sin.utility.BasePage;
import com.sin.utility.ReadPropertiesFile;
import com.sin.utility.Screenshots;

public class Test002 {

	private EdxLoginFlow loginToEdx = null;
	private BasePage baseTest = new BasePage();
	private PropertyBean properties = new PropertyBean();
	Screenshots screenshot = new Screenshots();
	private final static Logger logger = Logger.getLogger(Test002.class);

	@BeforeSuite
	public void beforeSuite() {
		try {
			PropertyBean.setProperties(ReadPropertiesFile.setProperties());
		} catch (Exception e) {
		}
		baseTest.generateWebDriver(properties);
	}

	@AfterSuite
	public void afterClass() {
		baseTest.quitDriver();
	}
	
	@BeforeClass
	public void printName() {
		System.out.println("Test002 in play");
		logger.info("Test002 in play");
	}

	@Test // Verify Google home page
	public void verifySearchButton() {

		System.out.println(properties.getProperty("favoriteFood"));
		System.out.println("Inside test002, Google section");
		baseTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseTest.getDriver().get(properties.getProperty("GoogleUrl"));
		String search_text = properties.getProperty("ExpectedGoogleHeadingTestCase002");
		WebElement search_button = baseTest.getDriver().findElement(By.name("btnK"));
		String text = search_button.getAttribute("value");
		screenshot.switchToFrame();
		Assert.assertNotEquals(text, search_text, "Text not found!");
	}

	@Test // Verify login error message from EDX
	(dependsOnMethods = { "verifySearchButton" })
	public void loginEdx(){

		System.out.println("Inside test002, Edx section");
		loginToEdx = new EdxLoginFlow();
		baseTest.getDriver().get(properties.getProperty("EdxUrl"));
		loginToEdx.navigateToLoginPage();
	}
}
