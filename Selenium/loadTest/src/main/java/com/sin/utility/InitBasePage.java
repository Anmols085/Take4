package com.sin.utility;

import org.openqa.selenium.support.PageFactory;

public class InitBasePage extends BasePage{
	public InitBasePage() {
		PageFactory.initElements(super.getDriver(), this);
	}
}
