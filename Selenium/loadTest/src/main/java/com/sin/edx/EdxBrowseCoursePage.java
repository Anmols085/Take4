package com.sin.edx;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sin.utility.InitBasePage;

public class EdxBrowseCoursePage extends InitBasePage {

	@FindBy(xpath = "//*[@id=\"content\"]/header/h2[1]")
	WebElement resultMessage;
	@FindBy(xpath = "//*[@id=\"search-results-section\"]/div[2]/div/button[1]/span[1]")
	WebElement gridView;
	@FindBy(xpath = "//*[@id=\"search-results-section\"]/div[2]/div/button[2]")
	WebElement listView;
	@FindBy(id = "search-filter-section")
	WebElement searchFilterHeading;

}
