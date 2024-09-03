package com.Amazon.regestertest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;
import com.Amazon.generic.excelutility.ReadExcelFile;
import com.Amazon.generic.javautility.JavaUtility;
import com.Amazon.generic.pagerepository.Registerpage;
import com.Amazon.generic.webdriverutility.Webdriverutility;

public class register_test2 extends Baseclass {
	
	@Test
	public void registerdata() {
		String name=excelobj.readdata("Sheet", 1, 0);
		String email=excelobj.readdata("Sheet", 1, 1);
		String pass=excelobj.readdata("Sheet", 1, 2);
		String mobile=excelobj.readdata("Sheet", 1, 3);
		String feedback=excelobj.readdata("Sheet", 1, 5);
		
		
		//waiting statement
		javaobj.pauss(5000);
		
		//provide implicitly waite
		webdriverobj.waitUntilElementFound();
		
		//Verify Page Using Assert
		String exp_title = "LearningSelenium";
	    String act_title = webdriverobj.driver.getTitle();
		System.out.println(act_title);
				
		//step1: verify the register page		
	   Assert.assertEquals(act_title, exp_title,"verified registerpage");
				
	// Create Object for RegisterPage
   	Registerpage regpage = new Registerpage(webdriverobj.driver);
	boolean elementExpcondition=true;
	boolean elementactualcondition=regpage.getNameTextfield().isDisplayed();
	
	//spet2:verify the element
	Assert.assertEquals( elementExpcondition,elementactualcondition,"verified nametextfield webelement-it is displayed");
	
	
	//step3:perform action --clear
	regpage.getNameTextfield().clear();

	regpage.getNameTextfield().sendKeys(name);
	regpage.getEmailTextfield().sendKeys(email);
	regpage.getPwdTextfield().sendKeys(pass);
	regpage.getMobileTextfield().sendKeys(mobile);
	
	}

}
