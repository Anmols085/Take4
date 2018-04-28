package com.sin.edx;

import com.sin.beans.PropertyBean;

public class EdxLoginFlow {
	
	EdxHomePage homePage = null;
	EdxValidation validateNavigation = null;
	EdxLoginPage loginPage = null;
	private PropertyBean properties = new PropertyBean();
	
	public void navigateToLoginPage() {
		
		homePage = new EdxHomePage();
		validateNavigation = new EdxValidation();
		loginPage = new EdxLoginPage();
		validateNavigation.validateHomePageLogo(homePage);
		homePage.clickLoginBtn();
		validateNavigation.validateLoginPageHeading(loginPage);
		loginPage.enterID(properties.getProperty("EdxLoginID"));
		loginPage.enterPassword("1234");
		loginPage.clickSigninBtn();
		//Thread.sleep(10000);
		validateNavigation.validateLoginFailure(loginPage);
	}
}
