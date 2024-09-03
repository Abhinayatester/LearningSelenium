package com.Amazon.generic.common;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.Amazon.generic.propertyutility.ReadpropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends ObjectUtility {

	@BeforeMethod
	public void login() {
		Reporter.log("login Sucessful", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Sucessful", true);

	}

	@Parameters("browser")
	@BeforeClass
	public void browserSetup(String bname) {

		// create object for all
		objectcreation();

		// launch browser
		webdriverobj.launchBrowser(bname);

		// Fetch data
		String url = propertyobj.readdata("url");

		// Navigate to the Application via URL
		webdriverobj.navigateToApp(url);

		Reporter.log("BrowserSetup Sucessful", true);

	}

	@AfterClass
	public void closebrowser() {
		// Close The Browser
		webdriverobj.quitAllWindows();
		Reporter.log("Closebrowser Sucessful", true);

	}

	@BeforeTest
	public void precondition() {
		Reporter.log("precondition Done Sucessful", true);

	}

	@AfterTest
	public void postcondition() {
		Reporter.log("postcondition Done Sucessful", true);

	}

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("Get SuiteConnections Done Sucessful", true);
	}

	@AfterSuite
	public void terminateSuiteconnection() {
		Reporter.log("Terminate Suiteconnection Done Sucessful", true);

	}
}
