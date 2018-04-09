package com.sin.scenario;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sin.edx.EdxBrowseCoursesFlow;
import com.sin.edx.EdxValidation;
import com.sin.utility.BasePage;

public class Test003 {
	
	private EdxBrowseCoursesFlow homePage = null;
	EdxValidation validateNavigation = null;
	BasePage baseTest= new BasePage();
	
	@BeforeClass
	public void printName() {
		System.out.println("Test003 in play");
	}

	@Test
	public void browseCourses() {

		baseTest.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Inside test003");
		homePage = new EdxBrowseCoursesFlow();
		baseTest.getDriver().get("https://www.edx.org/");
		homePage.navigateToBrowseCourse();
	}
}
