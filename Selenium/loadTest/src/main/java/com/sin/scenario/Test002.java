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

    @BeforeSuite
    public void beforeSuite() {
        BasePage.generateWebDriver("Chrome");
    }

    @AfterSuite
    public void afterClass() {
    	BasePage.quitDriver();
    }

    @Test	//Verify Google home page
    public void verifySearchButton() {

        BasePage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.getDriver().get("http://www.google.com");
        String search_text = "Googl Search";
        WebElement search_button = BasePage.getDriver().findElement(By.name("btnK"));
        String text = search_button.getAttribute("value");
        Assert.assertNotEquals(text, search_text, "Text not found!");
    }
    
    @Test	//Verify login error message from EDX
    	(dependsOnMethods = {"verifySearchButton"})
    public void loginEdx() {

    	loginToEdx = new EdxLoginFlow();
    	BasePage.getDriver().get("https://www.edx.org/");
    	loginToEdx.navigateToLoginPage();
    }
}
