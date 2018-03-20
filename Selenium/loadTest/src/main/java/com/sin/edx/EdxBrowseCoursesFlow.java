package com.sin.edx;

public class EdxBrowseCoursesFlow {
	
	EdxHomePage homePage = null;
	EdxValidation validateNavigation = null;
	EdxBrowseCoursePage CoursePage = null;

	public void navigateToBrowseCourse() {
		
		homePage = new EdxHomePage();
		validateNavigation = new EdxValidation();
		System.out.println("Inside navigate to Browse Course section");
		CoursePage = new EdxBrowseCoursePage();
		System.out.println("Inside navigate to Browse Course section");
		//validateNavigation.verifySearchButton(homePage);
		System.out.println("Inside navigate to Browse Course section");
		homePage.searchCourse("Selenium");
		homePage.clickSearchBtn();
		validateNavigation.verifyBrowsePageHeading(CoursePage);
	}
}