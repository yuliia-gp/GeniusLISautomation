package com.GeniusLIS.steps;



import com.GeniusLIS.pages.SignUpPageElements;
import com.GeniusLIS.testbase.PageInitializer;
import com.GeniusLIS.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUp extends PageInitializer {

	SignUpPageElements signUp = new SignUpPageElements();

	// -----------------Teacher Sign Up-------------------------
	@Given("User is on the GeniusLIS Home Page")
	public void user_is_on_the_GeniusLIS_signUp_page() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("User signs up as a Teacher")
	public void user_signs_up_as_a_Teacher() {
		CommonMethods.jsClick(homePageElements.homePageSignUpButton);
		CommonMethods.jsClick(signUpPageElements.teacherAcountBtn);
		signUpPageElements.birthYear.sendKeys("1997");
		signUpPageElements.username.sendKeys("TeacherAccMolu");
		signUpPageElements.password.sendKeys("123123");
		signUpPageElements.confirm_password.sendKeys("123123");
		CommonMethods.jsClick(signUpPageElements.checkButn1);
		signUpPageElements.emailAddress.sendKeys("teacher1216@gmail.com");
		CommonMethods.jsClick(signUpPageElements.joinbtn);

	}

	@Then("User should be successfully sign in")
	public void user_should_be_successfully_sign_in() {
		String text = driver.getTitle();
		System.out.println(text);
	}

	// ------------------School Staff Sign Up-------------
	@When("User signs up as a School Staff")
	public void user_signs_up_as_a_School_Staff() {
		CommonMethods.jsClick(homePageElements.homePageSignUpButton);
		CommonMethods.jsClick(signUpPageElements.schoolStuffBtn);
		signUpPageElements.birthYear.sendKeys("1998");
		signUpPageElements.username.sendKeys("SchoolStafmbApcMira");
		signUpPageElements.password.sendKeys("123123");
		signUpPageElements.confirm_password.sendKeys("123123");
		CommonMethods.jsClick(signUpPageElements.checkButn1);
		signUpPageElements.emailAddress.sendKeys("schoolStaffmc@gmail.com");
		CommonMethods.jsClick(signUpPageElements.joinbtn);

	}

	// ---------------Dictrict Staff----------
	@When("User signs up as a Dictrict Staff")
	public void user_signs_up_as_a_Dictrict_Staff() {
		CommonMethods.jsClick(homePageElements.homePageSignUpButton);
		CommonMethods.jsClick(signUpPageElements.dictrictStuff);
		signUpPageElements.birthYear.sendKeys("1999");
		signUpPageElements.username.sendKeys("DictrictAccKil");
		signUpPageElements.password.sendKeys("123123");
		signUpPageElements.confirm_password.sendKeys("123123");
		CommonMethods.jsClick(signUpPageElements.checkButn1);
		signUpPageElements.emailAddress.sendKeys("Dictrict1212@gmail.com");
		CommonMethods.jsClick(signUpPageElements.joinbtn);
	}

	// ------------College/University-----------
	@When("User signs up as a College\\/University Staff")
	public void user_signs_up_as_a_College_University_Staff() {
		CommonMethods.jsClick(homePageElements.homePageSignUpButton);
		CommonMethods.jsClick(signUpPageElements.college_universityStuffBtn);
		signUpPageElements.birthYear.sendKeys("2000");
		signUpPageElements.username.sendKeys("CollegeUn45ntTest");
		signUpPageElements.password.sendKeys("123123");
		signUpPageElements.confirm_password.sendKeys("123123");
		CommonMethods.jsClick(signUpPageElements.checkButn1);
		signUpPageElements.emailAddress.sendKeys("collegeuniv212@gmail.com");
		CommonMethods.jsClick(signUpPageElements.joinbtn);
	}
}
