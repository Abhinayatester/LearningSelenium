package com.Amazon.kidsproducttest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;
@Listeners(com.Amazon.generic.listenerutility.Listener.class)
public class kidsproduct1Test extends Baseclass{
	@Test(priority = 1,groups ="FT")
	public void addproduct() {
//		Assert.fail();
		Reporter.log("addproduct-kids product-1 successfully ",true);
	}
	
	@Test(priority = 2,dependsOnMethods = "addproduct",groups = "IT")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product-1 successfully ",true);
	}
	
	@Test(priority = 3,dependsOnMethods = "addproduct",groups = "ST")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product-1 successfully ",true);
	}

}
