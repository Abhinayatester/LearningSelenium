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

public class Baseclass extends ObjectUtility{
	public static WebDriver driver = null;
	WebDriver driver1 ;
	@DataProvider(name ="Registerdata")
	public String[][] Registerdata()
	{
		String[][] data=new String[3][3];
		data[0][0]="Abhi";
		data[0][1]="101";
		data[0][2]="Testing";
	
		data[1][0]="vasu";
		data[1][1]="102";
		data[1][2]="Devoleper";
		
		data[2][0]="ram";
		data[2][1]="103";
		data[2][2]="finance";
		
		return data;	
	}

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
	
		// if User gives browsername="chrome"
		if (bname.equals("chrome"))
		{
			// Launch the Browser-Chrome
			driver = new ChromeDriver();
		}
		// if User gives browsername="firefox"
		else if (bname.equals("firefox")) {
			// Launch the Browser-Firefox
			driver = new FirefoxDriver();
		}
		// if User gives browsername="edge"
		else if (bname.equals("edge")) {
			// Launch the Browser-Edge
			driver = new EdgeDriver();
		}
		else {
			System.out.println("U have Enter the InValid Browser Name and Im Executing DefaultBrowser ");
		    driver = new ChromeDriver();
		}
		
//		//Create Object for Property File
//		ReadpropertyFile p_ref = new ReadpropertyFile();
		
		// create object for all
		objectcreation();
		
		//Fetch data
		String	url = propertyobj.readdata("url");
		
//			URL = p_ref.readdata("url");
//			p_ref.displaydata("url");
//			p_ref.writedata("email", "testing@gmail.com");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// Navigate to the Application via URL
		driver.get(url);

		Reporter.log("BrowserSetup Sucessful", true);

	}

	@AfterClass
	public void closebrowser() {
		// Close The Browser
		driver.close();
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
