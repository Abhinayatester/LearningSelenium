package com.Amazon.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsproduct3 {
	@Test(invocationCount = 2,groups = "ft")
	public void addproduct() {
		Reporter.log("addproduct-kids product-3 successfully ",true);
	}
	
	@Test(invocationCount = 2,groups ="it")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product-3 successfully ",true);
	}
	
	@Test(groups ="sm")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product-3 successfully ",true);
	}

}
