package com.GeniusLIS.testbase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.GeniusLIS.utils.ConfigsReader;
import com.GeniusLIS.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);

		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			if (Constants.EXECUTION_PLATFORM.equalsIgnoreCase("jenkins")) {
				MutableCapabilities sauceOptions = new MutableCapabilities();

				ChromeOptions browserOptions = new ChromeOptions();
				browserOptions.setExperimentalOption("w3c", true);
				browserOptions.setCapability("platformName", "macOS 10.15");
				browserOptions.setCapability("browserVersion", "latest");
				browserOptions.setCapability("sauce:options", sauceOptions);
				String username = "yuliiahz";
				try {
					driver = new RemoteWebDriver(new URL(
							"https://yuliiahz:f6e556b2-e80c-45b6-9dd3-7c6f78e64a3d@ondemand.us-west-1.saucelabs.com:443/wd/hub"),
							browserOptions);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			} else if (Constants.EXECUTION_PLATFORM.equalsIgnoreCase("local")) {
				driver = new ChromeDriver();
				break;
			}
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.err.println("Browser is not supported");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);

		driver.get(ConfigsReader.getProperty("URL"));

	}

	public static void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
