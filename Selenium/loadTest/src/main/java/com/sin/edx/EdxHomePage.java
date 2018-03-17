package com.sin.edx;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EdxHomePage extends EdxBasePage{
	
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a/img")
			WebElement logo;
	@FindBy(xpath="//*[@id=\"page\"]/header/div/div/div/div[3]/nav/a[1]")
			WebElement signinBtn;
	@FindBy(xpath="//*[@id=\"page\"]/header/div/div/div/div[3]/nav/a[2]")
			WebElement registerBtn;
	@FindBy(id="home-hero")
			WebElement searchText;
	@FindBy(id="edit-submit-home-hero")
			WebElement searchBtn;
	@FindBy(css="#main-content > section > div.featured-products > a")
			WebElement browseCourseBtn;

	public String verifyNavigation() {
		return logo.getAttribute("alt");
	}
	public void clickLoginBtn() {
		signinBtn.click();
	}
}
