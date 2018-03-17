package com.sin.scenario;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sin.edx.EdxLoginFlow;
import com.sin.utility.BasePage;

public class Test002 {

    private WebDriver driver;
    private EdxLoginFlow loginToEdx = null;

    @BeforeClass
    public void beforeClass() {
    	System.setProperty("webdriver.chrome.driver", 
    			"src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        BasePage.setDriver(driver);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void verifySearchButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        String search_text = "Googl Search";
        WebElement search_button = driver.findElement(By.name("btnK"));
        String text = search_button.getAttribute("value");
        Assert.assertNotEquals(text, search_text, "Text not found!");
    }
    
    @Test(dependsOnMethods = {"verifySearchButton"})
    public void loginEdx() {
    	
    	loginToEdx = new EdxLoginFlow();
    	driver.get("https://www.edx.org/");
    	loginToEdx.navigateToLoginPage();
    }
}
