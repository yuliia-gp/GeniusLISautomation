package com.GeniusLIS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeniusLIS.utils.CommonMethods;

public class HomePageElements extends CommonMethods {

	@FindBy(xpath = "//*[@id='root']/nav/div[1]/div[2]/button")
	public WebElement homePageLoginButton;

	@FindBy(xpath = "//*[@id='root']/nav/div[1]/div[1]/button")
	public WebElement homePageSignUpButton;

	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}

}
