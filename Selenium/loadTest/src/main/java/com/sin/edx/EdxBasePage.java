package com.sin.edx;

import org.openqa.selenium.support.PageFactory;

import com.sin.utility.BasePage;

public class EdxBasePage extends BasePage{
	public EdxBasePage() {
		PageFactory.initElements(super.getDriver(), this);
	}
}