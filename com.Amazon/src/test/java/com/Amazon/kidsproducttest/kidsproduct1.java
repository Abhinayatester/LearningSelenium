package com.Amazon.kidsproducttest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsproduct1 {
	@Test(priority = 1,invocationCount =2 ,groups ="ft")
	public void addproduct() {
//		Assert.fail();
		Reporter.log("addproduct-kids product-1 successfully ",true);
	}
	
	@Test(priority = 2,dependsOnMethods = "addproduct",groups = "it")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product-1 successfully ",true);
	}
	
	@Test(priority = 3,dependsOnMethods = "addproduct",groups = "sm",enabled = false)
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product-1 successfully ",true);
	}

}
