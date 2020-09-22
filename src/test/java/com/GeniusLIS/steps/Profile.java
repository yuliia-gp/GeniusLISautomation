package com.GeniusLIS.steps;

import org.openqa.selenium.By;

import com.GeniusLIS.pages.LoginPageElements;

import com.GeniusLIS.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Profile extends CommonMethods {

	//ProfileElements profile = new ProfileElements();
	LoginPageElements signUp = new LoginPageElements();

	@Given("User click on Profile")
	public void user_click_on_Profile() {
		jsClick(driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/div/div[2]/ul/li[1]")));
	
	}

	@Then("User is able to edit profile")
	public void user_is_able_to_edit_profile() throws InterruptedException {
		Thread.sleep(3000);
	   jsClick(driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div/div[1]/button")));
	   Thread.sleep(2000);
	  // profile.firstName.sendKeys("Yuliia");
	   //profile.lastname.sendKeys("Hudzenko");
	   //selectDropdownByText(profile.extensions, "MD");
	  // profile.email.sendKeys("yhudzenko1166@gmail.com");
	  // profile.about.sendKeys("Child Specialist");
	  // profile.phoneNumber.sendKeys("7034567890");
	  // profile.npi.sendKeys("1234567891");
	  // selectDropdownByText(profile.sex, "Male");
	   //selectDropdownByText(profile.languages, "English");
	   
	}

	@When("User save changes")
	public void user_save_changes() {
	    
	}


}
