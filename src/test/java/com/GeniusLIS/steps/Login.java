package com.GeniusLIS.steps;

import org.openqa.selenium.By;

import com.GeniusLIS.pages.LoginPageElements;
import com.GeniusLIS.utils.CommonMethods;

import cucumber.api.java.en.*;

public class Login extends CommonMethods{
	
	LoginPageElements signUp = new LoginPageElements();

	@Given("User is on the GeniusLIS signUp page")
	public void user_is_on_the_GeniusLIS_signUp_page() {
		String title = driver.getTitle();
		 System.out.println(title);
	}

	

	@When("User signs up")
	public void user_signs_in() throws InterruptedException {
		
		Thread.sleep(5000);
		
		jsClick(driver.findElement(By.xpath("//*[@id='root']/nav/div[1]/div[2]/button")));
		signUp.firstname.sendKeys("");
		signUp.lastName.sendKeys("Hudzenko");
		signUp.email.sendKeys("yuliia3@geniusplaza.com");
		signUp.password.sendKeys("123123");
		driver.findElement(By.xpath("//*[@id='root']/div[3]/div[1]/div/div[2]/form/div[5]/button")).click();
		
	}

	@Then("User should be successfully sign in")
	public void user_should_be_successfully_sign_in() {
	  String text = driver.getTitle();
	  System.out.println(text);
	}

	
	
	


	@When("User is logs in")
	public void user_is_logs_in() {
	  jsClick(driver.findElement(By.xpath("//*[@id='root']/nav/div[1]/div[2]/button")));
	  signUp.usernameLogIn.sendKeys("dictrictest");
	  signUp.passwordLogIn.sendKeys("12345678");
	  signUp.loginBtn.click();
	}

	@Then("User should be successfully log in")
	public void user_should_be_successfully_log_in() {
	  String text = driver.getTitle();
	  System.out.println(text);
	}





	
}
