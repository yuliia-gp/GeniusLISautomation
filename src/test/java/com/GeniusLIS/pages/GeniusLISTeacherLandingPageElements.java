package com.GeniusLIS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeniusLIS.utils.CommonMethods;

public class GeniusLISTeacherLandingPageElements extends CommonMethods{

	/** My Classes Text */
		@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div/div[1]")
		public WebElement myClassesText;
		
		@FindBy(xpath = "//*[@id='root']/div[1]/div[2]/div[1]/nav/ol")
		public WebElement myClassTeacher;
		

		
		
		
		
		
		
		
		
		
		
		
		
		public GeniusLISTeacherLandingPageElements() {
			
			
			PageFactory.initElements(driver, this);
		}
		
	

}
