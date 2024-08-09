package com.Amazon.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class kidsproduct2 {
	@Test(invocationCount = 2,groups ="ft")
	public void addproduct() {
		Reporter.log("addproduct-kids product-2 successfully ",true);
	}
	
	@Test(invocationCount = 2,groups ="it")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product-2 successfully ",true);
	}
	
	@Test(invocationCount = 2,groups ="sm")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product-2 successfully ",true);
	}

}
