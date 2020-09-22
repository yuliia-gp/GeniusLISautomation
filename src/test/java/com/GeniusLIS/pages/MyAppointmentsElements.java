package com.GeniusLIS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GeniusLIS.testbase.BaseClass;

public class MyAppointmentsElements {

	@FindBy(xpath = "//*[@id='root']/div[2]/div[1]/div/div[2]/ul/li[4]/p")
	public static WebElement myAppointments;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div")
	public static WebElement monthJune;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div[3]/div[4]")
	public static WebElement date17;
	
	@FindBy(xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[3]/div[3]/div[4]/div/div[1]")
	public static WebElement date;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div/div[3]/div[1]")
	public static WebElement lilyapp;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div[2]/div/div/div[4]/div[3]/div/div")
	public static WebElement addResults;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[2]/input")
	public static WebElement testType;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[4]/input")
	public static WebElement laboratory;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[3]/div[1]/input")
	public static WebElement lan;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[8]/textarea")
	public static WebElement comments;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div")
	public static WebElement calendar;
	
	@FindBy (xpath = "//*[@id='root']/div[2]/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div/div[1]/div")
	public static WebElement month;
	
	public MyAppointmentsElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
}
