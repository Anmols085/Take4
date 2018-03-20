package com.sin.edx;

import org.testng.Assert;

public class EdxValidation {
	
	String homePageString = "edX Home Page";
	String loginPageHeading = "Sign In";
	String searchBtn = "Search";
	String loginErrorMessage = "We couldn't sign you in.";
	
	public void validateHomePageLogo(EdxHomePage homePage){
		Assert.assertEquals(homePage.verifyNavigation(),homePageString,"String not found");
	}
	
	public void validateLoginPageHeading(EdxLoginPage homePage){
		Assert.assertEquals(homePage.verifyNavigation(),loginPageHeading,"String not found");
	}
	
	public void validateLoginFailure(EdxLoginPage homePage) {
		Assert.assertEquals(homePage.verifyLoginFailure(), loginErrorMessage, "String not found");
	}

	public void verifySearchButton(EdxHomePage homePage) {
		Assert.assertEquals(homePage.getSearchText(), searchBtn, "String not found");
	}

	public void verifyBrowsePageHeading(EdxBrowseCoursePage coursePage) {
		// TODO Auto-generated method stub
		
	}
}
