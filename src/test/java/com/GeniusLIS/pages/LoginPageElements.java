package com.GeniusLIS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeniusLIS.utils.CommonMethods;

public class LoginPageElements extends CommonMethods{

	
		//@FindBy(xpath = "//*[@id='root']/nav/div[1]/div[2]/button")
		//public static WebElement logIn;
		
		@FindBy(name = "firstName")
		public WebElement firstname;
		
	    @FindBy(name = "lastName")
	    public WebElement lastName;
	    
		@FindBy( name = "email")
		public WebElement email;
		
		@FindBy(name = "password")
		public WebElement password;
		
		@FindBy( linkText = "d3k2t9-7 hluMWJ btn btn-orange")
		public WebElement SignUp;
		
		
		
		
		@FindBy (xpath ="//*[@id='root']/nav/div[1]/div[2]/button")
		public WebElement logIn;

		@FindBy(name = "username")
		public WebElement usernameLogIn;
		
		@FindBy(name = "password")
		public WebElement passwordLogIn;
		
		@FindBy (xpath = "//*[@id='root']/div[2]/div/div/div/div/form/div[3]/button")
		public WebElement loginBtn;
		
		
		
		
		
		
		public LoginPageElements() {
			
			
			PageFactory.initElements(driver, this);
		}
		
	

}
