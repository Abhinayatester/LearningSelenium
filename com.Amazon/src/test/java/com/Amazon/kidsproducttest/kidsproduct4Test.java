package com.Amazon.kidsproducttest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Amazon.generic.common.Baseclass;

public class kidsproduct4Test extends Baseclass {
	@Test(groups ="FT")
	public void addproduct() {
		Reporter.log("addproduct-kids product-4 successfully ",true);
	}
	
	@Test(groups ="IT")
	public void updateproduct() {
		Reporter.log("updateproduct-kids product4 successfully ",true);
	}
	
	@Test(groups ="ST")
	public void deleteproduct() {
		Reporter.log("deleteproduct-kids product4successfully ",true);
	}

}
