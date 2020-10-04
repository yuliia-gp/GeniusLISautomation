package com.GeniusLIS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeniusLIS.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id='root']/nav/div[1]/div[2]/button")
	public WebElement logIn;

	@FindBy(name = "username")
	public WebElement usernameLogIn;

	@FindBy(name = "password")
	public WebElement passwordLogIn;

	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/div/div/form/div[3]/button")
	public WebElement loginBtn;

	public LoginPageElements() {

		PageFactory.initElements(driver, this);
	}

}
