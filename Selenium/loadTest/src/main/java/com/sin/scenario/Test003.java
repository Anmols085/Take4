package com.sin.scenario;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.sin.edx.EdxBrowseCoursesFlow;
import com.sin.edx.EdxValidation;
import com.sin.utility.BasePage;

public class Test003 {
	
	private EdxBrowseCoursesFlow homePage = null;
	EdxValidation validateNavigation = null;;

	@Test
	public void browseCourses() {

		BasePage.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Inside test003");
		homePage = new EdxBrowseCoursesFlow();
		BasePage.getDriver().get("https://www.edx.org/");
		homePage.navigateToBrowseCourse();
	}
}
