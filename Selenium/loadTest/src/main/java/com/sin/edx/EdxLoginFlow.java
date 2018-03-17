package com.sin.edx;

public class EdxLoginFlow {
	
	EdxHomePage homePage = null;
	EdxValidation validateNavigation = null;
	EdxLoginPage loginPage = null;
	
	public void navigateToLoginPage() {
		
		homePage = new EdxHomePage();
		validateNavigation = new EdxValidation();
		loginPage = new EdxLoginPage();
		validateNavigation.validateHomePageLogo(homePage);
		homePage.clickLoginBtn();
		validateNavigation.validateLoginPageHeading(loginPage);
		loginPage.enterID("anmols085@gmail.com");
		loginPage.enterPassword("1234");
		loginPage.clickSigninBtn();
		validateNavigation.validateLoginFailure(loginPage);
	}
}
