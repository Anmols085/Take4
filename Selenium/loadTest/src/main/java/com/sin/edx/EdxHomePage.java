package com.sin.edx;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sin.utility.InitBasePage;

public class EdxHomePage extends InitBasePage{
	
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a/img")
			WebElement logo;
	@FindBy(xpath="//*[@id=\"page\"]/header/div/div/div/div[3]/nav/a[1]")
			WebElement signinBtn;
	@FindBy(xpath="//*[@id=\"page\"]/header/div/div/div/div[3]/nav/a[2]")
			WebElement registerBtn;
	@FindBy(className="search-bar-label")
	WebElement searchTab;
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
	public String getSearchText() {
		System.out.println(searchTab.getText());
		return searchTab.getText();
	}
	public void searchCourse(String course) {
		System.out.println("Sending keys");
		searchText.sendKeys(course);
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
}
