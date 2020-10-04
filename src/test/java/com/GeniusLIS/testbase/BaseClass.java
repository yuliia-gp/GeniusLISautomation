package com.GeniusLIS.testbase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.GeniusLIS.utils.ConfigsReader;
import com.GeniusLIS.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;





public class BaseClass {

	
	public static WebDriver driver;


	public static void setUp() {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox" : 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari" :
			driver  = new SafariDriver();
			break;
		default : 
			System.err.println("Browser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		
		driver.get(ConfigsReader.getProperty("URL"));
		
	}
	

	public static void closeBrowser() {
		if(driver!= null) {
			driver.quit();
		}
	}
	
}
