package com.GeniusLIS.testbase;

import com.GeniusLIS.pages.GeniusLISTeacherLandingPageElements;
import com.GeniusLIS.pages.HomePageElements;
import com.GeniusLIS.pages.LoginPageElements;
import com.GeniusLIS.pages.SignUpPageElements;

public class PageInitializer extends BaseClass { 

	// declare protected static variables of types of all the pages
	
	
	protected static LoginPageElements loginPageElements;

	protected static HomePageElements homePageElements;
	
	protected static GeniusLISTeacherLandingPageElements geniusLISTeacherLandingPageElements;
	
	protected static SignUpPageElements signUpPageElements;
	
	public static void initializeAllPages() {
		
		// create instances of all pages and assign them to the variables
		
		loginPageElements = new LoginPageElements();
		homePageElements = new HomePageElements();
		geniusLISTeacherLandingPageElements = new GeniusLISTeacherLandingPageElements();
		signUpPageElements = new SignUpPageElements();
	}
	
}
