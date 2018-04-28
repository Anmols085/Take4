package com.sin.edx;

import org.testng.Assert;

import com.sin.beans.PropertyBean;
import com.sin.utility.Screenshots;

public class EdxValidation {
	
	private PropertyBean properties = new PropertyBean();
	Screenshots screenshot = new Screenshots();
	String homePageString = properties.getProperty("ExpectedEdxHomePageHeadingTestCase002");
	String loginPageHeading = properties.getProperty("ExpectedEdxLoginPageHeadingTestCase002");
	String searchBtn = properties.getProperty("ExpectedEdxSearchBtnTestCase002");
	String loginErrorMessage = properties.getProperty("ExpectedEdxLoginErrorMessageTestCase002");
	
	public void validateHomePageLogo(EdxHomePage homePage){
		screenshot.switchToFrame();
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
