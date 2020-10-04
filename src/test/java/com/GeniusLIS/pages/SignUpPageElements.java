package com.GeniusLIS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeniusLIS.utils.CommonMethods;

public class SignUpPageElements extends CommonMethods{


	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/div/div[1]")
	public WebElement teacherAcountBtn;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div/div/div/div[2]")
	public WebElement schoolStuffBtn;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div/div/div/div[3]")
	public WebElement dictrictStuff;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div/div/div/div[4]")
	public WebElement college_universityStuffBtn;
	
	
	
	@FindBy(name = "birth_year")
	public WebElement birthYear;
	
	@FindBy(name ="username")
	public WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "confirm_password")
	public WebElement confirm_password;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/div/div/form/div[3]/div[1]/label/span")
	public WebElement checkButn1;
	
	@FindBy(name = "email")
	public WebElement emailAddress;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div/div/div/div/form/div[4]/button")
	public WebElement joinbtn;
	
	
	public SignUpPageElements() {
		PageFactory.initElements(driver, this);
}
}