package com.GeniusLIS.steps;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import com.GeniusLIS.pages.LoginPageElements;
import com.GeniusLIS.pages.MyAppointmentsElements;
import com.GeniusLIS.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAppointment extends CommonMethods {

	LoginPageElements signUp = new LoginPageElements();
	MyAppointmentsElements appmnt = new MyAppointmentsElements();

	@Given("User clicks on My appointments")
	public void user_clicks_on_My_appointments() {
		jsClick(appmnt.myAppointments);
	}

	@Given("User choose an appointment")
	public void user_choose_an_appointment() throws InterruptedException {
		appmnt.date17.click();
		Thread.sleep(2000);
		appmnt.lilyapp.click();
		appmnt.addResults.click();

	}

	@When("User add negative result")
	public void user_add_negative_result() {
		selectDropdownByText(appmnt.testType, "ACA");
		appmnt.lan.sendKeys("LAB");
		appmnt.laboratory.sendKeys("Miama Lab");
		// need second calendar here

		WebElement radioBttn = driver
				.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[6]/div/div[2]/div[1]/div[1]"));
		radioBttn.click();

		appmnt.comments.sendKeys("Your test is negative");
	}

	@Then("User add positive test resalt")
	public void user_add_positive_test_resalt() {
		selectDropdownByText(appmnt.testType, "ACA");
		appmnt.lan.sendKeys("LABORATORY");
		appmnt.laboratory.sendKeys("Clinic ABC");
		// need second calendar here
		
		WebElement radioBttn = driver.findElement(By.xpath("//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[6]/div/div[2]/div[2]/div[1]"));
		radioBttn.click();
		
		appmnt.comments.sendKeys("Your test is positive");

	}
}
