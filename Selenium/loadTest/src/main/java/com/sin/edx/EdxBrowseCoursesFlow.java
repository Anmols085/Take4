package com.sin.edx;

public class EdxBrowseCoursesFlow {
	
	EdxHomePage homePage = null;
	EdxValidation validateNavigation = null;
	EdxBrowseCoursePage CoursePage = null;

	public void navigateToBrowseCourse() {
		
		homePage = new EdxHomePage();
		validateNavigation = new EdxValidation();
		CoursePage = new EdxBrowseCoursePage();
		homePage.searchCourse("Selenium");
		homePage.clickSearchBtn();
		validateNavigation.verifyBrowsePageHeading(CoursePage);
	}
}
