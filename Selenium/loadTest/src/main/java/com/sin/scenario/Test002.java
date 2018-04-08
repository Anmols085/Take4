package com.sin.scenario;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.sin.edx.EdxLoginFlow;
import com.sin.utility.BasePage;

public class Test002 {

    private EdxLoginFlow loginToEdx = null;
    private BasePage baseTest = new BasePage();

    @BeforeSuite
    public void beforeSuite() {
    	baseTest.generateWebDriver("Chrome");
    }

    @AfterSuite
    public void afterClass() {
    	baseTest.quitDriver();
    }

    @Test	//Verify Google home page
    public void verifySearchButton() {

    	System.out.println("Inside test002, Google section");
    	baseTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	baseTest.getDriver().get("http://www.google.com");
        String search_text = "Googl Search";
        WebElement search_button = baseTest.getDriver().findElement(By.name("btnK"));
        String text = search_button.getAttribute("value");
        Assert.assertNotEquals(text, search_text, "Text not found!");
    }
    
    @Test	//Verify login error message from EDX
    	(dependsOnMethods = {"verifySearchButton"})
    public void loginEdx() {

    	System.out.println("Inside test002, Edx section");
    	loginToEdx = new EdxLoginFlow();
    	baseTest.getDriver().get("https://www.edx.org/");
    	loginToEdx.navigateToLoginPage();
    }
}
