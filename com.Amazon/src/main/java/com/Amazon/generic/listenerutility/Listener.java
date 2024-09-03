package com.Amazon.generic.listenerutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Amazon.generic.common.Baseclass;
import com.Amazon.generic.webdriverutility.Webdriverutility;

public class Listener extends Baseclass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		
		Reporter.log("TACKING SCREEN SHOT-STARTED--->"+name,true);
		//perform typecasting-webdriver to 
		TakesScreenshot tsref=(TakesScreenshot)webdriverobj.static_driver;
		File temp=tsref.getScreenshotAs(OutputType.FILE);
		File parameter=new File("./src/test/resources/Screenshot"+name+".png");
		try {
			FileHandler.copy(temp, parameter);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Reporter.log("TACKING SCREEN SHOT-COMPLITED--->"+name,true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
