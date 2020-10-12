package com.GeniusLIS.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.GeniusLIS.pages.LoginPageElements;
import com.GeniusLIS.testbase.PageInitializer;
import com.GeniusLIS.utils.CommonMethods;

import cucumber.api.java.en.*;

public class Login extends PageInitializer {

	LoginPageElements logIn = new LoginPageElements();
	
	//-------------------School Staff-----------------

	@When("a School Staff User logs in with username {string} and password {string}")
	public void a_School_Staff_User_logs_in_with_username_and_password(String username, String password) {
		CommonMethods.jsClick(homePageElements.homePageLoginButton);
		loginPageElements.usernameLogIn.sendKeys(username);
		loginPageElements.passwordLogIn.sendKeys(password);
	    loginPageElements.loginBtn.click();
	}

	@Then("the School Staff User should be successfully logged in and sees {string}")
	public void the_School_Staff_User_should_be_successfully_logged_in(String MyClasses) {
		// Verifying text with assertion
		Assert.assertTrue(geniusLISTeacherLandingPageElements.myClassTeacher.getText().contentEquals(MyClasses));
	}

	// ------------------------Teacher-------------------------

	@When("a Teacher User logs in with username {string} and password {string}")
	public void a_Teacher_User_logs_in_with_username_and_password(String username, String password) {
		CommonMethods.jsClick(homePageElements.homePageLoginButton);
		loginPageElements.usernameLogIn.sendKeys(username);
		loginPageElements.passwordLogIn.sendKeys(password);
		loginPageElements.loginBtn.click();
	}

	@Then("the Teacher should be successfully log in and sees {string}")
	public void the_Teacher_should_be_successfully_log_in_and_sees(String myClasses) {
		// Verifying text with assertion
		Assert.assertTrue(geniusLISTeacherLandingPageElements.myClassTeacher.getText().contentEquals(myClasses));
	}
//----------------------------College_Uniwersity-------------------------
	@When("a College\\/University User logs in with username {string} and password {string}")
	public void a_College_University_User_logs_in_with_username_and_password(String username, String password) {
		CommonMethods.jsClick(homePageElements.homePageLoginButton);
		loginPageElements.usernameLogIn.sendKeys(username);
		loginPageElements.passwordLogIn.sendKeys(password);
		loginPageElements.loginBtn.click();
	}

	@Then("the College\\/University User should be successfully logged in and sees {string}")
	public void the_College_University_User_should_be_successfully_logged_in_and_sees(String myDistrict) {
		// Verifying text with assertion
		Assert.assertTrue(geniusLISTeacherLandingPageElements.myClassesText.getText().contentEquals(myDistrict));
}
	
	//------------------Dictrict----------------------------------
	
	@When("a Disctict Staff User logs in with username {string} and password {string}")
	public void a_Disctict_Staff_User_logs_in_with_username_and_password(String username, String password) {
		CommonMethods.jsClick(homePageElements.homePageLoginButton);
		loginPageElements.usernameLogIn.sendKeys(username);
		loginPageElements.passwordLogIn.sendKeys(password);
		loginPageElements.loginBtn.click();
	}

	@Then("the District Staff User should be successfully logged in and sees {string}")
	public void the_District_Staff_User_should_be_successfully_logged_in_and_sees(String myDistrict) {
		// Verifying text with assertion
				Assert.assertTrue(geniusLISTeacherLandingPageElements.myClassesText.getText().contentEquals(myDistrict));
}
}
